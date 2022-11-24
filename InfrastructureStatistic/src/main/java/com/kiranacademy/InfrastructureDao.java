package com.kiranacademy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class InfrastructureDao {

	public ArrayList<Bridge> fetchBridgesInfo(){
		ArrayList<Bridge> alBridges = new ArrayList<Bridge>();
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql:localhost:3306/test", "root", "root");
			String sql = "select * from bridges";
			Statement statement = connection.createStatement();	
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<Bridge> alStu = new ArrayList<Bridge>();
				while(resultSet.next()) {
					String bridgeCity = resultSet.getString(1);
					int bridgeNumber = resultSet.getInt(2);
					String bridgeLength = resultSet.getString(3);
					String bridgeWidth = resultSet.getString(4);
					Bridge bridge = new Bridge(bridgeCity ,bridgeNumber, bridgeLength, bridgeWidth);
					alStu.add(bridge);
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	return alBridges; 
	}
}
