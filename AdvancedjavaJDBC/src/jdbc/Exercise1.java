/*Write a program to create a table accountant with columns id,name,emailId and password.*/


package jdbc;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Exercise1 {
	
	static final String DB_URL = "jdbc:mysql://localhost/ACCOUNTANT00";
	   static final String USER = "root";
	   static final String PASS = "1234";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	    	){		      
	          String sql = "CREATE TABLE Accountant " +
	                   "(id INTEGER not NULL, " +
	                   " name VARCHAR(255), " + 
	                   " emailId VARCHAR(255), " + 
	                   " password VARCHAR(255), " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	         System.out.println("Created table in given database...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}