package fr.magikvince.dcdl.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefinitionController {

	@GetMapping("/definition")
	public String definitionGET()
	{
		return "dictionary/definition.html";
	}
	
	@PostMapping("/definition")
	public String definitionPOST()
	{
		return "dictionary/definition.html";
	}
}
