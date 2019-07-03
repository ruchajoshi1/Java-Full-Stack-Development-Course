package interfaceActivity;

//you can implement many interfaces in one concrete class by using comma
public class ConcreteClass implements MyInterface, YourInterface {
	
	//overridden method from interface
	public void sayHello() {
		System.out.println("Hi");
		System.out.println("I am from " + MyInterface.companyName);
	}
	
	@Override
	public void shakeHand() {
		// TODO Auto-generated method stub
		System.out.println("Shake hand!!");
	}
	
	@Override
	public void letsChat() {
		// TODO Auto-generated method stub
		System.out.println("Let's chat!!");
	}
	
	//public static void main(String[] args)
	public static void main(String... args) {
		// TODO Auto-generated method stub
		ConcreteClass concreteClass = new ConcreteClass();
		
		//MyInterface myInterface = new ConcreteClass();
		
		//MyInterface.companyName = "abcd"; this gives error as it is final you can not change it
		
		concreteClass.sayHello();
		concreteClass.shakeHand();
		concreteClass.letsChat();
		
		//List myList = new ArrayList();
		
		//ArrayList<ConcreteClass> = new ArrayList<ConcreteClass>();
	}

}
