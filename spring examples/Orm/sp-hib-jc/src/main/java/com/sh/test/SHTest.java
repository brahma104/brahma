package com.sh.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sh.config.RootConfig;
import com.sh.entities.Block;
import com.sh.service.BlockService;

public class SHTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		BlockService blockService = context.getBean("blockService", BlockService.class);
		List<Block> blocks = blockService.getBlocks(10);
		for (Block block : blocks) {
			System.out.println(block);
		}
	}

}











