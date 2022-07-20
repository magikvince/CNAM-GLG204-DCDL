package fr.magikvince.dcdl.dictionary.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DictionaryController {

	@GetMapping("/dictionary")
	public String dictionaryGET(Model model)
	{
		model.addAttribute("newDictionary", new Dictionary());
		return "dictionary/dictionary.html";
	}
	
	
	@PostMapping("/dictionary")
	public String dictionaryPOST(Model model)
	{
		return "dictionary/dictionary.html";
	}
}
