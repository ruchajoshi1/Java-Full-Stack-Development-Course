/**
 * 
 */
package assignment;

/**
 * @author rucha.joshi
 *
 */
public class AllAboutMe {

	/**
	 * @param args
	 * This class prints all information about me
	 */
	public static void main(String[] args) {
		// Create variables
		String myName = "Shahparan";
		String myEyes = "Black";
		String myTeeth = "White";
		String myHair = "Black";
		int    myAge = 31;
		int    myHeight = 175;
		
		String name = "Rucha";
		String eyes = "Black";
		String teeth = "White";
		String hair = "Black";
		int    age = 34;
		int    heightInch = 61;
		
		System.out.println("Let's talk about " + myName + "." + "\n" +
				"They're " + myHeight + " centimeters tall." + "\n" +
				"They're " + myAge + " years old." + "\n" +
				"Huh, that's older than I expected... " + "\n" +
				"They have " + myEyes + " eyes and " + myHair + " hair." + "\n" +
				"Their teeth are usually " + myTeeth + ", but it depends on the coffee." + "\n" +
				"Alright, this is pretty boring. Let's stop talking about " + myName + "." );
		
		// convert height from inches to centimeters
		// 1 inch = 2.54 centimeters
		double height = heightInch * 2.54;
		
		System.out.println("\n" + "Let's talk about " + name + "." + "\n" +
				"They're " + height + " centimeters tall." + "\n" +
				"They're " + age + " years old." + "\n" +
				"Huh, that's older than I expected... " + "\n" +
				"They have " + eyes + " eyes and " + hair + " hair." + "\n" +
				"Their teeth are usually " + teeth + ", but it depends on the coffee." + "\n" +
				"Alright, this is pretty boring. Let's stop talking about " + name + "." );
	}
}
