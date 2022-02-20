package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise3 {

		static final String DB_URL = "jdbc:mysql://localhost/ACCOUNTANT00";
		   static final String USER = "root";
		   static final String PASS = "1234";
		   
		public static void main(String[] args) throws SQLException {
			 // Open a connection
		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		    	){		      
		    	  ResultSet rs = stmt.executeQuery("Select * from Accountant");
		    	    while(rs.next()){
		    	      System.out.println("Id : " + rs.getInt("id") + ", Name : " + rs.getString("name") + ", EmailId : " + rs.getString("emailId") +" , Password : " + rs.getString("password"));
		    	    }
			         System.out.println("Database selected...");   	  
			      } catch (SQLException e) {
			         e.printStackTrace();
			      } 
			   }
			}