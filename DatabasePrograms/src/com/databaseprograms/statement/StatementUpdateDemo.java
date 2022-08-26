package com.databaseprograms.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseconnection.DatabaseConnection;

public class StatementUpdateDemo {

	public static void statementUpdate() throws SQLException {
		Connection con=DatabaseConnection.getConnection();
		Statement s=con.createStatement();
		int i=s.executeUpdate("update employee set ePhoneNumber=156116 where eID =2 ;");
		if (i != 0)
			System.out.println("updated successfully");
	}
	}


