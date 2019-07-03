package jdbcConnection;

public class Employees {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	
	
	
	
	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param phoneNo
	 */
	/*
	 * public Employees(int employeeId, String firstName, String lastName, String
	 * phoneNo) { super(); this.employeeId = employeeId; this.firstName = firstName;
	 * this.lastName = lastName; this.phoneNo = phoneNo; }
	 */
	int getEmployeeId() {
		return employeeId;
	}
	void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	String getPhoneNo() {
		return phoneNo;
	}
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	void printEmployee() {
		System.out.println(this.employeeId + " " + this.firstName + " " + this.lastName + " " + this.phoneNo);
	}
	

}
