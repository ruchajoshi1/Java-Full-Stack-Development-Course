package animalInheritance;

public class Cat extends Animal{

	boolean canClimb;
	
	Cat(int numberOfLegs, boolean isPet, boolean canClimb) {
		super(numberOfLegs, isPet);
		this.canClimb = canClimb;
	}
	
	//overridden from animal class
	//void sound() {
	//	System.out.println("Sub-class: Since I am an animal, I can make sound! Cat meaow!");
	//}
	
	//only for this class
	void catchMouse() {
		System.out.println("Sub-class: I can catch mouse!!");
	}
	
	//not overridden as sibling method not from parent
	void walk() {
		System.out.println("Sub-class: Dog only can walk forward!");
	}
}
