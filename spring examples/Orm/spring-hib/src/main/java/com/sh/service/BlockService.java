package com.sh.service;

import com.sh.dao.BlockDao;
import com.sh.entities.Block;

public class BlockService {
	private BlockDao blockDao;

	public void setBlockDao(BlockDao blockDao) {
		this.blockDao = blockDao;
	}

	public Block findBlock(int blockNo) {
		return blockDao.findBlock(blockNo);
	}

}
