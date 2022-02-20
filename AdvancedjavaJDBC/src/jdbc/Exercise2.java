package jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2 {
		static final String DB_URL = "jdbc:mysql://localhost/ACCOUNTANT00";
	   static final String USER = "root";
	   static final String PASS = "1234";
	   
	public static void main(String[] args) throws SQLException {
		 // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	    	){		      
	    	  String sql = "insert into Accountant values('1','anuja','anu@gmail.com','anu@123')";
	    	 
	    	  stmt.executeUpdate(sql);
	    	 
		         System.out.println("Insert Record into database...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
		}