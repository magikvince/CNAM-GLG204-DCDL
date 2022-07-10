package fr.magikvince.dcdl.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String registerGET(Model model)
	{
		model.addAttribute("newPlayer", new Player());
		return "security/register.html";
	}
	
	@PostMapping("/register")
	public String registerPOST()
	{
		return "security/register.html";
	}
	
}
