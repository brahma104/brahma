package com.amexaccess.locator;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.bp.ejb.EnrollmentRequestSessionRemoteFacade;

public class EnrollmentRequestServiceLocator {
	public static EnrollmentRequestSessionRemoteFacade lookupEnrollmentRequestService() throws NamingException {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
		ht.put(Context.SECURITY_PRINCIPAL, "weblogic");
		ht.put(Context.SECURITY_CREDENTIALS, "welcome1");

		InitialContext ic = new InitialContext(ht);
		EnrollmentRequestSessionRemoteFacade remote = (EnrollmentRequestSessionRemoteFacade) ic
				.lookup("enrollmentRequestSessionFacade#com.bp.ejb.EnrollmentRequestSessionRemoteFacade");
		return remote;
	}

	/*
	 * public static void main(String[] args) throws NamingException {
	 * lookupEnrollmentRequestService(); }
	 */
}
