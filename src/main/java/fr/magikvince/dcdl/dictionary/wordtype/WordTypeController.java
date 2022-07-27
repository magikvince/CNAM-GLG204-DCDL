package fr.magikvince.dcdl.dictionary.wordtype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.dictionary.author.AuthorService;
import fr.magikvince.dcdl.dictionary.dictionary.DictionaryService;
import fr.magikvince.dcdl.dictionary.language.Language;
import fr.magikvince.dcdl.dictionary.language.LanguageService;

@Controller
public class WordTypeController {
	
	@Autowired
	AuthorService authorservice;
	
	@Autowired
	LanguageService languageservice;
	
	@Autowired
	WordTypeService wordtypeservice;

	@GetMapping("/wordtype")
	public String wordtypeGET(Model model)
	{
		model.addAttribute("newWordType", new WordType());
		model.addAttribute("authors", authorservice.findAllAuthors());
		model.addAttribute("languages", languageservice.findAllLanguages());
		model.addAttribute("wordtypes", wordtypeservice.findAllWordTypes());
		return "dictionary/wordtype.html";
	}
	
	
	@PostMapping("/wordtype")
	public String wordtypePOST(Model model, WordType newWordType)
	{
		try {
			wordtypeservice.createWordType(newWordType);
		} catch (WordTypeAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/wordtype";
	}
}
