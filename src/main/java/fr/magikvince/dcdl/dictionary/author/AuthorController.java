package fr.magikvince.dcdl.dictionary.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorController {

	@Autowired AuthorService authorservice;
	
	@GetMapping("/author")
	public String authorGET(Model model)
	{
		model.addAttribute("newAuthor", new Author());
		return "dictionary/author.html";
	}
	
	
	@PostMapping("/author")
	public String authorPOST(Model model, Author newAuthor)
	{
		try {
			authorservice.createAuthor(newAuthor);
		} catch (AuthorAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "dictionary/author.html";
	}
}
