package fr.magikvince.dcdl.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LanguageController {

	@GetMapping("/language")
	public String languageGET()
	{
		return "dictionary/language.html";
	}
	
	
	@PostMapping("/language")
	public String languagePOST()
	{
		return "dictionary/language.html";
	}
}
