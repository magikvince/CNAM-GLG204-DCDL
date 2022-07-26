package fr.magikvince.dcdl.dictionary.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.dictionary.author.AuthorService;

@Controller
public class LanguageController {

	@Autowired
	AuthorService authorservice;
	
	@Autowired
	LanguageService languageservice;
	
	@GetMapping("/language")
	public String languageGET(Model model)
	{
		model.addAttribute("newLanguage", new Language());
		model.addAttribute("authors", authorservice.findAllAuthors());
		model.addAttribute("languages", languageservice.findAllLanguages());
		return "dictionary/language.html";
	}
	
	
	@PostMapping("/language")
	public String languagePOST(Model model, Language newLanguage)
	{
		try {
			languageservice.createLanguage(newLanguage);
		} catch (LanguageAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/language";
	}
}
