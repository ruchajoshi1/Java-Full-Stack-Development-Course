/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class Factorial_Iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int result = 1;
		for(int i=num;i>0;i--) {
			result = result * i;
		}
		System.out.println(num + " factorial is: " + result);

	}

}
