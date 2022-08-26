package com.databaseprograms.CurdUsingWhile;

import java.sql.SQLException;
import java.util.Scanner;

import com.databaseprograms.postgrespreparedstatements.PostgresqlDelete;
import com.databaseprograms.postgrespreparedstatements.PostgresqlInsert;
import com.databaseprograms.postgrespreparedstatements.PostgresqlSelect;
import com.databaseprograms.postgrespreparedstatements.PostgresqlUpdate;

public class PostgresCurd {
	public static void main(String[] args) throws SQLException {
			System.out.println("selelct your option:");
			System.out.println("1.insert  2.update  3.delete  4.select ");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			while(i<=4) {
			switch(i) {
			case 1:PostgresqlInsert.preparedInsert();
					break;
			case 2:PostgresqlUpdate.preparedUpdate();
					break;
			case 3:PostgresqlDelete.preparedDelete();
					break;
			case 4:PostgresqlSelect.preparedSelect();
					break;		
			default:System.out.println("\n enter valid option");		
		}

			System.out.println("selelct your option:");
			System.out.println("1.insert  2.update  3.delete  4.select ");
			i=sc.nextInt();
	}
	
}

}
