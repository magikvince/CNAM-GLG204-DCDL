package fr.magikvince.dcdl.game.play;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.game.league.League;
import fr.magikvince.dcdl.game.league.LeagueService;


@Controller
public class GameController {
	
	@Autowired
	LeagueService leagueService;

	@GetMapping("/games")
	public String gameGET(Model model)
	{
		return "game/games.html";
	}
	
	@PostMapping("/games")
	public String gamePOST(Model model)
	{
		return "game/games.html";
	}
	
	@GetMapping("/create-game")
	public String createGameGET(Model model)
	{
		Game newGame = new Game();
		model.addAttribute("newGame", newGame);
		
		Collection<League> leagues = leagueService.findAllLeagues();
		model.addAttribute("leagues", leagues);
		
		return "game/create-game.html";
	}
	
	@PostMapping("/create-game")
	public String createGamePOST(Model model)
	{
		
		
		return "game/create-game.html";
	}
	
	@GetMapping("/list-games")
	public String listGamesGET(Model model)
	{
		return "game/list-games.html";
	}
	
}
