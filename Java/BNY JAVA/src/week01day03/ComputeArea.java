/**
 * 
 */
package week01day03;
import java.util.Scanner;
/**
 * @author rucha.joshi
 * Compute the area of the circle for given radius
 */
public class ComputeArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		
		//Assign a radius
		//radius = 25.5;
		
		//Ask user to enter the input
		System.out.println("Please enter the radius of the circle:");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		//Compute the area
		area = radius * radius * 3.14159;
				
		System.out.println("The area of the circle with radius " + radius + " is " + area);
				
		}

}
