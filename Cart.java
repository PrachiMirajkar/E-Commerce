package com.productDetails;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.connection.ConnectionDB;

public class Cart extends LoginDetails {

	ConnectionDB connectionDB = new ConnectionDB();
	int headphonesQty, speakerQty, cameraQty, washingMachineQty, acQty, printerQty, fanQty, iPadQty, heaterQty,
	smartWatchQty;
	int headphonesAmt, speakerAmt, cameraAmt, washingMachineAmt, acAmt, printerAmt, fanAmt, iPadAmt, heaterAmt,
			smartWatchAmt;
	static int headphonesRemainQty = 10;
	static int speakerRemainQty = 10;
	static int cameraRemainQty = 10;
	static int washingMachineRemainQty = 10;
	static int acRemainQty = 10;
	static int printerRemainQty = 10;
	static int fanRemainQty = 10;
	static int iPadRemainQty = 10;
	static int heaterRemainQty = 10;
	static int smartWatchRemainQty = 10;
	static double amount = 0;
	int temp;
	int temp1;
	static int qty = 0;
	int execute;
	int execute2;
	LoginDetails l1 = new LoginDetails();
	public void login() throws SQLException {
		
		l1.CheckLoginCredentials();
	}
	public void displays() throws SQLException {
		DisplayProduct dp = new DisplayProduct();
		dp.displayUpdatedData();
	}
	

