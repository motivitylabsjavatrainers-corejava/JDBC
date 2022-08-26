package com.databaseprograms.postgrespreparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.databaseconnection.JDBCPostgreSQLConnection;

public class PostgresqlInsert {

	public static void preparedInsert() throws SQLException {
		JDBCPostgreSQLConnection o=new JDBCPostgreSQLConnection();
		Connection con=o.connect();
		try {
			PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter employee id: ");
			int c1=sc.nextInt();
			System.out.println("enter employee Name: ");
			String c2=sc.next();
			System.out.println("enter employee PhoneNumber: ");
			int c3=sc.nextInt();
			System.out.println("enter employee email");
			String c4=sc.next();
			System.out.println("enter employee role");
			String c5=sc.next();
			
			ps.setInt(1, c1);
			ps.setString(2, c2);
			ps.setInt(3, c3);
			ps.setString(4, c4);
			ps.setString(5, c5);
			
			
			
			int i = ps.executeUpdate();
			if (i != 0)
				System.out.println("record inserted");
		} finally {
			con.close();
			System.out.println("connection closed");
		}
	}

}
