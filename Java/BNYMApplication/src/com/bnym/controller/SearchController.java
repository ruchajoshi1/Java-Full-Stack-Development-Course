/**
 * 
 */
package com.bnym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bnym.entity.Applicant;
import com.bnym.repository.ApplicantRepository;

/**
 * @author rucha.joshi
 *
 */
@Controller
public class SearchController {
	
	@Autowired
	ApplicantRepository applicantRepository;
	
	//@PostMapping("/search) - short cut to below line
	//for url variables use path variable, method=get
	//for form variables use requestparam, method=post
	//@GetMapping("/search") - shortcut for get method and request mapping
	//@PostMapping("/search) - short cut to below line of RequestMapping
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView searchProvider(
			@RequestParam String name,
			@RequestParam String city,
			RedirectAttributes redir) {
		List<Applicant> result = new ArrayList<Applicant>();
		
		result = applicantRepository.findByaNameAndAAddressCity(name, city);
		System.out.println("Search size: " + result.size());
		
		if(result.size()!=0) {
			ModelAndView mav = new ModelAndView("showApplicants");
			mav.addObject("applicantList", result);
			mav.addObject("recordFound", result.size()+"record/s found!");
			mav.addObject("allApplications", "<a href=/BNYMApplication/showApplicants>All applicants</a>");
			return mav;
		}else {
			ModelAndView mav = new ModelAndView("redirect:/showApplicants");
			redir.addFlashAttribute("noRecord","No record found!");
			return mav;
		}
		
	}

}
