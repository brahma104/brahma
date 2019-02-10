package com.annon.stereojavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Meeting {
	private Participant host;

	@Autowired
	public void setHost(Participant host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Meeting [host=" + host + "]";
	}

}