	public void selectProduct() throws SQLException {

		Connection con1 = connectionDB.getConnection();

		String choice = "yes";
		
		String uSerchoice;

		for (int i = 1; i > 0; i++) {

			System.out.println("WANT TO BUY ?");
			Scanner sc = new Scanner(System.in);
			uSerchoice = sc.nextLine();

			if (uSerchoice.equalsIgnoreCase(choice)) {

				System.out.println("ADD PRODUCT TO CART FROM TABLE");

				String productname = sc.next();

				switch (productname) {
				case "Headphones":

					PreparedStatement pre = con1.prepareStatement("Select * from update_product_details where productid=1");
					ResultSet re = pre.executeQuery();
					while (re.next()) {
						System.out.println("PRODUCT NAME >>" + re.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re.getString(2));
						System.out.println("PRICE >>" + re.getLong(3));
						System.out.println("AVAILABLE QTY >>" + headphonesRemainQty);

					}
					System.out.println("Enter Headphones Qty");
					qty = sc.nextInt();
					
					temp = headphonesRemainQty - qty;
					headphonesRemainQty = temp;
					
					if(qty>0 && headphonesRemainQty>=qty ) {
					temp1 = qty * 2000;

					headphonesAmt = temp1 + headphonesAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + headphonesAmt);
					headphonesQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "Speaker":

					PreparedStatement pre1 = con1.prepareStatement("Select * from update_product_details where productid=2");
					ResultSet re1 = pre1.executeQuery();
					while (re1.next()) {
						System.out.println("PRODUCT NAME >>" + re1.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re1.getString(2));
						System.out.println("PRICE >>" + re1.getLong(3));
						System.out.println("AVAILABLE QTY >>" + speakerRemainQty);

						System.out.println("Enter Speaker Qty");
						qty = sc.nextInt();
						temp = speakerRemainQty - qty;
						speakerRemainQty = temp;
						
                        if(qty>0 && speakerRemainQty>=qty) {
						temp1 = qty * 4000;

						speakerAmt = temp1 + speakerAmt;
						System.out.println("AMOUNT FOR THIS PRODUCT >>  " + speakerAmt);
						speakerQty=qty;
                        }
                        
						else {
							System.out.println("PRODUCT IS OUT OF STOCK");
						}

					}

					break;

				case "Camera":

					PreparedStatement pre2 = con1.prepareStatement("Select * from update_product_details where productid=3");
					ResultSet re2 = pre2.executeQuery();
					while (re2.next()) {
						System.out.println("PRODUCT NAME >>" + re2.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re2.getString(2));
						System.out.println("PRICE >>" + re2.getLong(3));
						System.out.println("AVAILABLE QTY >>" + cameraRemainQty);

						System.out.println("Enter Camera Qty");
						qty = sc.nextInt();
					}
					temp = cameraRemainQty - qty;
					cameraRemainQty = temp;
					
					if(qty>0 && cameraRemainQty>=qty) {
					temp1 = qty * 10000;

					cameraAmt = temp1 + cameraAmt;
             
					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + cameraAmt);
					cameraQty=qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "WashingMachine":

					PreparedStatement pre3 = con1.prepareStatement("Select * from update_product_details where productid=4");
					ResultSet re3 = pre3.executeQuery();
					while (re3.next()) {
						System.out.println("PRODUCT NAME >>" + re3.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re3.getString(2));
						System.out.println("PRICE >>" + re3.getLong(3));
						System.out.println("AVAILABLE QTY >>" + washingMachineRemainQty);

						System.out.println("Enter SWashingMachine Qty");
						qty = sc.nextInt();
					}
					temp = washingMachineRemainQty - qty;
					washingMachineRemainQty = temp;
					
					if(qty>0 && washingMachineRemainQty>=qty) {
					temp1 = qty * 12000;

					washingMachineAmt = temp1 + washingMachineAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + washingMachineAmt);
					washingMachineQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}

					break;

				case "AC":

					PreparedStatement pre4 = con1.prepareStatement("Select * from update_product_details where productid=5");
					ResultSet re4 = pre4.executeQuery();
					while (re4.next()) {
						System.out.println("PRODUCT NAME >>" + re4.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re4.getString(2));
						System.out.println("PRICE >>" + re4.getLong(3));
						System.out.println("AVAILABLE QTY >>" + acRemainQty);
						System.out.println("Enter AC Qty");
						qty = sc.nextInt();
					}
					temp = acRemainQty - qty;
					acRemainQty = temp;
					
					if(qty>0 && acRemainQty>=qty) {
					temp1 = qty * 15000;

					acAmt = temp1 + acAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + acAmt);
					acQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "Printer":

					PreparedStatement pre5 = con1.prepareStatement("Select * from update_product_details where productid=6");
					ResultSet re5 = pre5.executeQuery();
					while (re5.next()) {
						System.out.println("PRODUCT NAME >>" + re5.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re5.getString(2));
						System.out.println("PRICE >>" + re5.getLong(3));
						System.out.println("AVAILABLE QTY >>" + printerRemainQty);

						System.out.println("Enter Printer Qty");
						qty = sc.nextInt();
					}
					temp = printerRemainQty - qty;
					printerRemainQty = temp;
					
					if(qty>0 && printerRemainQty>=qty) {
					temp1 = qty * 5000;

					printerAmt = temp1 + printerAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + printerAmt);
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "Fan":

					PreparedStatement pre6 = con1.prepareStatement("Select * from update_product_details where productid=7");
					ResultSet re6 = pre6.executeQuery();
					while (re6.next()) {
						System.out.println("PRODUCT NAME >>" + re6.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re6.getString(2));
						System.out.println("PRICE >>" + re6.getLong(3));
						System.out.println("AVAILABLE QTY >>" + fanRemainQty);

						System.out.println("Enter Fan Qty");
						qty = sc.nextInt();
					}
					temp = fanRemainQty - qty;
					fanRemainQty = temp;
					
					if(qty>0 && fanRemainQty>=qty) {
					temp1 = qty * 3000;

					fanAmt = temp1 + fanAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + fanAmt);
					fanQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "iPad":

					PreparedStatement pre7 = con1.prepareStatement("Select * from update_product_details where productid=8");
					ResultSet re7 = pre7.executeQuery();
					while (re7.next()) {
						System.out.println("PRODUCT NAME >>" + re7.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re7.getString(2));
						System.out.println("PRICE >>" + re7.getLong(3));
						System.out.println("AVAILABLE QTY >>" + iPadRemainQty);

						System.out.println("Enter iPad Qty");
						qty = sc.nextInt();
					}
					temp = iPadRemainQty - qty;
					iPadRemainQty = temp;

					
					if(qty>0 && iPadRemainQty>=qty) {
					temp1 = qty * 40000;

					iPadAmt = temp1 + iPadAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + iPadAmt);
					iPadQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "Heater":

					PreparedStatement pre8 = con1.prepareStatement("Select * from update_product_details where productid=9");
					ResultSet re8 = pre8.executeQuery();
					while (re8.next()) {
						System.out.println("PRODUCT NAME >>" + re8.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re8.getString(2));
						System.out.println("PRICE >>" + re8.getLong(3));
						System.out.println("AVAILABLE QTY >>" + heaterRemainQty);

						System.out.println("Enter Heater Qty");
						qty = sc.nextInt();

					}
					temp = heaterRemainQty - qty;
					heaterRemainQty = temp;

					
					if(qty>0 && heaterRemainQty>=qty) {
					temp1 = qty * 10000;

					heaterAmt = temp1 + heaterAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + heaterAmt);
					heaterQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}
					break;

				case "SmartWatch":

					PreparedStatement pre9 = con1.prepareStatement("Select * from update_product_details where productid=10");
					ResultSet re9 = pre9.executeQuery();
					while (re9.next()) {
						System.out.println("PRODUCT NAME >>" + re9.getString(4));
						System.out.println("PRODUCT DISCRIPTION  >>" + re9.getString(2));
						System.out.println("PRICE >>" + re9.getLong(3));
						System.out.println("AVAILABLE QTY >>" + smartWatchRemainQty);

						System.out.println("Enter SmartWatch Qty");
						qty = sc.nextInt();
					}
					temp = smartWatchRemainQty - qty;
					smartWatchRemainQty = temp;
					
					if(qty>0 && smartWatchRemainQty>=qty) {
					temp1 = qty * 3000;

					smartWatchAmt = temp1 + smartWatchAmt;

					System.out.println("AMOUNT FOR THIS PRODUCT >>  " + smartWatchAmt);
					smartWatchQty =qty;
					}
					else {
						System.out.println("PRODUCT IS OUT OF STOCK");
					}

					break;

				default:
					System.out.println("ENTERED PRODUCT IS NOT AVAILABLE. PLEASE SELECT FROM TABLE");
					System.out.println("KEEP SHOPPING...");
				}

			} else {
				
				System.out.println("THANK YOU FOR SHOPPING!");
				System.out.println("PLEASE VISIT AGAIN!");
				
				break;
			}
		}

	}

	public void show() {

		amount = headphonesAmt + speakerAmt + cameraAmt + washingMachineAmt + acAmt + printerAmt + fanAmt + iPadAmt
				+ heaterAmt + smartWatchAmt;

		System.out.println("YOUR GRAND AMOUNT  >>" + amount);
		
		
		

	}
	
	public void history() throws SQLException {
		
		Connection con6 = connectionDB.getConnection();
		PreparedStatement preps = con6.prepareStatement(
				"insert into customer_history(username,Ac,Camera,Fan,Headphones,Heater,iPad,Printer,SmartWatch,Speaker,WashingMachine,amount)values(?,?,?,?,?,?,?,?,?,?,?,?)");
		preps.setString(1, l1.username);
		preps.setInt(2, acQty);
		preps.setInt(3,cameraQty);
		preps.setInt(4, fanQty);
		preps.setInt(5,headphonesQty);
		preps.setInt(6, heaterQty);
		preps.setInt(7, iPadQty);
		preps.setInt(8, printerQty);		
		preps.setInt(9, smartWatchQty);	
		preps.setInt(10, speakerQty);
		preps.setInt(11, washingMachineQty);
		preps.setDouble(12, amount);
		
		execute=preps.executeUpdate();
		
		
	}
	
	
	
	public void replace() throws SQLException {
	
		Connection con4 = connectionDB.getConnection();
		PreparedStatement prep = con4.prepareStatement(
				"UPDATE update_product_details SET quantity=? WHERE productid = ?");
		prep.setInt(1, headphonesRemainQty);  
		prep.setInt(2,1);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, speakerRemainQty);  
		prep.setInt(2,2);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, cameraRemainQty);  
		prep.setInt(2,3);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, washingMachineRemainQty);  
		prep.setInt(2,4);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, acRemainQty);  
		prep.setInt(2,5);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, printerRemainQty);  
		prep.setInt(2,6);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, fanRemainQty);  
		prep.setInt(2,7);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, iPadRemainQty);  
		prep.setInt(2,8);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, heaterRemainQty);  
		prep.setInt(2,9);
		
		execute = prep.executeUpdate();
		
		prep.setInt(1, smartWatchRemainQty);  
		prep.setInt(2,10);
		
		execute = prep.executeUpdate();
		
	}
	
}
