/**
 * 
 */
package javaDay09;

/**
 * @author rucha.joshi
 * Use nested for loop to generate multiplication table
 */
public class Slide47_MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			System.out.println("Multiplication table for " + i);
			for(int j=1; j<=10; j++) {				
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

	}

}
