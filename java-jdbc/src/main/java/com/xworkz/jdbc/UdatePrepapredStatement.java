package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UdatePrepapredStatement {
	
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
		
		String query = "UPDATE LocationList set city = ? where name = ?";
		
		try {
			Connection conn= DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement pdmt= conn.prepareStatement(query);
			pdmt.setString(1, "Hubballi");
			pdmt.setString(2, "Magadi");
			
			pdmt.execute();
			System.out.println("Updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
