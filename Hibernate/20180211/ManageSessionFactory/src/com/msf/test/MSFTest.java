package com.msf.test;

import com.msf.accessor.OwnerAccessor;
import com.msf.entities.Owner;
import com.msf.helper.HibernateSessionFactory;

public class MSFTest {
	public static void main(String[] args) {
		try {
			OwnerAccessor ownerAccessor = new OwnerAccessor();
			/*
			 * Owner owner = ownerAccessor.getOwner(5001); System.out.println(owner);
			 */
			Owner owner = new Owner();
			owner.setOwnerNo(1);
			owner.setOwnerFirstName("Ramu");
			owner.setOwnerLastName("Kaka");
			owner.setContactNo("3984");
			owner.setEmailAddress("ramu.kaka@gmail.com");
			owner.setAddressLine1("505");
			owner.setAddressLine2("Madhapur");
			owner.setCity("Hyd");
			owner.setState("TS");
			owner.setZip(353);
			owner.setCountry("India");
			int ownerNo = ownerAccessor.saveOwner(owner);
			System.out.println("saved owner : " + ownerNo);

		} finally {
			HibernateSessionFactory.closeSessionFactory();
		}

	}
}
