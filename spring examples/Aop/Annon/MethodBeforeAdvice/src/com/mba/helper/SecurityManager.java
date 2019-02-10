package com.mba.helper;

public class SecurityManager {
	private static SecurityManager instance;
	private ThreadLocal<Credentail> localCredentails;

	private SecurityManager() {
		localCredentails = new ThreadLocal<>();
	}

	public synchronized static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
	}

	public void login(String username, String password) {
		localCredentails.set(new Credentail(username, password));
	}

	public void logout() {
		localCredentails.set(null);
	}

	public boolean isAuthenticated() {
		Credentail cred = null;

		cred = localCredentails.get();
		if (cred != null) {
			if (cred.getUsername().equals("john") && cred.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		Credentail cred = null;

		cred = localCredentails.get();
		if (cred != null) {
			return cred.getUsername();
		}
		return null;
	}
}
