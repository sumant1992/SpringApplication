package in.sumant.DBConnectionTest;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection 
{
	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/employeedirectory?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "password";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
	
	
	
}
