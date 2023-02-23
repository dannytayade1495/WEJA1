package com.jspiders.jdbcdynamic.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicSelect {
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
	private static String query;
	private static String filePath = 
			"D:\\WEJA1\\jdbcdynamic\\resources\\db_info.properties";
	
	public static void main(String[] args) {
		
		try {
			
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection
					(properties.getProperty("dburl"), properties);
			
			query = "select * "
					+ "from student "
					+ "where id = ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, 2);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getLong(4));
			}
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
