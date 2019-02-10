package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanEnquiry;
import com.don.beans.LoanInfo;
import com.don.handler.LoanEquireHandler;

public class DONTest {
	public static void main(String[] args) throws Exception {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/don/common/application-context.xml"));
		LoanEquireHandler leh = factory.getBean("loanEnquireHandler", LoanEquireHandler.class);
		LoanEnquiry le = new LoanEnquiry();
		le.setLoanType("Home");
		le.setPrinciple(400000);
		le.setTenure(150);
		le.setPlace("hyderabad");
		le.setOccupation("Software Engineer");
		le.setNetIncome(25000);
		LoanInfo li = leh.enquire(le);
		System.out.println(li);
	}
}
