/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class Slide30_TraceArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = new int[5];
		for(int i =1; i<5; i++) {
			value[i] = i + value[i-1];
		}
		value[0] = value[1] + value[4];

		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
	}

}
