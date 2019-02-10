package com.cldi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cldi.beans.IccBoard;

public class CLDITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cldi/common/application-context.xml"));
		/*Game game = factory.getBean("cricket", Game.class); System.out.println(game);
		 */

		IccBoard iccBoard = factory.getBean("iccBoard", IccBoard.class);
		System.out.println(iccBoard);

	}
}











