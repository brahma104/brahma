package com.sh.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blocks")
public class Block implements Serializable {
	private static final long serialVersionUID = -7248702049377551465L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "block_no")
	protected int blockNo;
	@Column(name = "block_nm")
	protected String blockName;
	protected String description;
	protected int units;

	public int getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blockName == null) ? 0 : blockName.hashCode());
		result = prime * result + blockNo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + units;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Block other = (Block) obj;
		if (blockName == null) {
			if (other.blockName != null)
				return false;
		} else if (!blockName.equals(other.blockName))
			return false;
		if (blockNo != other.blockNo)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (units != other.units)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Block [blockNo=" + blockNo + ", blockName=" + blockName + ", description=" + description + ", units="
				+ units + "]";
	}

}
