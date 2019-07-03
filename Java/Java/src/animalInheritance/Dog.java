package animalInheritance;

public class Dog extends Animal {
	
	String name;
	boolean isTrained;
	
	Dog(int numberOfLegs, boolean isPet, String  name, boolean isTrained) {
		super(numberOfLegs, isPet);
		this.name = name;
		this.isTrained = isTrained;
	}
	
	//new method for dog class
	void walk() {
		System.out.println("Sub-class: Dog only can walk forward!");
	}
	
	//sound method is over ridding from animal class
	//void sound() {
	//	System.out.println("Sub-class: Since I am an animal, I can make sound! Dog barks!");
	//}
	
}
