package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

;

public class JdbcExcecution {

	public static void main(String[] args) {
		System.out.println("invoking in jdbc");
		String jdbcUrl = "jdbc:mysql://localhost:3306/Location";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("Establishing a Connection");
		String query = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(1, " + "'" + "rajajinagar" + "'" + "," + "'"
		 + "bangalore" + "'" + "," + "'" + "karnataka" + "'" + ",580032)";
		try {
			Connection conn=DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat=conn.createStatement();
			stat.execute(query);
			System.out.println("Data inserted successful....");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
