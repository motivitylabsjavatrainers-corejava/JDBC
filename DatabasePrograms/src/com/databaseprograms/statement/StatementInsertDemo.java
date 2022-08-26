package com.databaseprograms.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseconnection.DatabaseConnection;

public class StatementInsertDemo {

	public static void statementInsert() throws SQLException  {
			Connection con = DatabaseConnection.getConnection();
			Statement s = con.createStatement();
			try {
			int i = s.executeUpdate("insert into employee values(3,'sai',16513,'3@gmail.com','python trinee')");
			if (i != 0)
				System.out.println("one record inserted");
		} catch(SQLException e){
			System.out.println(e);
		}finally {
			con.close();
		}
	}

}
