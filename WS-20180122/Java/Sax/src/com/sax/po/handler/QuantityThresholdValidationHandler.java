package com.sax.po.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class QuantityThresholdValidationHandler extends DefaultHandler {
	private String elementName;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		elementName = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		elementName = null;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = null;
		int quantity = 0;

		if (elementName != null && elementName.equals("quantity")) {
			data = new String(ch, start, length);
			quantity = Integer.parseInt(data);
			if (quantity > 10) {
				throw new SAXException("Unable to process your order, because quantity exceeds threshold limit");
			}
		}
	}

}
