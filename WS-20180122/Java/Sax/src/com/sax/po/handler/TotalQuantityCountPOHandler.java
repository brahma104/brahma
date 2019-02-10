package com.sax.po.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TotalQuantityCountPOHandler extends DefaultHandler {
	private int totalQuantity;
	private String lastProcessedElement;

	@Override
	public void startDocument() throws SAXException {
		totalQuantity = 0;
		lastProcessedElement = null;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		lastProcessedElement = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		lastProcessedElement = null;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = null;
		int quantity = 0;

		if (lastProcessedElement != null && lastProcessedElement.equals("quantity")) {
			data = new String(ch, start, length);
			
			quantity = Integer.parseInt(data);
			totalQuantity = totalQuantity + quantity;
		}
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

}
