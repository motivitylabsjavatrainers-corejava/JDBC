package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String MySQLURL = "jdbc:mysql://localhost:3306/institution";
	    String databseUserName = "root";
	    String databasePassword = "root";
	    Connection con =null;
	    try {
	    	con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
	         if (con != null) {
	            System.out.println("Database connection is successful !!!!");
	        }
	    } catch (Exception e) {
	         e.printStackTrace();
	      }
	    return con;
	}
}