package com.cc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cc.beans.Account;
import com.cc.beans.Product;
import com.cc.beans.Project;

public class CCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cc/common/application-context.xml"));
		/*Account account = factory.getBean("account", Account.class);
		System.out.println(account);*/

		/*Product product = factory.getBean("product", Product.class);
		System.out.println(product);*/
		
		Project project = factory.getBean("project", Project.class);
		System.out.println(project);
		
	}
}













