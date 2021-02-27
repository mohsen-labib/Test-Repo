package com.tic.erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
//mmm
	
	//bnm
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "STU", "STU");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from TEST");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			System.out.println("Coonected");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
