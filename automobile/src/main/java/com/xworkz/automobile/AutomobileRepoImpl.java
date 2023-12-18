package com.xworkz.automobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;
import com.xworkz.automobile.dto.Vehicle;

public class AutomobileRepoImpl implements AutomobileRepo {

	public AutomobileRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void saveVehicleDetails(Vehicle vehicle) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "INSERT INTO vehicle(name,color,type,model)VALUES(?,?,?,?)";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, vehicle.getName());
			psmt.setString(2, vehicle.getColor());
			psmt.setString(3, vehicle.getType());
			psmt.setInt(4, vehicle.getModel());
			psmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void saveVehicleDetails(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "INSERT INTO vehicle(name,color,type,model)VALUES(?,?,?,?)";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(query);

			for (Vehicle vehicle1 : vehicle) {
				psmt.setString(1, vehicle1.getName());
				psmt.setString(1, vehicle1.getColor());
				psmt.setString(1, vehicle1.getType());
				psmt.setInt(1, vehicle1.getModel());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateVehicleDetails(Vehicle vehicle) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updatequery = "update vehicle set color=? , model=? where name=?";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(updatequery);
			psmt.setString(1, vehicle.getColor());
			psmt.setLong(2, vehicle.getModel());
			psmt.setString(3, vehicle.getName());
			psmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateVehicleDetails(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updatequery = "update vehicle set color=? , model=? where name=?";

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(updatequery);
			for (Vehicle vehicle2 : vehicle) {
				psmt.setString(1, vehicle2.getColor());
				psmt.setString(2, vehicle2.getName());
				psmt.setLong(3, vehicle2.getModel());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Vehicle> fetchAllVehicles() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "select * from vehicle";
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Vehicle vehicle = new Vehicle();
				vehicle.setName(rs.getString("name"));
				vehicle.setColor(rs.getNString("color"));
				vehicle.setType(rs.getString(4));
				vehicle.setModel(rs.getInt(5));
				vehicles.add(vehicle);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vehicles;

	}

	public void deleteVehicleByName(String name) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuery = "delete from vehicle where name = ?";
		try {
			Connection co = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement psmt = co.prepareStatement(deleteQuery);
			psmt.setString(1, name);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
