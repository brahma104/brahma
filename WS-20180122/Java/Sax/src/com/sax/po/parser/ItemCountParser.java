package com.sax.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.po.handler.GetNoOfItemsPOHandler;

public class ItemCountParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		GetNoOfItemsPOHandler handler = new GetNoOfItemsPOHandler();
		parser.parse(new File("D:\\\\work\\\\master\\\\webservices\\\\20180125\\\\Java\\\\Sax\\\\resource\\\\po.xml"),
				handler);
		System.out.println("items  : " + handler.getNoOfItems());

		parser.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po2.xml"), handler);
		System.out.println("po2 items : " + handler.getNoOfItems());
	}
}












