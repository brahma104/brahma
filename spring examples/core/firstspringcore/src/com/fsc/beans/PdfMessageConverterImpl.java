package com.fsc.beans;

public class PdfMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
