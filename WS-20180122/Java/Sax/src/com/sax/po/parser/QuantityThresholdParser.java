package com.sax.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.po.handler.QuantityThresholdValidationHandler;

public class QuantityThresholdParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		QuantityThresholdValidationHandler handler = new QuantityThresholdValidationHandler();
		parser.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po2.xml"), handler);
		System.out.println("valid order");
	}

}
