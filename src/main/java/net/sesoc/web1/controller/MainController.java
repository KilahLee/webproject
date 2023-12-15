package net.sesoc.web1.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		

		
		return "index";
	}
}
