/**
 * 
 */
package employee;

import java.util.Scanner;

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
		
		Scanner scan = new Scanner(System.in);
		EmployeeDAOImpl employee = new EmployeeDAOImpl();
		
		System.out.println("Please enter employee Id: ");
		int id = scan.nextInt();
		
		//employee.getEmployeeById(id);
		
		System.out.println("Below are the employee details you asked for: ");
		System.out.println("Employee Id: " + employee.getEmployeeById(id).getEmployeeId());
		System.out.println("Employee First Name: " + employee.getEmployeeById(id).getFirstName());
		System.out.println("Employee Last Name: " + employee.getEmployeeById(id).getLastName());
		System.out.println("Employee Phone No: " + employee.getEmployeeById(id).getPhoneNo());
		
		scan.close();
	}

}
