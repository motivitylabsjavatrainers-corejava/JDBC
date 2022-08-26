package com.databaseprograms.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseconnection.DatabaseConnection;

public class StatementDeleteDemo {

	public static void statementDelete() throws SQLException {
		Connection con=DatabaseConnection.getConnection();
		Statement s=con.createStatement();
		try {
			int i = s.executeUpdate("delete from employee where eID =3;");
			if (i != 0)
				System.out.println("delete query executed");
		} finally {
			con.close();
		}
		
	}

}
