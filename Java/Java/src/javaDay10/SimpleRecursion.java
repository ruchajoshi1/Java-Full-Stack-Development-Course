/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class SimpleRecursion {

	/**
	 * @param args
	 */
	
	public static void recFun(int num) {
		if(num==0) {
			System.out.println("num:" + num);
		}else {
			num = num - 2;
			System.out.println("Each time num is: " + num);
			recFun(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		recFun(num);

	}

}
