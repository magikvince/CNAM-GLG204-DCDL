package fr.magikvince.dcdl.dictionary.language;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LanguageController {

	@GetMapping("/language")
	public String languageGET(Model model)
	{
		model.addAttribute("newLanguage", new Language());
		return "dictionary/language.html";
	}
	
	
	@PostMapping("/language")
	public String languagePOST(Model model)
	{
		return "dictionary/language.html";
	}
}
