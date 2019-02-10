package com.dom.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PrintNode {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Dom\\resource\\po.xml"));
		
		Node root = doc.getFirstChild();
		//System.out.println(root.getNodeName());
		//System.out.println(root.getFirstChild().getNextSibling().getNodeName());
		/*Node node = root.getFirstChild().getNextSibling();
		if(node.getNodeType() == Node.ELEMENT_NODE) {
			Element elem = (Element) node;
			String value = elem.getAttribute("count");
			System.out.println("count : " + value);
		}*/
		NodeList quantityNodes = doc.getElementsByTagName("quantity");
		for(int i = 0;i<quantityNodes.getLength();i++) {
			Node quantity = quantityNodes.item(i);
			System.out.println(quantity.getFirstChild().getNodeValue());
		}
		
	}
}












