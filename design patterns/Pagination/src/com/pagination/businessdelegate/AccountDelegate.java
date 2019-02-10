package com.pagination.businessdelegate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.pagination.bo.TransactionBo;
import com.pagination.dao.TransactionDao;
import com.pagination.helper.ObjectFactory;
import com.pagination.vo.TransactionVo;

public class AccountDelegate {
	public List<TransactionVo> getTransactionHistory(int pageSize, int pageNo, String sortColumn, String sortOrder) {
		TransactionDao transactionDao = null;
		ObjectFactory objectFactory = null;
		List<TransactionBo> transationBos = null;
		List<TransactionVo> transactionVos = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		objectFactory = ObjectFactory.getInstance();
		transactionDao = (TransactionDao) objectFactory.getObject("com.pagination.dao.TransactionDao");
		transationBos = transactionDao.getTransactions(pageSize, pageNo, sortColumn, sortOrder);
		transactionVos = new ArrayList<>();
		for (TransactionBo bo : transationBos) {
			transactionVos.add(new TransactionVo(sdf.format(bo.getTransactionDate()), bo.getDescription(),
					bo.getMerchant(), String.valueOf(bo.getAmount())));
		}
		return transactionVos;
	}

	public int getNoOfTransactions() {
		TransactionDao transactionDao = null;
		ObjectFactory objectFactory = null;
		objectFactory = ObjectFactory.getInstance();
		transactionDao = (TransactionDao) objectFactory.getObject("com.pagination.dao.TransactionDao");
		return transactionDao.getNoOfTransactions();
	}

}











