package com.fireweb.web.metadata.reader;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.fireweb.web.config.FirewebConfig;
import org.fireweb.web.config.Forward;
import org.fireweb.web.config.Handler;
import org.fireweb.web.exception.FireWebConfigException;
import org.fireweb.web.metadata.FireWebMetadata;
import org.fireweb.web.metadata.HandlerMetadata;

public class XmlFireWebMetadataReaderImpl implements FireWebMetadataReader {
	@Override
	public FireWebMetadata readFireWebMetadata(ServletContext servletContext, String configFile) {
		FireWebMetadata fireWebMetadata = null;
		HandlerMetadata handlerMetadata = null;
		FirewebConfig firewebConfig = null;
		String configFileLocation = null;
		Unmarshaller unmarshaller = null;
		JAXBContext jContext = null;

		configFileLocation = servletContext.getRealPath("/WEB-INF/") + configFile;
		try {
			jContext = JAXBContext.newInstance("org.fireweb.web.config");
			unmarshaller = jContext.createUnmarshaller();
			JAXBElement<FirewebConfig> jElement = (JAXBElement<FirewebConfig>) unmarshaller
					.unmarshal(new File(configFileLocation));
			firewebConfig = jElement.getValue();

			fireWebMetadata = new FireWebMetadata();
			for (Handler handler : firewebConfig.getHandlers().getHandler()) {
				handlerMetadata = new HandlerMetadata();
				handlerMetadata.setPath(handler.getPath());
				handlerMetadata.setHandlerClass(handler.getHandlerClass());
				for (Forward forward : handler.getForward()) {
					handlerMetadata.addForwardMetadata(forward.getName(), forward.getPage());
				}
				fireWebMetadata.addHandlerMetada(handlerMetadata);
			}

		} catch (Exception e) {
			throw new FireWebConfigException("unable to read configuration file", e);
		}
		return fireWebMetadata;
	}

}
