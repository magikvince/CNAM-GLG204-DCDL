package fr.magikvince.dcdl.social.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClubController {

	@GetMapping("/clubs")
	public String logonGET(Model model)
	{
		return "club/club.html";
	}
	
	@PostMapping("/clubs")
	public String clubPOST(Model model)
	{
		return "club/club.html";
	}
	
}
