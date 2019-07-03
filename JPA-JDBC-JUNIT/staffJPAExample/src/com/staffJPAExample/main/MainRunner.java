/**
 * 
 */
package com.staffJPAExample.main;

import com.staffJPAExample.services.StaffServices;
import com.staffJPAExample.services.StaffServicesDAOI;

/**
 * @author rucha.joshi
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaffServicesDAOI newStaff = new StaffServices();
		
		newStaff.createTable();

	}

}
