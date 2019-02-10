package com.tpcc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.entities.Account;
import com.tpcc.entities.CurrentAccount;
import com.tpcc.entities.SavingsAccount;
import com.tpcc.helper.SessionFactoryRegistry;

public class TPCCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Account account = null;
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*account = new Account();
			account.setAccountHolderName("Rahul");
			account.setAmount(3939);
			account.setOpenedDate(new Date());
			session.save(account);

			savingsAccount = new SavingsAccount();
			savingsAccount.setAccountHolderName("Rakesh");
			savingsAccount.setOpenedDate(new Date());
			savingsAccount.setAmount(3939);
			savingsAccount.setHasCheckBookFacility(true);
			savingsAccount.setMinBalance(1000);
			savingsAccount.setMaxWithdrawlLimit(20000);
			session.save(savingsAccount);

			currentAccount = new CurrentAccount();
			currentAccount.setAccountHolderName("Ramesh");
			currentAccount.setOpenedDate(new Date());
			currentAccount.setAmount(3948);
			currentAccount.setCompanyName("Xyz company");
			currentAccount.setOverDraftLimit(10000);
			session.save(currentAccount);*/
			
			/*savingsAccount = session.get(SavingsAccount.class, 3);
			System.out.println(savingsAccount);*/
			account = session.get(Account.class, 2);
			System.out.println(account);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
