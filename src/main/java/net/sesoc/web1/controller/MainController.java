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
		
		// 현재 날짜기능 추가 및 bmi값의 출력포맷을 수정
		LocalDateTime today= LocalDateTime.now();
		String now = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
				       .format(today);
		
		double temp = height * 0.01;
		double bmi = weight / Math.pow(temp, 2);
		String userBMI = String.format("%.2f", bmi);
		
		model.addAttribute("now", now);
		model.addAttribute("bmi", userBMI);
		
		return "index";
	}
}
