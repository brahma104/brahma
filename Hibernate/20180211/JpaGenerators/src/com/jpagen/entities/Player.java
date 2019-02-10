package com.jpagen.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "player")
public class Player implements Serializable {
	@Id
	@GeneratedValue(generator="hilo_gen")
	@GenericGenerator(name="hilo_gen", strategy="hilo", parameters={@Parameter(name="max_lo", value="5")})
	/*@TableGenerator(name = "tbl_gen", table = "player_no_generator_table", pkColumnName = "player_no_next_pk", allocationSize = 1)*/
	/*
	 * @SequenceGenerator(name = "seq_gen", sequenceName = "player_no_sequence",
	 * initialValue = 1, allocationSize = 1)
	 */
	@Column(name = "player_no")
	protected int playerNo;
	@Column(name = "player_nm")
	protected String playerName;
	protected int experience;
	@Column(name = "mobile_nbr")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + experience;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + playerNo;
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
		Player other = (Player) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (experience != other.experience)
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (playerNo != other.playerNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", experience=" + experience
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}
