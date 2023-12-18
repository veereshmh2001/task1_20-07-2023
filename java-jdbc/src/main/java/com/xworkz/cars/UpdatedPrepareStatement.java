package com.xworkz.cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatedPrepareStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/cars";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "UPDATE carsList set name = ? where state = ?";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, "Endevour");
			psmt.setString(2, "Gujarat");
			
			psmt.execute();
			System.out.println("Updated");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
