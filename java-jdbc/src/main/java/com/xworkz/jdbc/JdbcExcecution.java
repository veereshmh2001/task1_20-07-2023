package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



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
		String query2 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(2,'s1', 'Hubli','Karnataka',580032 )";
		String query3 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(3,'s2', 'Dharwad','Karnataka',580032 )";
		String query4 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(4,'s3', 'Gadag','Karnataka',580032 )";
		String query5 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(5,'s4', 'Haveri','Karnataka',580032 )";
		String query6 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(6,'s5', 'Gabbur','Karnataka',580032 )";
		String query7 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(7,'s6', 'Davengeri','Karnataka',580032 )";
		String query8 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(8,'s7', 'Hassan','Karnataka',580032 )";
		String query9 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(9,'s8', 'Harihar','Karnataka',580032 )";
		String query10 = "INSERT INTO LocationList(id,name,city,state,pincode)VALUES(10,'s9', 'Hombal','Karnataka',580032 )";
		String updateQuery = "UPDATE LocationList set city='BANGALORE', state='KARNATAKA' where name='sa'";
		String deleteQuery = "DELETE From LocationList where name = 's1' ";
		try {
			Connection conn=DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat=conn.createStatement();
			stat.execute(query);
			stat.execute(query2);
			stat.execute(query3);
			stat.execute(query4);
			stat.execute(query5);
			stat.execute(query6);
			stat.execute(query7);
			stat.execute(query8);
			stat.execute(query9);
			stat.execute(query10);
			System.out.println("Data inserted successful....");
			stat.execute(updateQuery);
			System.out.println("Data updated successfully.......");
			stat.execute(deleteQuery);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
