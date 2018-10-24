package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingBankUtil {

	
	public static Connection getConnection() {
		
		try {
			String url = "jdbc:postgresql://localhost:5432/postgres";
			//System.getenv("jdbc_login");
			// Using your environment variables
			String username = System.getenv("JDBC_LOGIN");
			String password = System.getenv("JDBC_PASSWORD");
			
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			return null;
		}
		
	}
}
