/**
 * 
 */
package studentCourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rucha.joshi
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Course c1 = new Course(1,"Core Java");
		Course c2 = new Course(2,"Python");
		Course c3 = new Course(3,"HTML");
		
		List<Course> l1 = new ArrayList<Course>();
		l1.add(c2);
		l1.add(c3);
		
		Student s1 = new Student(1,"Maria",l1);
		
		/*
		 * System.out.println(s1.sId); System.out.println(s1.sName);
		 * //System.out.println(l1); this is printing address for(Course c: l1) {
		 * System.out.println(c.cName); }
		 */
		
		s1.printStudent();//invoking method from student class to print s1 information
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Which course do you want to drop");
		String dropCourse = input.nextLine();
		input.close();
		s1.dropCourse(dropCourse);
		s1.printStudent();

	}

}
