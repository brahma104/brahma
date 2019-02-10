package com.cdi.helper;

import com.cdi.beans.HtmlMessageConverterImpl;
import com.cdi.beans.IMessageConverter;
import com.cdi.beans.PdfMessageConverterImpl;

public class MessageConverterFactory {
	public static IMessageConverter createMessageConverter(String type) {
		IMessageConverter messageConverter = null;

		if (type.equals("html")) {
			messageConverter = new HtmlMessageConverterImpl();
		} else if (type.equals("pdf")) {
			messageConverter = new PdfMessageConverterImpl();
		}
		return messageConverter;
	}
}
