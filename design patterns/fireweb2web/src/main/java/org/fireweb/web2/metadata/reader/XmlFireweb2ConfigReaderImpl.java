package org.fireweb.web2.metadata.reader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.fireweb.web2.config.Fireweb2Config;
import org.fireweb.web2.config.Forward;
import org.fireweb.web2.config.Handler;
import org.fireweb.web2.exception.Fireweb2ConfigInitializationFailedException;
import org.fireweb.web2.metadata.Fireweb2Metatadata;
import org.fireweb.web2.metadata.HandlerMetadata;

public class XmlFireweb2ConfigReaderImpl implements Fireweb2ConfigReader {

	@Override
	public Fireweb2Metatadata readFireweb2Config(String configLocation) {
		JAXBContext jContext = null;
		Unmarshaller unmarshaller = null;
		Fireweb2Config fireweb2Config = null;
		Fireweb2Metatadata fireweb2Metatadata = null;

		try {
			jContext = JAXBContext.newInstance("org.fireweb.web2.config");
			unmarshaller = jContext.createUnmarshaller();

			JAXBElement<Fireweb2Config> jElement = (JAXBElement<Fireweb2Config>) unmarshaller
					.unmarshal(new File(configLocation));
			fireweb2Config = jElement.getValue();

			fireweb2Metatadata = new Fireweb2Metatadata();
			for (Handler handler : fireweb2Config.getHandlerMapping().getHandlers()) {
				HandlerMetadata handlerMetadata = new HandlerMetadata();
				handlerMetadata.setPath(handler.getPath());
				handlerMetadata.setHandlerClass(handler.getHandlerClass());

				for (Forward forward : handler.getForwards()) {
					handlerMetadata.addForwardMetadata(forward.getForwardName(), forward.getPage());
				}
				fireweb2Metatadata.addHandlerMetadata(handlerMetadata);
			}

		} catch (Exception e) {
			throw new Fireweb2ConfigInitializationFailedException("failed in reading config file : " + configLocation,
					e);
		}

		return fireweb2Metatadata;
	}

}
