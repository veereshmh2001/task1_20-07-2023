package com.xworkz.cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/cars";
		String userName = "root";
		String password = "Xworkzodc@123";     
		
		String query = "INSERT INTO carsList(id,name,state,price)VALUES(?,?,?,?)";
		
		
		try {
			Connection con= DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 2);
			pstmt.setString(2, "Inova");
			pstmt.setString(3, "Kerala");
			pstmt.setInt(4, 5500000);
			pstmt.execute();
			pstmt.setInt(1, 3);
			pstmt.setString(2, "Indigo");
			pstmt.setString(3, "Goa");
			pstmt.setInt(4, 100000);
			pstmt.execute();
			pstmt.setInt(1, 4);
			pstmt.setString(2, "Swift");
			pstmt.setString(3, "TamilNadu");
			pstmt.setInt(4, 2500000);
			pstmt.execute();
			pstmt.setInt(1, 5);
			pstmt.setString(2, "polo");
			pstmt.setString(3, "Telengana");
			pstmt.setInt(4, 5000000);
			pstmt.execute();
			pstmt.setInt(1, 6);
			pstmt.setString(2, "waganor");
			pstmt.setString(3, "Maharastra");
			pstmt.setInt(4, 4500000);
			pstmt.execute();
			pstmt.setInt(1, 7);
			pstmt.setString(2, "Alto");
			pstmt.setString(3, "Gujarat");
			pstmt.setInt(4, 1500000);
			pstmt.execute();
			pstmt.setInt(1, 8);
			pstmt.setString(2, "Mahindra500");
			pstmt.setString(3, "Jammu");
			pstmt.setInt(4, 3000000);
			pstmt.execute();
			pstmt.setInt(1, 9);
			pstmt.setString(2, "Fortuner");
			pstmt.setString(3, "Bihar");
			pstmt.setInt(4, 6000000);
			pstmt.execute();
			System.out.println("cars");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
