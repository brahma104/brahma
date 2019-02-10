package com.sax.po.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GetNoOfItemsPOHandler extends DefaultHandler {
	private int noOfItems;

	@Override
	public void startDocument() throws SAXException {
		noOfItems = 0;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("item")) {
			noOfItems++;
		}
	}

	public int getNoOfItems() {
		return noOfItems;
	}

}
