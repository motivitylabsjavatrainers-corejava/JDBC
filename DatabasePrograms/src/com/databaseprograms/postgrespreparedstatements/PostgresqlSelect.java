package com.databaseprograms.postgrespreparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.databaseconnection.JDBCPostgreSQLConnection;

public class PostgresqlSelect {

	public static void preparedSelect() throws SQLException {
		JDBCPostgreSQLConnection o=new JDBCPostgreSQLConnection();
		Connection con=o.connect();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee;");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
			}
		} finally {
			con.close();
			System.out.println("connection closed");
		}
	}

}