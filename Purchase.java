package com.productDetails;

import java.sql.SQLException;
import com.productDetails.*;
public class Purchase {

	public void display() throws SQLException, NumberFormatException
	{
		System.out.println("WELCOME FOR E-SHOPPING");
		Cart cart = new Cart();
		cart.login();
		cart.displays();		
		cart.selectProduct();
		cart.show();
		cart.replace();
		cart.history();
		
		
		
	}
	
	
	public static void main(String[] args) throws SQLException , NumberFormatException{
		Purchase purchase=new Purchase();
		purchase.display();
	}

}
