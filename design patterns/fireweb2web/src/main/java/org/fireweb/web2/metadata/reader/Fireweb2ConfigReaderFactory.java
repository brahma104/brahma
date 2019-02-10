package org.fireweb.web2.metadata.reader;

public class Fireweb2ConfigReaderFactory {
	public static Fireweb2ConfigReader createFireweb2ConfigReader(String extension) {
		Fireweb2ConfigReader fireweb2ConfigReader = null;

		if (extension.endsWith(".xml")) {
			fireweb2ConfigReader = new XmlFireweb2ConfigReaderImpl();
		}
		return fireweb2ConfigReader;
	}
}
