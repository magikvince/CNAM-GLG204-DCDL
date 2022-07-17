package fr.magikvince.dcdl.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WordController {

	@GetMapping("/word")
	public String wordGET()
	{
		return "dictionary/word.html";
	}
	
	
	@PostMapping("/word")
	public String wordPOST()
	{
		return "dictionary/word.html";
	}
}
