package fr.magikvince.dcdl.game.play;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> 	{

	public boolean existsByName(String name);
	public Game findByName(String name);
	
}
