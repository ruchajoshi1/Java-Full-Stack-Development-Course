/**
 * 
 */
package animalInheritance;

/**
 * @author rucha.joshi
 *
 */
public class Animal {

	/**
	 * @param args
	 */
	int numberOfLegs;
	boolean isPet;
	
	//constructor to restrict parameters
	Animal(int numberOfLegs, boolean isPet){
		this.numberOfLegs = numberOfLegs; //use this to make the differentiation from both variables
		this.isPet = isPet;
	}
	
	//sound method - static method can be accessed from child class but can not be overridden
	//static void sound(){
	//private static void sound(){
	void sound() {
		// can be used only is animal class not inherited to child classes
		System.out.println("Super: Since I am an animal, I can make sound!!");
	}
	
	public void getSound() {
		sound();
	}
	
	void gotLife() {
		System.out.println("Super: Since I am an animal, I Live!!");
	}
}
