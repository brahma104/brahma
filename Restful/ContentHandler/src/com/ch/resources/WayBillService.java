	package com.ch.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/waybill")
public class WayBillService {
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/in")
	public String create(InputStream in) throws IOException {
		int c = 0;
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		while ((c = in.read()) != -1) {
			buffer.append((char) c);
		}
		return buffer.toString();
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/reader")
	public String create(Reader reader) throws IOException {
		StringBuffer buffer = null;
		char cBuf[] = null;
		cBuf = new char[255];
		buffer = new StringBuffer();
		while (reader.read(cBuf) != -1) {
			buffer.append(cBuf);
		}

		return buffer.toString();
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/byte")
	public byte[] create(byte[] data) {
		return data;
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/string")
	public String create(String data) {
		return data;
	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/attachments")
	public String create(File productsFile) throws IOException {
		StringBuffer buffer = null;
		FileInputStream fis = null;
		int c = 0;

		buffer = new StringBuffer();
		buffer.append("File Contents : \\n");

		fis = new FileInputStream(productsFile);
		while ((c = fis.read()) != -1) {
			buffer.append((char) c);
		}

		return buffer.toString();

	}

	@GET
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Path("/{wayBillNo}")
	public File getWayBill(@PathParam("wayBillNo") String wayBillNo) {
		return new File("C:\\apache-cxf-2.6.9\\README");
	}

}
