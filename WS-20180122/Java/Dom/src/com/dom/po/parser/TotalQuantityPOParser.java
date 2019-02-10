package com.dom.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TotalQuantityPOParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		int total = 0;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Dom\\resource\\po.xml"));
		
		NodeList quantityNodes = doc.getElementsByTagName("quantity");
		for(int i=0;i<quantityNodes.getLength();i++) {
			Node quantity = quantityNodes.item(i);
			total = total + Integer.parseInt(quantity.getFirstChild().getNodeValue());
		}
		
		System.out.println("Total : " + total);
	}
}





















