package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogonController {

	@Autowired
	PlayerService playerservice;
	
	@GetMapping("/logon")
	public String logonGET(Model model)
	{
		model.addAttribute("loggingPlayer", new Player());
		return "security/logon.html";
	}
	
	@PostMapping("/logon")
	public String logonPOST(Model model, Player loggingPlayer)
	{
		try {
			//player found in database with this email
			Player dbPlayer = playerservice.findPlayer(loggingPlayer.getEmail());
			
			if ( dbPlayer.getEmail().equals(loggingPlayer.getEmail()) && dbPlayer.getPassword().equals(loggingPlayer.getPassword() ) )
			{
				System.out.println("Player " + dbPlayer.getPseudo() + " is successfully logged on !");
				model.addAttribute("loggingPlayer", dbPlayer);
				
			}
			else
			{
				System.out.println("bad credentials were provided for account with email " + loggingPlayer.getEmail());
				model.addAttribute("loggingPlayer", loggingPlayer);
			}
			
		} catch (PlayerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "security/logon.html";
	}
	
}
