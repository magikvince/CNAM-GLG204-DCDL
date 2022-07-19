package fr.magikvince.dcdl.game.play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GameController {

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
	
}
