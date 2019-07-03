package company_Handson;

public class Trainee extends Employee{

	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

}
