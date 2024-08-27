package com.studyopedia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class Demo 
{
	public static void main(String[] args) throws Exception {
		// load the driver
		// estb the connection/make the connection()
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "12345");
//		Statement stmt = con.createStatement();
		System.out.println(con);
		Statement st=con.createStatement();																																																		
		
//		
////		String createTable="create table Emp(name varchar(20), city varchar(10))";
//		String createTable="insert into name values('nanduu','bangalore')";
////		
//		st.execute(createTable);
//	String createTable="create table customer(name varchar(20), city varchar(10))";
//	String createTable="insert into customer values('nanduu')";
//	String createTable="update set salary="5000";
//	st.execute(createTable);
//	String createTable="create table Customers(name varchar(10), city varchar(10), state varchar(10))";
	String createTable="insert into customers values('nandu', 'Banglore', 'Andhra')";
	st.execute(createTable);
	}
}


		
		

	