/**
 * 
 */
package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author rucha.joshi
 *
 */
public class JdbcConnectionTest {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		// Register a driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "db_user";
		String password = "Pass123";
				
		//Connection object
		Connection conn = DriverManager.getConnection(url, user, password);
		
		if(conn.isValid(1)) {
			System.out.println("You have a valid connection.");
		}else {
			System.out.println("Check your connection. There is some problem.");
		}
		
		//creating a statement and execute it
		
		//String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEENUMBER = 1002";
		
		//String sql = "SELECT * FROM JPAEMPLOYEENEW WHERE EMPLOYEEID >= 2 "
		//		+ "AND EMPLOYEEID <=10";
		
		//String sql = "DELETE FROM JPAEMPLOYEENEW WHERE EMPLOYEEID = 100";
		
		String sql = "INSERT INTO JPAEMPLOYEENEW VALUES(100,'Cassaundra','Dorkins','535-669-0303')";
		
		Statement stmt =  conn.createStatement();
		
		stmt.executeQuery(sql);
		
		//ResultSet results = stmt.executeQuery(sql);
		
		//System.out.println(results.getString(1));
		/*
		while(results.next()) {
			System.out.print(results.getInt(1) + " ");
			System.out.print(results.getString(2) + " ");
			System.out.print(results.getString(3));
			System.out.println();
		}
		*/		
		
	}

}
