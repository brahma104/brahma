package org.fireweb.web2.contextobject;

public class ContextObjectFactory {
	public static InContextObject createInContextObject() {
		return new InMapContextObject();
	}

	public static OutContextObject createOutContextObject() {
		return new OutMapContextObject();
	}
}
