package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrintEmployeeDetails {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// Register a driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "db_user";
		String password = "Pass123";
				
		//Connection object
		Connection conn = DriverManager.getConnection(url, user, password);
		
		/*
		if(conn.isValid(1)) {
			System.out.println("You have a valid connection.");
		}else {
			System.out.println("Check your connection. There is some problem.");
		}
		*/
		
		String sql = "SELECT * FROM JPAEMPLOYEENEW WHERE EMPLOYEEID >= 2 AND EMPLOYEEID <= 10";
		
		Statement stmt =  conn.createStatement();
		
		ResultSet result = stmt.executeQuery(sql);
		 
		
		
		List<Employees> empList = new ArrayList<Employees>();
		 
		while(result.next()) {
			
			Employees employee = new Employees();
			//employee = new Employees(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
//			
			 employee.setEmployeeId(result.getInt(1));
			 employee.setFirstName(result.getString(2));
			 employee.setLastName(result.getString(3));
			 employee.setPhoneNo(result.getString(4));
			 
			 empList.add(employee);
			 
		 }
		 //System.out.println(employee.getEmployeeId());
		
		 //call print method
		 //employee.printEmployee();
		
		for(Employees emp:empList) {
			emp.printEmployee();
		}
		
		//close result set and connection
		result.close();
		conn.close();
		 
		//ResultSet results = stmt.executeQuery(sql);
				

	}

}
