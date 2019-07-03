package company_Handson;

public class Manager extends Employee {

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);//sending this info 
		this.basicSalary = salary;
		
	}
	
	//method to calculate transport allowance for manager - method overriding
	public static void calculateTransportAllowance(double basicSalary) {
		double transportAllowance;
		transportAllowance = 15.0/100*basicSalary;
		System.out.println(transportAllowance);
	}

}
