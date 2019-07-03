/**
 * 
 */
package company_Handson;

/**
 * @author rucha.joshi
 *
 */
public class InheritanceActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Test case #1:
		//Create an instance of Manager class by calling the overloaded constructor with the 
		//below parameters
		
		Manager peter = new Manager(126534,"Peter","Chennai India",237844,65000);
		
		System.out.println("Peter's salary is: ");
		peter.calculateSalary(peter.basicSalary, peter.specialAllowance, peter.hra);

		//Test case #2:
		//Create an instance of Trainee class by calling the overloaded constructor with the
		//below parameters

		Trainee jack = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Jack's salary is: ");
		jack.calculateSalary(jack.basicSalary, jack.specialAllowance, jack.hra);
		
		System.out.println("Peter's transport allowance is: ");
		peter.calculateTransportAllowance(peter.basicSalary);
		
		System.out.println("Jack's transport allowance is: ");
		jack.calculateTransportAllowance(jack.basicSalary);

	}
}
