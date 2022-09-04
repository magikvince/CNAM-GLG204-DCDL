package fr.magikvince.dcdl.security;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.security.user.User;
import fr.magikvince.dcdl.security.user.UserAlreadyExistException;
import fr.magikvince.dcdl.security.user.UserNotFoundException;
import fr.magikvince.dcdl.security.user.UserService;
import fr.magikvince.dcdl.security.userrole.UserRoleService;

@Controller
public class RegisterController {

	@Autowired
	UserService userservice;
	
	@Autowired
	UserRoleService userRoleService;
	
	@GetMapping("/register")
	public String registerGET(Model model)
	{
		model.addAttribute("newUser", new User());
		return "security/register.html";
	}
	
	@PostMapping("/register")
	public String registerPOST(Model model, User newUser)
	{
		newUser.setEnable(true);
		newUser.setBirthdate(newUser.getBirthdateAsText());
		newUser.setCreationDateTime(LocalDateTime.now());
		try {
			//userservice.createUser(user);
			userservice.createUser(newUser);
			
			var idNewUser = userservice.findUserByPseudo(newUser.getPseudo());
			
		} catch (UserAlreadyExistException | UserNotFoundException e) {
			e.printStackTrace();
		}
		return "redirect:/logon";
	}
	
}
