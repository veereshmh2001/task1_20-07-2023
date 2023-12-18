package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("invoking in jdbc");
		String jdbcUrl = "jdbc:mysql://localhost:3306/Location";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "Select * From  LocationList ";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle excepti1on
			e.printStackTrace();
		}
		Statement stat = null;
		try {
			Connection connect = DriverManager.getConnection(jdbcUrl, userName, password);
		    stat = connect.createStatement();
			ResultSet rs = stat.executeQuery(query);
			while (rs.next()) {
				System.out.println("Result present in resurlt");
				int id= rs.getInt("Id");
				String name= rs.getString("name");
				String city= rs.getString("city");
				int pincode= rs.getInt("pincode");
				String state= rs.getString("state");
				System.out.println("id: " + id+ "name: " + name+ "city: " + city+ "pincode: " + pincode+ "state: " + state);
			}
			System.out.println("fetched all record");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			System.out.println("Closing ");
			if(stat!=null) {
		}try {
			stat.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		}

	}

}
