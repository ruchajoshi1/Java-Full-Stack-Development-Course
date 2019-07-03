package student_DAO_HandsOn;

import java.util.ArrayList;
//import java.util.List;

public class StudentDaoImpl implements StudentDao {

	private ArrayList<Student> studentList;
	
	StudentDaoImpl(){
		studentList = new ArrayList<Student>(); 
		Student student1 = new Student("Robert",1);
		Student student2 = new Student("James",2);
		studentList.add(student1);
		studentList.add(student2);		
	}
	
	@Override
	public ArrayList<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentList;
	}

	public Student getStudent(int rollNo) {
		return null;		
	}

	
	/*
	 * @Override public void updateStudent() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteStudent() { // TODO Auto-generated method stub
	 * studentList.remove(o)
	 * 
	 * }
	 * 
	 * @Override public void addStudent() { // TODO Auto-generated method stub
	 * studentList.add(e);
	 * 
	 * }
	 */

}
