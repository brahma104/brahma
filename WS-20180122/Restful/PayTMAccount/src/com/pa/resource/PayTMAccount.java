package com.pa.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.pa.dto.Account;

@Path("/account")
public class PayTMAccount {
	private static Map<String, Account> accountDb = new ConcurrentHashMap<>();

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput createAccount(InputStream in)
			throws ParserConfigurationException, SAXException, IOException {
		Account account = null;
		AccountStreamingOutput accountOutput = null;

		account = newAccountFromStream(in);
		account.setAccountCreatedDate(new Date());
		account.setStatus("Active");
		account.setAccountNo(UUID.randomUUID().toString());
		accountDb.put(account.getMobileNo(), account);

		accountOutput = new AccountStreamingOutput(account);
		return accountOutput;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getAccount(@QueryParam("mobileNo") String mobileNo) {
		Account account = null;

		if (accountDb.containsKey(mobileNo)) {
			account = accountDb.get(mobileNo);
			return new AccountStreamingOutput(account);
		}
		return new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				os.write("Account not found".getBytes());
				os.close();
			}
		};
	}

	private Account newAccountFromStream(InputStream in)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document doc = null;
		Node rootNode = null;
		NodeList children = null;
		Account account = null;

		factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		doc = builder.parse(in);
		rootNode = doc.getFirstChild();
		account = new Account();

		children = rootNode.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			String nodeName = child.getNodeName();
			String nodeValue = child.getFirstChild().getNodeValue();
			if (nodeName != null && nodeName.trim().length() > 0) {
				if (nodeName.equals("mobileNo")) {
					account.setMobileNo(nodeValue);
				} else if (nodeName.equals("emailAddress")) {
					account.setEmailAddress(nodeValue);
				} else if (nodeName.equals("firstName")) {
					account.setFirstName(nodeValue);
				} else if (nodeName.equals("lastName")) {
					account.setLastName(nodeValue);
				} else if (nodeName.equals("pin")) {
					account.setPin(Integer.parseInt(nodeValue));
				} else if (nodeName.equals("adhaarNo")) {
					account.setAdhaarNo(nodeValue);
				} else if (nodeName.equals("panNo")) {
					account.setPanNo(nodeValue);
				}
			}
		}

		return account;
	}

	private final class AccountStreamingOutput implements StreamingOutput {
		private Account account;

		public AccountStreamingOutput(Account account) {
			this.account = account;
		}

		@Override
		public void write(OutputStream os) throws IOException, WebApplicationException {
			StringBuffer sb = null;

			sb = new StringBuffer();
			if (account != null) {
				sb.append("<account><mobileNo>").append(account.getMobileNo()).append("</mobileNo><emailAddress>")
						.append(account.getEmailAddress()).append("</emailAddress><display-name>")
						.append(account.getFirstName() + " " + account.getLastName()).append("</display-name><status>")
						.append(account.getStatus()).append("</status></account>");
				os.write(sb.toString().getBytes());
				os.close();
			}
		}

	}
}
