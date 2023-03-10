package com.form.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.main.entities.LoginData;

import jakarta.validation.Valid;

@Controller
public class DemoController {
	
//	fragment including

	@GetMapping("/form")
	public String servicesHandler(Model m) {
		System.out.println("form handler....");
//		empty instance
		m.addAttribute("loginData", new LoginData());
		return "form";
	}
	
	@PostMapping("/process")
	public String processHandler(@Valid @ModelAttribute("loginData") LoginData loginData
			,BindingResult res) {
		if (res.hasErrors()) {
			System.out.println(res);
			return "form";
		}
		
		System.out.println(loginData);
		return "success";
	}
	
	
}
