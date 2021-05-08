package com.project.movies.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class GetConnection {

	public static Connection getMySQL() {

		try {

			ResourceBundle rb = ResourceBundle.getBundle("db");
			String driver = rb.getString("driver");
			String url = rb.getString("url"); 
			String name = rb.getString("name"); 
			String password = rb.getString("password"); 
			
	
			Class.forName(driver); 
			return DriverManager.getConnection(url, name, password); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null; 
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(getMySQL());
	}
//	public static Connection getOracle() {}
//	public static Connection getDB2() {}
	
}
