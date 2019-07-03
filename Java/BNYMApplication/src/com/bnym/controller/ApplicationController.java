package com.bnym.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Applicant;
import com.bnym.services.ApplicationService;

@Controller
public class ApplicationController {
	
//	@Autowired
//	ApplicantService applicantService;
	
	// Constructor based Dependency Injection
	private ApplicationService applicationService;

	public ApplicationController() {

	}

	@Autowired
	public ApplicationController(ApplicationService applicationService) {
	this.applicationService = applicationService;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//changing the date format from mm-dd-yyyy to yyyy-mm-dd
		binder.registerCustomEditor(Date.class,"aDOB",new CustomDateEditor(sdf, false));
	}
	
	@RequestMapping(value="/apply", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm(Model applicant){
		
		applicant.addAttribute("applicant", new  Applicant());
		
		ModelAndView mnv = new ModelAndView("newApplication");
		mnv.addObject("msg", "Welcome to application portal!");
		
		return mnv;
	}
	
	@RequestMapping(value = "/saveApplication", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result){
		
		if(result.hasErrors()) {
			
			ModelAndView model = new ModelAndView("newApplication");
			
			return model;
		}
		
		//applicant.setId((long) (applicantService.getAllApplicant().size()+1));
		applicationService.saveApplication(applicant);
		ModelAndView model = new ModelAndView("applySuccess");
		
		return model;
	}
	
	@RequestMapping("/showApplicants")
	public ModelAndView showAllApplicants() {
		ModelAndView model = new ModelAndView("showApplicants");
		model.addObject("applicantList", applicationService.getAllApplications());		
		return model;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteApplicant(Applicant applicant) {
		
		applicationService.deleteApplicationById(applicant.getId());
		ModelAndView model = new ModelAndView("showApplicants");
		model.addObject("applicantList", applicationService.getAllApplications());
		
		return model;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editApplicant(@RequestParam Long id) {
		Applicant applicant = applicationService.getApplicationById(id);
		//applicationService.saveApplication(applicant);
		ModelAndView model = new ModelAndView("editApplicant");
		model.addObject("applicant",applicant);
		return model;
	}
	
	@RequestMapping("/save")
	public ModelAndView saveApplicant(Applicant applicant) {
		
		applicationService.saveApplication(applicant);
		ModelAndView model = new ModelAndView("showApplicants");
		model.addObject("applicantList", applicationService.getAllApplications());
		
		return model;
	}
}
