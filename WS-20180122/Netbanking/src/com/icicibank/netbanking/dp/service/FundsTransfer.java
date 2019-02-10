package com.icicibank.netbanking.dp.service;

import java.rmi.RemoteException;

public interface FundsTransfer extends java.rmi.Remote {
	Receipt neft(Account fromAc, Account toAc, NeftDetails neftDetails)
			throws RemoteException;
}
