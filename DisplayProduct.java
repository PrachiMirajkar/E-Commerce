package com.productDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.ConnectionDB;

public class DisplayProduct {

	ConnectionDB connectionDB = new ConnectionDB();
	Connection con2 = connectionDB.getConnection();
	public void displayData() throws SQLException {
		
		
		PreparedStatement prep = con2.prepareStatement("Select * from product_details order by productname");
		
		ResultSet pre = prep.executeQuery();
		System.out.printf("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
		System.out.printf("                                                                                       PRODUCT DETAILS %n");
		System.out.printf("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
		System.out.printf("|%-15s|%-120s|%-20s|%-5s|%n ", "ProductName ","ProductDiscription","ProductPrice","ProductQuantity");
		
		while(pre.next()) {
			System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			System.out.printf("|%-15s|%-120s|%-20s|%-15s|%n ",pre.getString(4),pre.getString(2),pre.getDouble(3),pre.getDouble(5));
			
		}
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
}
	public void displayUpdatedData() throws SQLException {
		
      PreparedStatement prepa = con2.prepareStatement("Select * from update_product_details order by productname");
		
		ResultSet pre = prepa.executeQuery();
		System.out.printf("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
		System.out.printf("                                                                                       PRODUCT DETAILS %n");
		System.out.printf("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
		System.out.printf("|%-15s|%-120s|%-20s|%-5s|%n ", "ProductName ","ProductDiscription","ProductPrice","ProductQuantity");
		
		while(pre.next()) {
			System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			System.out.printf("|%-15s|%-120s|%-20s|%-15s|%n ",pre.getString(4),pre.getString(2),pre.getDouble(3),pre.getDouble(5));
			
		}
		System.out.printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
	}
	
}
