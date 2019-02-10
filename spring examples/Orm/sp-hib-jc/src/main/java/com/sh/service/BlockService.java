package com.sh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.BlockDao;
import com.sh.entities.Block;

@Service
public class BlockService {
	@Autowired
	private BlockDao blockDao;

	@Transactional(readOnly = true)
	public List<Block> getBlocks(int units) {
		return blockDao.getBlocks(units);
	}
}
