package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/Location";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		String query = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(?,?,?,?,? )";
		
		
		try {
			Connection connect=DriverManager.getConnection(jdbcUrl, userName, password);
			java.sql.PreparedStatement pstmt=  connect.prepareStatement(query);
			System.out.println("PreParedStatement!!!!!!!!!");
			pstmt.setInt(1, 10);
			pstmt.setString(2, "Bashyam Circle");
			pstmt.setString(3, "Bangalore");
			pstmt.setString(4, "Karnataka");
			pstmt.setInt(5, 580032);
			pstmt.execute();
			pstmt.setInt(1, 11);
			pstmt.setString(2, "jayanagar");
			pstmt.setString(3, "BANGALORE");
			pstmt.setString(4, "KARNATAKA");
			pstmt.setInt(5, 580030);
			pstmt.execute();
			pstmt.setInt(1, 12);
			pstmt.setString(2, "Magadi");
			pstmt.setString(3, "BAngalore");
			pstmt.setString(4, "KA");
			pstmt.setInt(5, 580031);
			pstmt.execute();
			System.out.println("Added record.......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
