package fr.magikvince.dcdl.dictionary.author;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorController {

	@GetMapping("/author")
	public String authorGET()
	{
		return "dictionary/author.html";
	}
	
	
	@PostMapping("/author")
	public String authorPOST()
	{
		return "dictionary/author.html";
	}
}
