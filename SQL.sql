CREATE TABLE Login_Details (
	
    username varchar(255)primary key not null,
    userpassword varchar(255)
     
    
  
);
Create table customer_history(
username varchar(255),
AC int(10) default null,
Camera int(10) default null,
Fan int(10) default null,
Headphones int(10) default null,
Heater int(10) default null,
iPad int(10) default null,
Printer int(10) default null,
SmartWatch int(10) default null,
Speaker int(10) default null,
WashingMachine int(10) default null,
amount decimal(10,0),
foreign key (username) references login_details(username) 

);
CREATE TABLE Update_Product_Details (
    productid int (10) not null auto_increment,
    productdescription varchar(255),
    price decimal(10,0),
    productname varchar(255),
    quantity decimal(10,0),
    primary key(productid)
    
    
);
CREATE TABLE product_details (
    productid int (10) not null auto_increment,
    productdescription varchar(255),
    price decimal(10,0),
    productname varchar(255),
    quantity decimal(10,0),
    primary key(productid)
    
    
);
