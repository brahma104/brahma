package com.sh.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sh.entities.Block;

public class BlockDao {
	private HibernateTemplate hibernateTemplate;

	public BlockDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Block findBlock(int blockNo) {
		return hibernateTemplate.get(Block.class, blockNo);
	}

}
