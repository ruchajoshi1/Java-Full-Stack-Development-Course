package com.bnym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Applicant;

@Controller
public class LoginController {
		
	  @RequestMapping("/") 
	  public ModelAndView home() { 
		  ModelAndView mav = new ModelAndView("index"); 
		  return mav; 
	  }
	 
	
	@RequestMapping("/validateLogin")
	public ModelAndView validateLogin (
			@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password,
			Model applicant) {
		
		applicant.addAttribute("applicant", new Applicant());
		
		if(email.equals("r@gmail.com") && password.equals("one1")) {
			ModelAndView model = new ModelAndView("loginSuccess");
			model.addObject("msg", "Login Successful!");
			return model;
		}

		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "Invalid credentials, please try again!");
		return model;
		}
	
}
