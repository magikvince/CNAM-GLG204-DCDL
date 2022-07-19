package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@Autowired
	UserService userservice;
	
	@GetMapping("/register")
	public String registerGET(Model model)
	{
		model.addAttribute("newUser", new User());
		return "security/register.html";
	}
	
	@PostMapping("/register")
	public String registerPOST(Model model, User newUser)
	{
		//User user = (User) model.getAttribute("newUser");
		try {
			//userservice.createUser(user);
			userservice.createUser(newUser);
		} catch (UserAlreadyExistException e) {
			e.printStackTrace();
		}
		return "security/register.html";
	}
	
}
