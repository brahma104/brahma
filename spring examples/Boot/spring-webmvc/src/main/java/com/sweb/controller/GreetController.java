package com.sweb.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {

	@RequestMapping("/greet.htm")
	public String showGreet(Model model) {
		model.addAttribute("today", new Date());
		return "greet";
	}

}
