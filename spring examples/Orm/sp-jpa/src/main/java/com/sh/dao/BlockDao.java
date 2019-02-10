package com.sh.dao;

import org.springframework.orm.jpa.JpaTemplate;

import com.sh.entities.Block;

public class BlockDao {
	private JpaTemplate jpaTemplate;

	public BlockDao(JpaTemplate jpaTemplate) {
		this.jpaTemplate = jpaTemplate;
	}

	public Block findBlock(int blockNo) {
		return jpaTemplate.find(Block.class, blockNo);
	}

}
