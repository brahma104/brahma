package com.sh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sh.entities.Block;

@Repository
public class BlockDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Block> getBlocks(int units) {
		return (List<Block>) hibernateTemplate.findByNamedParam("from Block b where b.units > :units", "units", units);
	}
}
