package com.productDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.ConnectionDB;

public class ProductInfo {
	ConnectionDB connectionDB = new ConnectionDB();

	public void Details(String productdescription, long price, String productname, long quantity) throws SQLException {
		Connection con1 = connectionDB.getConnection();
		PreparedStatement pre = con1.prepareStatement(
				"insert into product_details(productdescription,price,productname,quantity)values(?,?,?,?)");
		pre.setString(2, productdescription);
		pre.setLong(3,price);
		pre.setString(4, productname);
		pre.setLong(5, quantity);

		int i = pre.executeUpdate();
		System.out.println("inserted recorde" + i);
	}

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter product description");
			String description = sc.nextLine();
			

			System.out.println("Enter product price");
			long price = sc.nextLong();

			System.out.println("Enter product name");
			String name = sc.next();
			

			System.out.println("Enter product quantity");
		long quantitys= sc.nextLong();
		
		
			
			
			ProductInfo productInfo = new ProductInfo();

			productInfo.Details(description, price, name, quantitys);

		}
	}


}
