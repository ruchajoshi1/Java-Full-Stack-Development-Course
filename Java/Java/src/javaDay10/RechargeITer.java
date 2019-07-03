/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class RechargeITer {

	/**
	 * @param args
	 */
	//class variables;
	
	String name;
	String commitId;
	String email;
	String buddyName;
	int score;
	String awsId;
	
	//create a static method
	public static void printMe(RechargeITer obj) {
		System.out.println(obj.name);
		System.out.println(obj.email);
		System.out.println(obj.commitId);
		System.out.println(obj.buddyName);
	}
	
	//create a non static method
	public void printMeNew() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(commitId);
		System.out.println(buddyName);
		System.out.println(score);
	}
	
	//define a constructor overwrite default constructor 
	// name is same as class name
	//parameters in the bracket are required parameters to create an object
	//parameters order is important
	RechargeITer(String name, String commitIdfromObject, String email){
		//if we don't assign values here then hose variables will have null value
		//assign values to parameters
		this.name = name;//assign parameter to variable name as variable names are same
		commitId = commitIdfromObject;//as names are different we can directly assign it
		this.email = email;
		//constructor can have logic like method but normally logic is written in separate method
	}
	
	
	//constructor with different parameters to create different object
	//for the instructor
	RechargeITer(String name, String email, int score){
		this.name=name;
		this.email=email;
		this.score = score;
	}
	
	//3rd constructor without any parameters
	RechargeITer(){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate an object of a class RechargeIter
		
		//RechargeITer student = new RechargeITer();//using default constructor
		RechargeITer student = new RechargeITer("Rucha","ADCBQJ3","rucha.joshi@bnymellon.com");// using new constructor
		//student.name = "Rucha";//property 
		//student.commitId = "ADCBQJ3";
		student.buddyName = "Julie";
		//student.email = "rucha.joshi@bnymellon.com";
		student.score = 100;
		
		printMe(student);//calling static method
		
		student.printMeNew();//calling non static method
		
		//create a list of objects
		
		RechargeITer[] pList = new RechargeITer[25]; //this array can have up to 25 objects of RechargeITer
		
		pList[0] = student; //adding object student in array.
		pList[1] = student; //we can have duplicate elements in an array.
		//pList[2] = student.name//data types are not matching can not do like this
		
		for(int i = 0;i<2;i++) {
			pList[i].printMeNew();
		}
		//i<2 as we just have 2 elements in an array otherwise we will get null point exception.
		
		//create an object with new constructor for instructor using some common properties of
		// RechargeITer as students and instructor have some common properties
		// this is called polymorphism
		
		RechargeITer instructor = new RechargeITer("Instructor1","ins@gmail.com",100);
		
		instructor.printMeNew();
		
		RechargeITer ins1 = new RechargeITer();//create a new constructor without any parameters
		
		ins1.printMeNew();
		
	}

}
