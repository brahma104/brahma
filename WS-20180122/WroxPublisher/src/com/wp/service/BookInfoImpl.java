package com.wp.service;

import java.rmi.RemoteException;

public class BookInfoImpl implements BookInfo {

	public float getBookPrice(String isbn) throws RemoteException {
		float price = 0.0f;

		if (isbn == null || isbn.trim().length() == 0) {
			throw new RemoteException("invalid isbn");
		}
		if (isbn.equals("isbn100")) {
			price = 100.34f;
		} else if (isbn.equals("isbn101")) {
			price = 200.34f;
		} else if (isbn.equals("isbn300")) {
			price = 394.434f;
		} else {
			price = 30.3f;
		}
		return price;
	}

}
