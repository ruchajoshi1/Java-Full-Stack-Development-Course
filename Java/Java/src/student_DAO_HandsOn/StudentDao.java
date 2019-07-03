/**
 * 
 */
package student_DAO_HandsOn;

import java.util.ArrayList;

/**
 * @author rucha.joshi
 *
 */
public interface StudentDao {
	
	public ArrayList<Student> getAllStudent();
	
	public Student getStudent(int rollNo);
	
	//void updateStudent();
	
	//void deleteStudent();
	
	//void addStudent();

}
