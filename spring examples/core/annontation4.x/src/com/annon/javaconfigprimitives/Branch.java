package com.annon.javaconfigprimitives;

// no source code
public class Branch {
	private int branchNo;
	private String branchName;

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + "]";
	}

}
