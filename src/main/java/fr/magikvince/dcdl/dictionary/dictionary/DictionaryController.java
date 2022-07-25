package fr.magikvince.dcdl.dictionary.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.dictionary.author.AuthorService;
import fr.magikvince.dcdl.dictionary.language.LanguageService;

@Controller
public class DictionaryController {

	@Autowired
	AuthorService authorservice;
	
	@Autowired
	LanguageService languageservice;
	
	@Autowired
	DictionaryService dictionaryservice;
	
	
	@GetMapping("/dictionary")
	public String dictionaryGET(Model model)
	{
		model.addAttribute("newDictionary", new Dictionary());
		model.addAttribute("authors", authorservice.findAllAuthors());
		model.addAttribute("languages", languageservice.findAllLanguage());
		model.addAttribute("dictionaries", dictionaryservice.findAllDictionaries());
		
		return "dictionary/dictionary.html";
	}
	
	
	@PostMapping("/dictionary")
	public String dictionaryPOST(Model model, Dictionary newDictionary)
	{
		try {
			dictionaryservice.createDictionary(newDictionary);
		} catch (DictionaryAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:/dictionary";
	}
}
