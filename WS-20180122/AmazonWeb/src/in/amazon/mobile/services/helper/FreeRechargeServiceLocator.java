package in.amazon.mobile.services.helper;

import java.io.IOException;
import java.util.Properties;

import in.freerecharge.mobile.services.MobileManager;
import in.freerecharge.mobile.services.MobileManagerService;

public class FreeRechargeServiceLocator {
	private String environment;

	public FreeRechargeServiceLocator() {
		environment = System.getProperty("ws.env");
		// default to dev env
		if (environment == null || environment.trim().length() == 0) {
			environment = "dev";
		}
	}

	public MobileManager getMobileManagerPort() throws IOException {
		Properties props = null;
		MobileManagerService mobileManagerService = null;
		MobileManager port = null;
		String endpointLocation = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader()
				.getResourceAsStream("endpoints.properties"));
		endpointLocation = props.getProperty(environment
				+ ".MobileManagerSOAPPort");

		mobileManagerService = new MobileManagerService(endpointLocation);
		port = mobileManagerService.getMobileManagerSOAPPort();

		return port;
	}
}
