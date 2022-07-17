package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LogonController {

	@Autowired
	UserService userservice;
	
	@GetMapping("/logon")
	public String logonGET(Model model)
	{
		model.addAttribute("loggingUser", new User());
		return "security/logon.html";
	}
	
	@PostMapping("/logon")
	public String logonPOST(Model model, User loggingUser)
	{
		try {
			//User found in database with this email
			User dbUser = userservice.findUser(loggingUser.getEmail());
			
			if ( dbUser.getEmail().equals(loggingUser.getEmail()) && dbUser.getPassword().equals(loggingUser.getPassword() ) )
			{
				System.out.println("User " + dbUser.getPseudo() + " is successfully logged on !");
				model.addAttribute("loggingUser", dbUser);
				
			}
			else
			{
				System.out.println("bad credentials were provided for account with email " + loggingUser.getEmail());
				model.addAttribute("loggingPlayer", loggingUser);
			}
			
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "security/logon.html";
	}
	
}
