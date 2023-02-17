package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo {
	
	public static void main(String[] args) {
		
		try {
			//1. Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Open Connections
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/weja1?"
							+ "user=root&password=root");
			
			//3. Create statement
			Statement statement = connection.createStatement();
			ResultSet resultSet = 
					statement.executeQuery("select * from student");
			
			
			//4. Process the result
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || " 
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getLong(4));
			}
			
			//5. Close connections
			connection.close();
			statement.close();
			resultSet.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
