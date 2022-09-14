package fr.magikvince.dcdl.game.league;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {
	
	@Autowired
	LeagueRepository leagueRepository;

	
	public LeagueService()
	{
		
	}

	public Collection<League> findAllLeagues() {
		// TODO Auto-generated method stub
		return (Collection<League>) leagueRepository.findAll();
	}
}
