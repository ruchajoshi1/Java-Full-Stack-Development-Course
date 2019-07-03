/**
 * 
 */
package javaHackerRank;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Java_StaticInitializer {

	/**
	 * @param args
	 * Java Static Initializer Block
	 * Static initialization blocks are executed when the class is loaded, 
	 * and you can initialize static variables in those blocks.
	 */
	
	     static int B;
	     static int H;
	     static boolean flag;

	    static {
	        Scanner scan = new Scanner(System.in);
	        B = scan.nextInt();
	        H = scan.nextInt();
	        scan.close();
	        if (B <= 0 || H <= 0) {
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	            flag = false;
	        } else {
	            flag = true;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (flag) {
            int area = B * H;
            System.out.print(area);
        }

	}

}
