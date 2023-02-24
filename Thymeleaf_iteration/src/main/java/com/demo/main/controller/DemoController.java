package com.demo.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
//	@RequestMapping(value = "/about", method = RequestMethod.GET)
	@GetMapping("/about")
	public String about(Model m) {
		System.out.println("about handler....");
		
		m.addAttribute("name", "Ankush Wadode");
		m.addAttribute("Date", new Date().toLocaleString());
		
		return "about";
	}
	
//	iteration handle
	
	@GetMapping("/loop")
	public String itrhandler(Model m) {
		System.out.println("itr handler");
		
//		creating list
		List<String> names = List.of("Ankush","Tanmay","Ayush","Jay","Rj");
		
//		sending list
		m.addAttribute("names",names);
		
		return "iterate";
	}
}
