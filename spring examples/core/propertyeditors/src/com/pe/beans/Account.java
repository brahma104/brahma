package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class Account {
	private int accountNo;
	private String holderName;
	private Date registeredDate;
	private File profileImage;
	private URL facebookPage;
	private String[] interests;

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public void setProfileImage(File profileImage) {
		this.profileImage = profileImage;
	}

	public void setFacebookPage(URL facebookPage) {
		this.facebookPage = facebookPage;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", holderName=" + holderName + ", registeredDate=" + registeredDate
				+ ", profileImage=" + profileImage + ", facebookPage=" + facebookPage + ", interests="
				+ Arrays.toString(interests) + "]";
	}

}
