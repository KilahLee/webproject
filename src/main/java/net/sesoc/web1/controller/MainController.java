package net.sesoc.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping
	public String index() {
		return "index";
	}
	@PostMapping ("/calcBMI")
	public String calcResult(
			@RequestParam(name = "height") double height, 
			@RequestParam(name = "weight") double weight,
			Model model) {
		double temp = height * 0.01;
		double bmi = weight / Math.pow(temp, 2);
		System.out.println(bmi);
		model.addAttribute("bmi", bmi);
		return "index";
	}
}
