package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSelectCommand {

	public static void main(String[] args) throws SQLException {

		// Connection URL Syntax: jdbc:mysql://ipaddress:portnumber/db_name
		String dbURL ="jdbc:mysql://localhost:3306/emp";
		
		//Database username
		String username="root";
		
		//Database password
		String password="mysql@123456";
		
        // Query to Execute
		String query1="Select * from Employee";
		
		//Load mysql JDBC driver (new version)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create Connection to DB
		Connection con =DriverManager.getConnection(dbURL, username, password);
		
		//Create Statement object
		Statement stmt = con.createStatement();
		
		//Execute the SQL query
		ResultSet rs =stmt.executeQuery(query1);
		
        // Iterate through result
		while(rs.next()) {
			
			String myName=rs.getString(1);	//First column
			String myAge=rs.getString(2);	//Second column
			
			System.out.println(myName+" "+myAge);
		}
		
		//Close Resources
		rs.close();
		stmt.close();
		con.close();
		
	}

}
