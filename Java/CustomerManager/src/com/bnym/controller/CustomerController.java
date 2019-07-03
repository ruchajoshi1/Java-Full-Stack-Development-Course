/**
 * 
 */
package com.bnym.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author ahmshahparan
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Customer;
import com.bnym.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listCustomer", customerService.getAllCustomer());
		return mav;
	}

	@RequestMapping("/new")
	public ModelAndView newCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		ModelAndView mav = new ModelAndView("new_customer");
		return mav;

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.getAllCustomer().add(customer);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}

	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam long id) {
		Customer customer = customerService.getAllCustomer()
				.stream()
				.filter(cust -> (int) id == (cust.getId()))
				.findAny()
				.orElse(null);
		
		customerService.getAllCustomer().remove(customer);
		
		ModelAndView mav = new ModelAndView("edit_customer");
		mav.addObject("customer", customer);
		return mav;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteCustomerForm(@RequestParam long id) {
		Customer customer = customerService.getAllCustomer()
				.stream()
				.filter(cust -> (int) id == (cust.getId()))
				.findAny()
				.orElse(null);
		customerService.getAllCustomer().remove(customer);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}

	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Customer> result = new ArrayList<>();
		Customer customer = customerService.getAllCustomer()
				.stream()
				.filter(cust -> keyword.equals(cust.getName()))
				.findAny()
				.orElse(null);
		result.add(customer);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);

		return mav;
	}
}
