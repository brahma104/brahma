package com.axisbank.netbanking.service;

import java.rmi.RemoteException;

public class FundsTransferImpl implements FundsTransfer {

	public Receipt neft(Account fromAc, Account toAc, NeftDetails neftDetails)
			throws RemoteException {
		Receipt receipt = null;

		receipt = new Receipt();
		receipt.setTransactionNo(fromAc.getAccountNo() + "-"
				+ toAc.getAccountNo());
		receipt.setStatus("success");

		return receipt;
	}

}




