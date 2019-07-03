/**
 * 
 */
package week01day03;

import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class Shape {

	//attributes of a class
	double radius;
	double width;
	double length;
	
	//constructor definition
	public Shape(double radius) {
		this.radius = radius;
		// this.radius is referring to radius of a class Shape attribute
	}
	
	public static void main(String[] args) {
		
		//asking radius input from the user.
		System.out.println("What is the radius of the circle? ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		input.close();
		//calling the constructor
		Shape circle = new Shape(radius); 
		//if following default constructor so not providing the data as parameter
		//if we define constructor then we need to pass the parameter.
		
		System.out.println(circle); //his will give the address not the data
		System.out.println(circle.radius);//this will give the value of the radius
		
		double area = circle.radius*circle.radius*3.14519;
		
		System.out.println("Area of the circle:" + area);
	}

}
