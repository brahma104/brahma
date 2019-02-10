package org.fireweb.web2.metadata.reader;

import org.fireweb.web2.metadata.Fireweb2Metatadata;

public interface Fireweb2ConfigReader {
	Fireweb2Metatadata readFireweb2Config(String configLocation);
}
