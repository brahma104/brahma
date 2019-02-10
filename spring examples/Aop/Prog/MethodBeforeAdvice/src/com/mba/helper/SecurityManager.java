package com.mba.helper;

public class SecurityManager {
	private static SecurityManager instance;
	private ThreadLocal<Credential> localCredentials;

	private SecurityManager() {
		localCredentials = new ThreadLocal<>();
	}

	public synchronized static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
	}

	public void login(String username, String password) {
		Credential cred = new Credential(username, password);
		localCredentials.set(cred);
	}

	public void logout() {
		localCredentials.set(null);
	}

	public boolean isAuthenticated() {
		Credential cred = null;
		cred = localCredentials.get();
		if (cred != null) {
			if (cred.getUsername().equals("john") && cred.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		Credential cred = null;
		cred = localCredentials.get();
		if (cred != null) {
			return cred.getUsername();
		}
		return null;
	}

}
