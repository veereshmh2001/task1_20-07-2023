package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExcecution {

	public static void main(String[] args) {
		System.out.println("invoking in jdbc");
		String jdbcUrl = "jdbc:mysql://localhost:3306/Location";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle excepti1on
			e.printStackTrace();
		}
		
		
		
		String updateQuery2 = "UPDATE LocationList set city='BANGALORE', state='KARNATAKA' where name='s1'";
		String updateQuery3 = "UPDATE LocationList set city='Panaji', state='Goa' where name='s2'";
		String updateQuery4 = "UPDATE LocationList set city='Mumbai', state='Maharastra' where name='s3'";
		String updateQuery5 = "UPDATE LocationList set city='Chennai', state='TamilNadu' where name='s4'";
		String updateQuery6 = "UPDATE LocationList set city='Hyderabad', state='Telengana' where name='s5'";
		String updateQuery7 = "UPDATE LocationList set city='Thiruvananthapuram', state='Kerala' where name='s6'";
		String updateQuery8 = "UPDATE LocationList set city='Jaipur', state='Rajasthan' where name='s7'";
		String updateQuery9 = "UPDATE LocationList set city='Gandhinagar', state='Gujarat' where name='s8'";
		
		try {
			Connection connect = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat = connect.createStatement();
			stat.executeUpdate(updateQuery2);
			stat.executeUpdate(updateQuery3);
			stat.executeUpdate(updateQuery4);
			stat.executeUpdate(updateQuery5);
			stat.executeUpdate(updateQuery6);
			stat.executeUpdate(updateQuery7);
			stat.executeUpdate(updateQuery8);
			stat.executeUpdate(updateQuery9);
			System.out.println("Data updated successfully.......");
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	

	}

}
