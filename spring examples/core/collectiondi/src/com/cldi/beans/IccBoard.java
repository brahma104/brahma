package com.cldi.beans;

import java.util.Map;
import java.util.Properties;

public class IccBoard {
	private Map<String, Game> seasons;
	private Properties members;

	public IccBoard(Map<String, Game> seasons) {
		this.seasons = seasons;
	}

	public void setMembers(Properties members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "IccBoard [seasons=" + seasons + ", members=" + members + "]";
	}

}
