package com.cdi.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.cdi.beans.IMessageConverter;
import com.cdi.beans.MessageWriter;
import com.cdi.helper.AppFactory;

public class CoreDiTest {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IOException {
		MessageWriter messageWriter = (MessageWriter) AppFactory.createObject("messageWriter.class");
		IMessageConverter messageConverter = (IMessageConverter) AppFactory.createObject("iMessageConverter.class");
		messageWriter.setMessageConverter(messageConverter);

		messageWriter.writeMessage("Welcome to Spring Core");
	}
}
