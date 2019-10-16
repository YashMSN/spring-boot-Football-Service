package com.futbol.FootballTeamService.models;

public class Player {
	
	private String name;
	private int shirtNo;
	private String Team;
	public Player() {}
	public Player(String name, int shirtNo, String team) {
		super();
		this.name = name;
		this.shirtNo = shirtNo;
		Team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShirtNo() {
		return shirtNo;
	}
	public void setShirtNo(int shirtNo) {
		this.shirtNo = shirtNo;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	
	

}
