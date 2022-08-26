package databaseprograms.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.databaseconnection.DatabaseConnection;

public class PreparedStatementUpdate {

	public static void preparedUpdate() throws SQLException {
		Connection con=DatabaseConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		try {
			PreparedStatement ps = con.prepareStatement("update employee set eRole=? where eID=?;");
			System.out.println("enter role to be updated: ");
			String s=sc.next();
			System.out.println("enter id where role has to be updated: ");
			ps.setString(1, s);
			int eid=sc.nextInt();
			ps.setInt(2, eid);
			
			int i = ps.executeUpdate();
			if (i != 0)
				System.out.println("record updated");
		} finally {
			con.close();
			System.out.println("connection closed");
		}

	}

}
