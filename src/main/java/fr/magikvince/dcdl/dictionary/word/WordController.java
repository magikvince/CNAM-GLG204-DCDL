package fr.magikvince.dcdl.dictionary.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.magikvince.dcdl.dictionary.author.AuthorService;
import fr.magikvince.dcdl.dictionary.dictionary.DictionaryService;
import fr.magikvince.dcdl.dictionary.language.Language;
import fr.magikvince.dcdl.dictionary.wordtype.WordTypeService;

@Controller
public class WordController {
	
	@Autowired
	AuthorService authorservice;
	
	@Autowired
	DictionaryService dictionaryservice;
	
	@Autowired
	WordTypeService wordtypeservice;
	
	@Autowired
	WordService wordservice;

	@GetMapping("/word")
	public String wordGET(Model model)
	{
		model.addAttribute("newWord", new Word());
		model.addAttribute("authors", authorservice.findAllAuthors());
		model.addAttribute("dictionaries", dictionaryservice.findAllDictionaries());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("wordtypes", wordtypeservice.findAllWordTypes());
		model.addAttribute("words", wordservice.findAllWords());
		return "dictionary/word.html";
	}
	
	
	@PostMapping("/word")
	public String wordPOST(Model model, Word newWord)
	{
		try {
			wordservice.createWord(newWord);
		} catch (WordAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/word";
	}
}
