package com.ser.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ser.bean.Account;

public class SerTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account account = new Account();
		account.setAccountNo(2939);
		account.setAccountType("current");
		account.setBranchName("Madhapur");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\account.ser"));
		oos.writeObject(account);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\account.ser"));
		Account account1 = (Account) ois.readObject();
		System.out.println("accountType : " + account1.getAccountType());
		
	}
}

















