package com.cex2.handler;

import org.fireweb.web2.contextobject.ContextObjectFactory;
import org.fireweb.web2.contextobject.InContextObject;
import org.fireweb.web2.contextobject.OutContextObject;
import org.fireweb.web2.handler.Handler;

public class FeedbackHandler implements Handler {
	@Override
	public OutContextObject performAction(InContextObject in) {
		OutContextObject outContextObject = null;

		outContextObject = ContextObjectFactory.createOutContextObject();
		outContextObject.addAttribute("name", in.getParameter("name"));
		outContextObject.setForwardName("feedback-success");
		return outContextObject;
	}

}
