package com.fireweb.web.metadata.reader;

public class FireWebMetadataReaderFactory {
	public static FireWebMetadataReader getFireWebMetadataReader(String fileType) {
		FireWebMetadataReader fireWebMetadataReader = null;

		if (fileType.endsWith(".xml")) {
			fireWebMetadataReader = new XmlFireWebMetadataReaderImpl();
		}
		return fireWebMetadataReader;
	}
}
