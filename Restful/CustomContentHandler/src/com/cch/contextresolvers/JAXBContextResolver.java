package com.cch.contextresolvers;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.cch.dto.Account;
import com.cch.dto.Application;

@Provider
public class JAXBContextResolver implements ContextResolver<JAXBContext> {
	private JAXBContext jContext;

	public JAXBContextResolver() throws JAXBException {
		System.out.println("JAXBContextResolver()");
		jContext = JAXBContext.newInstance(Application.class, Account.class);
	}

	@Override
	public JAXBContext getContext(Class<?> classType) {
		System.out.println("getContext(" + classType.getSimpleName() + ")");
		if (classType.isAssignableFrom(Application.class) || classType.isAssignableFrom(Account.class)) {
			return jContext;
		}
		return null;
	}

}












