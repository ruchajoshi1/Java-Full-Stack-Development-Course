/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 * find the factorial using recursion
 */
public class Factorial_Recursion {

	/**
	 * @param args
	 */
	public static double factorial(double num) {
		if(num==0) {
			return 1;
		}else {
		return num * factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to get factorial for large number used double here otherwise int also works
		double num = 3;
		
		double result  = factorial(num);
		
		System.out.println(num + " factorial" + " is " + result);
	}

}
