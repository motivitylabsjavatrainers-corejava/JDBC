package com.databaseprograms.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseconnection.DatabaseConnection;


public class StatementSelectDemo {
	public static void statemetSelect() throws SQLException {
			Connection con = DatabaseConnection.getConnection();
			try {
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("select * from employee;");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
						+ " " + rs.getString(5));
			} 
		} finally {
			con.close();
			
		}
	}
	

}
