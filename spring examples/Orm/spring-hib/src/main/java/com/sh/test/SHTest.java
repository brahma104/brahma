package com.sh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.entities.Block;
import com.sh.service.BlockService;

public class SHTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sh/common/application-context.xml");
		BlockService blockService = context.getBean("blockService", BlockService.class);
		Block block = blockService.findBlock(1);
		System.out.println(block);
	}
}
