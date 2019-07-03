/**
 * 
 */
package employee;

import java.util.List;

/**
 * @author rucha.joshi
 *
 */
public interface EmployeeDAOI {
	enum SQL{
		GET_ALL_EMPLOYEES("SELECT * FROM JPAEMPLOYEENEW"),
		GET_EMPLOYEE_BY_ID("SELECT * FROM JPAEMPLOYEENEW WHERE EMPLOYEEID = ?");
		
		private final String query;
		
		private SQL (String s) {
			this.query = s;
		}
		
		public String getQuery() {
			return query;
		}
	}
	
	List<Employee> getAllEmployees(int id);
	
	Employee getEmployeeById(int id);
}
