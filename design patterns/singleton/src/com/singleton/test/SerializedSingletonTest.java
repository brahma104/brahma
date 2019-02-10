package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singleton.li.pattern.DoubleSafeNoCopyAndTransformAccount;

public class SerializedSingletonTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DoubleSafeNoCopyAndTransformAccount account = null;

		account = DoubleSafeNoCopyAndTransformAccount.getAccount();
		account.setAccountNo(1000);
		System.out.println("hc : " + account.hashCode());
		/*serialize(account);*/
		
		/*account = deSerialize();
		System.out.println(account.getAccountNo());*/
		
		/*Class<?> clazz = Class.forName("com.singleton.li.pattern.DoubleSafeNoCopyAndTransformAccount");
		Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		account = (DoubleSafeNoCopyAndTransformAccount) constructor.newInstance(null);
		System.out.println("hc : " + account.hashCode());
		
		account = (DoubleSafeNoCopyAndTransformAccount) constructor.newInstance(null);
		System.out.println("hc : " + account.hashCode());*/
		
	}

	private static void serialize(DoubleSafeNoCopyAndTransformAccount account)
			throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\acc.ser"));
		oos.writeObject(account);
		oos.close();
	}

	private static DoubleSafeNoCopyAndTransformAccount deSerialize()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\acc.ser"));
		DoubleSafeNoCopyAndTransformAccount account1 = (DoubleSafeNoCopyAndTransformAccount) ois.readObject();
		System.out.println("hc : " + account1.hashCode());
		return account1;
	}
}





