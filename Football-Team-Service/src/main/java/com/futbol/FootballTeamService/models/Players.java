package com.futbol.FootballTeamService.models;

import java.util.ArrayList;
import java.util.List;

public class Players {
	private List<Player> players;
	public Players() {
		players = new ArrayList<Player>();
	}
	public Players(List<Player> players) {
		super();
		this.players = players;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
}
