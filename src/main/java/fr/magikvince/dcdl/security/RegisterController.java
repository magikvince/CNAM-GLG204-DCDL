package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@Autowired
	PlayerService playerservice;
	
	@GetMapping("/register")
	public String registerGET(Model model)
	{
		model.addAttribute("newPlayer", new Player());
		return "security/register.html";
	}
	
	@PostMapping("/register")
	public String registerPOST(Model model)
	{
		Player player = new Player();
		try {
			playerservice.createPlayer(player);
		} catch (PlayerAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "security/register.html";
	}
	
}
