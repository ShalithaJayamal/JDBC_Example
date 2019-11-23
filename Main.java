package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		createTable();
		
		
		

	}
	public static void createTable() throws Exception
	{
		try {
			//create prepared statement if not create table\co
			
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("create table staff(name varchar(25),department varchar(5),subject_name varchar(25))");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		finally {
			System.out.println("Function is completed");
		}
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
