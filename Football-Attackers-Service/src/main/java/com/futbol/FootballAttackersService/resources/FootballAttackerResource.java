package com.futbol.FootballAttackersService.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futbol.FootballAttackersService.models.Player;

@RestController
@RequestMapping("/attackers")
public class FootballAttackerResource {

	@RequestMapping("/{teamName}")
	public List<Player> getAttackers(@PathVariable("teamName") String teamName)
	{
		List<Player> attackers = new ArrayList<Player>();
		attackers.add(new Player("Messi",10,"Barcelona"));
		attackers.add(new Player("Suarez",9,"Barcelona"));
		attackers.add(new Player("Hazard",7,"RealMadrid"));
		attackers.add(new Player("Benzema",9,"RealMadrid"));
		attackers.add(new Player("Rashford",10,"ManchesterUnited"));
		
		List<Player> filtered = attackers.stream().filter(player -> 
			player.getTeam().equalsIgnoreCase(teamName)
		).collect(Collectors.toList());
		
		return filtered;
	}
}
