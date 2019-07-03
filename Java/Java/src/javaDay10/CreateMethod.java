/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class CreateMethod {

	/**
	 * @param args
	 */
	
	public static int myPrint() {
		int x=5;
		//int[] arr = {1,2,3,4,5};
		System.out.println("In the method");
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(5 == myPrint()) {
			System.out.println("return from method");
		}
		
		int x = 5;
		{
			int y = 6;
			System.out.print(x + " " + y);
		}
		//System.out.print(x + " " + y); y is outside of scope
		
		System.out.println();
		
		//if (x = true) {} x is integer and rue is boolean so can not compare.
		
		//int z = 'a'; //int data type can have letters as a value.
			
	}

}
