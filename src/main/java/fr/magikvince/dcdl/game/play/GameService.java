package fr.magikvince.dcdl.game.play;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.security.user.User;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;

	private Collection<Game> games;
	
	public GameService()
	{
		this.games = new ArrayList<Game>();
	}
	
	
	public void addGame(Game game)
	{
		games.add(game);
	}
	
	public void deleteGame(Game game)
	{
		games.remove(game);
	}

	public Collection<Game> findAllGames() {
		return (Collection<Game>) gameRepository.findAll();
	}
	
}
