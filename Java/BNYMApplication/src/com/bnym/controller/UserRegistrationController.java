
  package com.bnym.controller;
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Controller; 
  import org.springframework.web.bind.annotation.ModelAttribute; 
  import org.springframework.web.bind.annotation.RequestMapping; 
  import org.springframework.web.bind.annotation.RequestParam; 
  import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.UserRegistration; 
  import com.bnym.services.UserRegistrationService;
  
  @Controller 
  public class UserRegistrationController {
  
  @Autowired 
  private UserRegistrationService userRegistrationService;
  
	/*
	 * public UserRegistrationController() {
	 * 
	 * }
	 * 
	 * public UserRegistrationController(UserRegistrationService
	 * userRegistrationService) { this.userRegistrationService =
	 * userRegistrationService; }
	 */
  
  @RequestMapping("/newUser")
  public ModelAndView getRegistrationForm() {
	  ModelAndView model = new ModelAndView("newUser");
	  return model;
  }
  
  
  @RequestMapping("/saveUser") 
  public ModelAndView validatePassword (  
  @RequestParam(name = "password") String password,  
  @RequestParam(name = "confirm") String confirm,  
  @ModelAttribute("user") UserRegistration user) {
  
	  if(password.equals(confirm)) { 
		  ModelAndView model = new
				  ModelAndView("registrationSuccess"); 
		  model.addObject("msg",  "New user registration Successful!"); 
		  //user.setId((long)(userService.getAllUser().size()+1));
		  userRegistrationService.saveUser(user); 
		  return model; 
	  }
	  
		  ModelAndView model = new ModelAndView("newUser"); 
		  model.addObject("msg",  "Passwords do not match, please try again!"); 
		  return model; 
  }
  
  @RequestMapping("/showUsers") 
  public ModelAndView showAllusers() {
	  ModelAndView mav = new ModelAndView("showUsers"); 
	  mav.addObject("userList",userRegistrationService.getAllUsers()); 
	  return mav;
  }
  
	
  @RequestMapping("/deleteUser") 
  public ModelAndView deleteUser(UserRegistration user) {
	  
	  userRegistrationService.deleteUserById(user.getId()); 
	  ModelAndView model =  new ModelAndView("showUsers"); 
	  model.addObject("userList", userRegistrationService.getAllUsers());
	  
	  return model; 
  }
  
	
	  @RequestMapping("/editUser") public ModelAndView editUser(@RequestParam Long
	  id) { UserRegistration user = userRegistrationService.getUserById(id);
	  //applicationService.saveApplication(applicant); 
	  ModelAndView model = new ModelAndView("editUser"); 
	  model.addObject("user",user); return model; }
	  
	/*
	 * @RequestMapping("/saveUser") public ModelAndView saveUsers(UserRegistration
	 * user) {
	 * 
	 * userRegistrationService.saveUser(user); ModelAndView model = new
	 * ModelAndView("showApplicants"); model.addObject("userList",
	 * userRegistrationService.getAllUsers());
	 * 
	 * return model; }
	 */
	 
	 
  
}
 