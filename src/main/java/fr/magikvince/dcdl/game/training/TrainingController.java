package fr.magikvince.dcdl.game.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TrainingController {

	@GetMapping("/training")
	public String trainingGET(Model model)
	{
		return "game/training.html";
	}
	
	@PostMapping("/training")
	public String trainingPOST(Model model)
	{
		return "game/training.html";
	}
	
}
