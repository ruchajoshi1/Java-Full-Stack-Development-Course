package employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import jdbcConnection.Employees;

//import jdbcConnection.Employees;

public class EmployeeDAOImpl extends EmployeeAbstractDAO implements EmployeeDAOI{

	@Override
	public List<Employee> getAllEmployees(int id) {
		
		List<Employee> empList = new ArrayList<Employee>();
		try {
			this.connect();
			
			ps = conn.prepareStatement(SQL.GET_ALL_EMPLOYEES.getQuery());
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
			
				Employee employee = new Employee();
				
				 employee.setEmployeeId(rs.getInt(1));
				 employee.setFirstName(rs.getString(2));
				 employee.setLastName(rs.getString(3));
				 employee.setPhoneNo(rs.getString(4));
				 
				 empList.add(employee);				 
			 }
			
			for(Employee emp:empList) {
				emp.printEmployee();
			}
			
	} catch(SQLException e) {
		e.printStackTrace();
	}finally {
		return empList;	
	}
	}

	public Employee getEmployeeById(int id) {
		Employee employee = new Employee();
		try {
			this.connect();
			
			ps = conn.prepareStatement(SQL.GET_EMPLOYEE_BY_ID.getQuery());
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				employee.setEmployeeId(rs.getInt(1));
				employee.setFirstName(rs.getString(2));
				employee.setLastName(rs.getString(3));
				employee.setPhoneNo(rs.getString(4));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			this.dispose();
			return employee;
		}
	
	}	

}
