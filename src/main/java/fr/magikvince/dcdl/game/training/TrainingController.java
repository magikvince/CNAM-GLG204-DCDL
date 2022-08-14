package fr.magikvince.dcdl.game.training;

import java.net.http.HttpRequest;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TrainingController {

	@Autowired
	TrainingService trainingservice;
	
	@GetMapping("/training")
	public String trainingGET(Model model)
	{
		return "game/training.html";
	}
	
	@GetMapping("/training/letters")
	public String trainingLettersGET(Model model)
	{
		model.addAttribute("drawnumber", Integer.valueOf(0));
		return "game/training-letters.html";
	}
	
	@GetMapping("/training/count")
	public String trainingCountGET(Model model)
	{
		model.addAttribute("drawnumber", Integer.valueOf(0));
		
		return "game/training-count.html";
	}
	
	@PostMapping("/training/count")
	public String trainingCountPOST(Integer drawnumber, Model model)
	{
		model.addAttribute("drawnumber", drawnumber);
		
		//appel du service avec le drawnumber pour obtenir une collection de DrawCount ...
		// puis ajout de cette collection et renvoie sur le template pour demarrage du jeu et affichage !!!
		return "game/training-count.html";
	}
		
	@PostMapping("/training")
	public String trainingPOST(Model model)
	{
		return "game/training.html";
	}
	
}
