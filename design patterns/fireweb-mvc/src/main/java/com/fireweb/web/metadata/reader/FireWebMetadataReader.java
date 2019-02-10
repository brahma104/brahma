package com.fireweb.web.metadata.reader;

import javax.servlet.ServletContext;

import org.fireweb.web.metadata.FireWebMetadata;

public interface FireWebMetadataReader {
	FireWebMetadata readFireWebMetadata(ServletContext servletContext, String configFile);
}
