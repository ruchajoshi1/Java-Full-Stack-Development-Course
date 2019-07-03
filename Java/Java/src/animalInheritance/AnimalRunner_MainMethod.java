/**
 * 
 */
package animalInheritance;

/**
 * @author rucha.joshi
 *
 */
public class AnimalRunner_MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal(4,false);
		
		a1.sound();
		a1.gotLife();
		
		Animal dog1 = new Dog(4,true,"Biscuit",false);
		
		dog1.getSound();//overriding dog method from animal class
		dog1.gotLife();// getting from animal class
		//dog1.walk();//this gives error as Animal class is used to initialize

		Dog dog2 = new Dog(4,true,"Biscuit",false);
		System.out.println("Dog: ");
		dog2.sound();//overriding dog method from animal class
		dog2.gotLife();// getting from animal class
		dog2.walk();
		
		//Dog dog3 = new Animal(); you can not create parent from a child
		
		Cat cat1 = new Cat(4,true,true);
		System.out.println("Cat: ");
		cat1.catchMouse();
		cat1.getSound();
		cat1.gotLife();
	}

}
