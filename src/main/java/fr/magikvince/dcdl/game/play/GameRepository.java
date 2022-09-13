package fr.magikvince.dcdl.game.play;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> 	{

	public Game findByStatus(String status);
	public Game findByCreator(Player creator);
	
}
