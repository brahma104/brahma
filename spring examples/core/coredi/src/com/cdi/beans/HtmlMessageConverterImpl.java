package com.cdi.beans;

public class HtmlMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<html><body>" + message + "</body></html>";
	}
}
