package com.bnym.admission;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * Controller
 */

@Controller
public class GreetingController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");//changing the date format from mm-dd-yyyy to yyyy-mm-dd
		binder.registerCustomEditor(Date.class,"aDOB",new CustomDateEditor(sdf, false));
	}
	
	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView greeter(
			@PathVariable Map<String, String> pathVar){
		
		String userName = pathVar.get("userName");
		String countryName = pathVar.get("countryName");
		
		ModelAndView model = new ModelAndView("greetings");
		model.addObject("msg", "Hello "+userName+", you are from "+countryName+"!");
		
		return model;
	}
	
	@RequestMapping("/goodbye/{userName}")
	public ModelAndView goodbye(
			@PathVariable Map<String, String> pathVar){
		
		String userName = pathVar.get("userName");
		
		ModelAndView model = new ModelAndView("goodbye");
		model.addObject("msg", "Good bye "+userName+"!");
		
		return model;
	}
	
	@RequestMapping("/apply")
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model = new ModelAndView("admissionform");
		
		return model;
	}
	
	@RequestMapping(value = "/submitform", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@ModelAttribute Applicant applicant, BindingResult result){
		
		if(result.hasErrors()) {
			
			ModelAndView model = new ModelAndView("admissionform");
			
			return model;
		}
		
		ModelAndView model = new ModelAndView("applysuccess");
		
		return model;
	}

}
