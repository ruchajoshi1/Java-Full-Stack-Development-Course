/**
 * 
 */
package interfaceHandsOn;

/**
 * @author rucha.joshi
 *
 */
public class LibraryInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//kids user - test case 1
		
		KidUsers kid1 = new KidUsers();
		System.out.println("Kid age 10");
		kid1.age = 10;
		kid1.registerAccount();
		System.out.println("Kid age 18");
		kid1.age = 18;
		kid1.registerAccount();
		
		kid1.bookType = "Kids";
		kid1.requestBook();
		kid1.bookType = "Fiction";
		kid1.requestBook();
		
		//adult user  - test case 2
		
		AdultUsers adult1 = new AdultUsers();
		adult1.age = 5;
		adult1.registerAccount();
		adult1.age = 23;
		adult1.registerAccount();
		
		adult1.bookType = "Kids";
		adult1.requestBook();
		adult1.bookType = "Fiction";
		adult1.requestBook();

	}

}
