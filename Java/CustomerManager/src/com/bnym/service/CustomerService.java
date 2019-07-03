/**
 * 
 */
package com.bnym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entity.Customer;

/**
 * @author ahmshahparan
 *
 */

@Service("customerService")
public class CustomerService {
	
	private List<Customer> cusList = new ArrayList<>();
	public List<Customer> getAllCustomer() {
		return cusList;
	}
	
}
