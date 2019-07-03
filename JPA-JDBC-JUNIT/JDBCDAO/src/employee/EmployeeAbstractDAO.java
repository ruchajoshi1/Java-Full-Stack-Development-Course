package employee;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class EmployeeAbstractDAO {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String user = "db_user";
	private final String password = "Pass123";
	private final Driver driver =  new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	public void connect() {
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
			//throw new SQLConnectionException(e.getMessage(),url,user,password);
			System.out.println(e.getMessage());
		}
	}
	
	public void dispose() {
		try {
		if(!rs.equals(null)) {
			if(!rs.isClosed()) rs.close();
		}
		if(!ps.equals(null)) {
			if(!ps.isClosed()) ps.isClosed();
		}
		if(!conn.equals(null)) {
			if(!conn.isClosed()) conn.close();
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
