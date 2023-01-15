package com.productDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.ConnectionDB;


public class LoginDetails   {

	public String username;
	public String password;
	public int execute1;
	Scanner sc=new Scanner(System.in);
	
	public void CheckLoginCredentials()throws SQLException
	{
		
		
		System.out.println("ENTER USERNAME >>");
		 username=sc.next();
		
		System.out.println("ENTER PASSWORD >>");
	   	password=sc.next();
		
		try {		
		ConnectionDB connectionDB = new ConnectionDB();
		Connection con5 = connectionDB.getConnection();
		PreparedStatement prep = con5.prepareStatement("INSERT INTO login_details(username,userpassword) values (?,?)");
		prep.setString(1,username);  
		prep.setString(2,password);
		execute1 = prep.executeUpdate();
		
		System.out.println("SUCCESSFULLY REGISTED TO E-COMMERCE");
			
	
		}
		catch(Exception e) {
			System.out.println("USERNAME ALREDY EXISTS");
			System.exit(0);
		}
		
		
		
	}
	
	
			
			
		
	
	

}
