package fr.magikvince.dcdl.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DictionaryAdminController {

	@GetMapping("/dictionary-admin")
	public String adminPage()
	{
		return "dictionary/dictionary-admin.html";
	}
	
}
