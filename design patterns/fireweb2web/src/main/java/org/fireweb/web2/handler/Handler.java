package org.fireweb.web2.handler;

import org.fireweb.web2.contextobject.InContextObject;
import org.fireweb.web2.contextobject.OutContextObject;

public interface Handler {
	OutContextObject performAction(InContextObject in);
}
