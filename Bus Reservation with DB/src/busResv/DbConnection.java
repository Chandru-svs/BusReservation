package busResv;

import java.sql.*;

public class DbConnection {

	private static final String url="jdbc:mysql://localhost:3306/busres";
	private static final String userName="root";
	private static final String password="Chandru@77sql";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, userName, password);
	}
}
