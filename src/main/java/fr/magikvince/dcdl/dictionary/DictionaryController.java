package fr.magikvince.dcdl.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DictionaryController {

	@GetMapping("/dictionary")
	public String dictionaryGET()
	{
		return "dictionary/dictioanry.html";
	}
	
	
	@PostMapping("/dictionary")
	public String dictionaryPOST()
	{
		return "dictionary/dictioanry.html";
	}
}
