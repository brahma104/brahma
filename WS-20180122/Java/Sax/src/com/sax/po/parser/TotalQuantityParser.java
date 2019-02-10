package com.sax.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.po.handler.TotalQuantityCountPOHandler;

public class TotalQuantityParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		TotalQuantityCountPOHandler handler = new TotalQuantityCountPOHandler();
		parser.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po.xml"), handler);
		System.out.println("Total Quantity : " + handler.getTotalQuantity());
		
	}
}








