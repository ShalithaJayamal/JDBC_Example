package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
		
		

	}
	
	public static Connection  getConnection() throws Exception
	{
		try {
			String  driver=  "com.mysql.jdbc.Driver" ;
			String  url  = "jdbc:mysql://localhost/salescompany";
			String  username = "root";
			String password = "";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is succesfull");
			
			//create prepared statement if not create table
			
			
		    
			return conn;
			
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} {
			
		}
		
		
		
		
	    	
		
		
		return null;
		
		
	}
	

}
