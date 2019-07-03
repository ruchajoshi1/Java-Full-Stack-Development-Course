package bnym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView getHomePage(Model model) {
		//model.addAttribute("loginForm", new UserRegistration());
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

}
