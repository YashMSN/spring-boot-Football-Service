package com.futbol.FootballTeamService.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.futbol.FootballTeamService.models.Player;
import com.futbol.FootballTeamService.models.Players;
import com.futbol.FootballTeamService.models.Team;

@RestController
@RequestMapping("/football")
public class FootballTeamResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{teamName}")
	public Team getTeam(@PathVariable("teamName") String teamName) {
		
		ResponseEntity<List<Player>> response;

		response = restTemplate.exchange("http://Football-Midfielders-Service/midfielders/" + teamName,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Player>>() {
				});
		List<Player> midfielders = response.getBody();

		Players midfs = new Players(midfielders);
		
		response = restTemplate.exchange("http://Football-Attackers-Service/attackers/" + teamName,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Player>>() {
				});
		List<Player> attackers = response.getBody();
		
		Players atts = new Players(attackers);

		return new Team(teamName, atts, midfs);

	}
	

}
