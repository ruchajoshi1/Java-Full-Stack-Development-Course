/**
 * 
 */
package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

/**
 * @author rucha.joshi
 * 
 * main runner for the Student Services and Course Services
 *
 */
public class SMSRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate scanner
		Scanner scan = new Scanner(System.in);
		
		//create student and course objects
		StudentDAO student = new StudentService();
		CourseDAO course = new CourseService();
		
		//print menu
		System.out.println("Welcome to School Management System.");
		System.out.println("Are you a student?");
		System.out.println("Please select the option from below: ");
		System.out.println("1. Student");
		System.out.println("2. Quit");
		int option = scan.nextInt();
		scan.nextLine();
		
		//according to the option selections do next actions
		switch(option) {
		case 1:	//validate email and password for login
				System.out.println("Please enter your email: ");
				String userEmail = scan.nextLine();
				System.out.println("Please enter your password: ");
				String userPassword = scan.nextLine();
				//call validateStudent method
				if(student.validateStudent(userEmail, userPassword)) {
					System.out.println("You are logged in successfully.");
					System.out.println();
					//getting all the courses for the user
					List<Course> userCourses = student.getStudentCourses(userEmail);
					//check if user doesn't have nay courses
					if(userCourses.size()== 0) {
						System.out.println("You are not registered for any courses.");
						System.out.println("Would you like to register for any courses?");
						System.out.println();
					}
					//print courses for a student
					if(userCourses.size()>0) {
						System.out.println("Your courses: ");
						System.out.printf("%-10s %-30s %-30s \n","ID","COURSE NAME","INSTRUCTOR NAME");
						for(Course courses:userCourses) {
							courses.printCourse();
						}
					}	
					System.out.println();
					System.out.println("Please select from the following options: ");
					System.out.println("1. Register to Class");
					System.out.println("2. logout");
					int newOption = scan.nextInt();
					
					switch(newOption) {
					case 1: //register for a new course	
							System.out.println();
							System.out.println("Please find the list of all the courses we have: ");
							List<Course> allCourses = course.getAllCourses();
							//print available course list
							System.out.printf("%-10s %-30s %-30s \n","ID","COURSE NAME","INSTRUCTOR NAME");
							for(Course allCourseList: allCourses) {
								allCourseList.printCourse();
							}
							System.out.println();
							System.out.println("Please select the course Id you would like to register:");
							int userCourseId = scan.nextInt();
							//register student for selected course Id
							student.registerStudentToCourse(userEmail, userCourseId);
							System.out.println();
							//print updated course list
							System.out.println("Your updated course list is: ");
							List<Course> updatedCourses = student.getStudentCourses(userEmail);
							System.out.println();
							System.out.printf("%-10s %-30s %-30s \n","ID","COURSE NAME","INSTRUCTOR NAME");
							for(Course c:updatedCourses) {
								c.printCourse();
							}
							System.out.println();
							System.out.println("You have been signed out.");
							System.out.println("Thank you for using School Management System.");							
							System.exit(0);
					case 2: System.out.println("You are logged out.");
							System.out.println("Thank you for using School Management System.");
							System.exit(0);
					default: System.out.println("Sorry wrong option.");
							 System.exit(0);						
					} 					
				}else {
					System.out.println("Sorry your credentials are not matching.");
					System.exit(0);
				}
				break;
		case 2: System.out.println("Thank you for using School Management System.");
				System.exit(0);
		default: System.out.println("Sorry wrong option.");		
				 System.exit(0);
		}
		
		scan.close();
	}

}
