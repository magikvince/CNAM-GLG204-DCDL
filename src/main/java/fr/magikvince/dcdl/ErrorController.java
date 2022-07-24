package fr.magikvince.dcdl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

		
	@GetMapping("/error")
	public String authorGET(Model model)
	{
		return "error.html";
	}
}
