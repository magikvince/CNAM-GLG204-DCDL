package fr.magikvince.dcdl.game.league;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends CrudRepository<League, Integer> 	{

	public boolean existsByLeague(String league);
	public League findByLeague(String league);
}
