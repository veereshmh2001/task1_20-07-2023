package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFtech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("invoking in jdbc");
		String jdbcUrl = "jdbc:mysql://localhost:3306/Location";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "Select * From  LocationList where id=9";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle excepti1on
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat = connect.createStatement();
			ResultSet rs = stat.executeQuery(query);
			if (rs.next()) {
				System.out.println("Result present in resurlt");
				System.out.println("Id ->" + rs.getInt("Id"));
				System.out.println("Name ->" + rs.getString("name"));
				System.out.println("City ->" + rs.getString("city"));
				System.out.println("Pincode ->" + rs.getInt("pincode"));
				System.out.println("State ->" + rs.getString("state"));
			}
			System.out.println("fetched record");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
