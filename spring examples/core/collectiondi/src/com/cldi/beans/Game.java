package com.cldi.beans;

import java.util.List;
import java.util.Set;

public class Game {
	private List<String> rules;
	private Set<String> players;

	public Game(List<String> rules) {
		this.rules = rules;
	}

	public void setPlayers(Set<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [rules=" + rules + ", players=" + players + "]";
	}

}








