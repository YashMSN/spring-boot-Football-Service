package com.futbol.FootballMidfieldersService.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futbol.FootballMidfieldersService.models.Player;

@RestController
@RequestMapping("/midfielders")
public class FootballMidfielderResource {

	@RequestMapping("/{teamName}")
	public List<Player> getPlayer(@PathVariable("teamName") String teamName) {
		List<Player> midfielders = new ArrayList<Player>();
		midfielders.add(new Player("Iniesta",8,"Barcelona"));
		midfielders.add(new Player("Xavi",6,"Barcelona"));
		midfielders.add(new Player("Kroos",8,"RealMadrid"));
		midfielders.add(new Player("Modric",10,"RealMadrid"));
		midfielders.add(new Player("Pogba",6,"ManchesterUnited"));
		
		List<Player> filtered = midfielders.stream().filter(player -> 
			player.getTeam().equalsIgnoreCase(teamName)		
		)
		.collect(Collectors.toList());
		return filtered;
	}
	
	
}
