/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	
	public static int fibo(int num) {
		if(num==0) {
			return 0;
		} else if(num==1) {
			return 1;
		} else {
			return fibo(num-1) + fibo(num-2);
		} 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		//int[] fib = new int[n];
		
		int result = fibo(n);
		
		System.out.println(n + " Fibonacci number is: " + result);

	}

}
