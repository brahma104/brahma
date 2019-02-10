package com.sax.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.sax.po.handler.PrintHandler;

public class POParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SchemaFactory sFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema poSchema = sFactory
				.newSchema(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po.xsd"));
		/*Validator validator = poSchema.newValidator();
		validator.validate(
				new StreamSource(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po.xml")));*/

		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setSchema(poSchema);
		factory.setValidating(true);
		SAXParser parser = factory.newSAXParser();
		PrintHandler ph = new PrintHandler();
		parser.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Sax\\resource\\po.xml"), ph);
	}
}









