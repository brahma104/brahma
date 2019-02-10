package com.mr.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder planFinder = factory.getBean("planFinder", PlanFinder.class);
		List<String> matchingPlans = planFinder.findPlans(18, 1, 1, 20, 9380, "Male");
		System.out.println("matching plans : ");
		for (String matchingPlan : matchingPlans) {
			System.out.println(matchingPlan);
		}
	}
}












