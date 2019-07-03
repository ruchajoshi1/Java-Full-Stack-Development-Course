/**
 * 
 */
package company_Handson;

/**
 * @author rucha.joshi
 * 1. Create a class Employee with the following instance variables.
 * Instance variables 	Data type
 * employeeId	long
 * employeeName	String
 * employee Address	String
 * employee Phone	Long
 * basicSalary	double
 * specialAllowance	double  default value- 250.80
 * Hra	double,default value- 1000.50
 * 
 * 2.Create an overloaded constructor in the employee class, 
 * which takes the below constructor parameters and initializes them to their respective 
 * instance variables.
 */

public class Employee {
	long employeeId;
	String employeename;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	//Employee constructor
	Employee(long id, String name, String address, Long phone){
		this.employeeId = id;
		this.employeename = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	//method to calculate salary
	public static void calculateSalary(double basicSalary, double specialAllowance, double hra) {
		double salary;
		salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
		
		System.out.println(salary);
	}
	
	//1.Add a method called calculateTransportAllowance in Employee class which should calculate the 
	//transport allowance by calculating 10% (default allowance) of the salary. Print the salary after 
	//calculating. -	transportAllowance = 10/100*basicSalary.
	
	public static void calculateTransportAllowance(double basicSalary) {
		double transportAllowance;
		transportAllowance = 10.0/100*basicSalary;
		System.out.println(transportAllowance);
	}

}
