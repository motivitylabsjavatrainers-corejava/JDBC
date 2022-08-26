package com.databaseprograms.postgrespreparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.databaseconnection.JDBCPostgreSQLConnection;

public class PostgresqlDelete {

	public static void preparedDelete() throws SQLException {
		JDBCPostgreSQLConnection o=new JDBCPostgreSQLConnection();
		Connection con=o.connect();
		Scanner sc=new Scanner(System.in);
		try {
			PreparedStatement ps = con.prepareStatement("delete from employee where eid=?");
			System.out.println("enter employee id: ");
			int c1=sc.nextInt();
			ps.setInt(1, c1);
			int i = ps.executeUpdate();
			if (i != 0)
				System.out.println("record deleted");
		} finally {
			con.close();
			System.out.println("connection closed");
		}
	
	}

}
