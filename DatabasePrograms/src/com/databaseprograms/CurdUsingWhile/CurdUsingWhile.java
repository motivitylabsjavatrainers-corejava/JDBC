package com.databaseprograms.CurdUsingWhile;

import java.sql.SQLException;
import java.util.Scanner;


import databaseprograms.preparedstatements.PreparedStatementDelete;
import databaseprograms.preparedstatements.PreparedStatementInsert;
import databaseprograms.preparedstatements.PreparedStatementSelect;
import databaseprograms.preparedstatements.PreparedStatementUpdate;

public class CurdUsingWhile {
	public static void main(String[] args) throws SQLException {
			System.out.println("selelct your option:");
			System.out.println("1.insert  2.update  3.delete  4.select ");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			while(i<=4) {
			switch(i) {
			case 1:PreparedStatementInsert.preparedInsert();
					break;
			case 2:PreparedStatementUpdate.preparedUpdate();
					break;
			case 3:PreparedStatementDelete.preparedDelete();
					break;
			case 4:PreparedStatementSelect.preparedSelect();
					break;		
			default:System.out.println("\n enter valid option");		
		}

			System.out.println("selelct your option:");
			System.out.println("1.insert  2.update  3.delete  4.select ");
			i=sc.nextInt();
	}
	
}

}
