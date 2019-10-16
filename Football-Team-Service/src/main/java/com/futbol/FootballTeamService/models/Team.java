package com.futbol.FootballTeamService.models;

public class Team {

	private String teamName;
	private Players attackers;
	private Players midfielders;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Players getAttackers() {
		return attackers;
	}
	public void setAttackers(Players attackers) {
		this.attackers = attackers;
	}
	public Players getMidfielders() {
		return midfielders;
	}
	public void setMidfielders(Players midfielders) {
		this.midfielders = midfielders;
	}
	public Team(String teamName, Players attackers, Players midfielders) {
		super();
		this.teamName = teamName;
		this.attackers = attackers;
		this.midfielders = midfielders;
	}
	
	
	
	
	
	
}
