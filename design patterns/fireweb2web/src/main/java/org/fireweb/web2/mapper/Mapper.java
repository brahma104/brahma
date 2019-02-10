package org.fireweb.web2.mapper;

import org.fireweb.web2.contextobject.InContextObject;
import org.fireweb.web2.contextobject.OutContextObject;

public interface Mapper<T> {
	InContextObject extractInData(T request);

	void bindOutData(OutContextObject outContextObject, T request);
}
