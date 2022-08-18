package fr.magikvince.dcdl.security.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

	@GetMapping("/admin")
	public String adminPage()
	{
		return "security/admin.html";
	}
	
}
