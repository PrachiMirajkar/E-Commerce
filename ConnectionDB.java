package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "Mirajkar@0228");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}
