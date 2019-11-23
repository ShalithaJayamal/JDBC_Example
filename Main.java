package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;



public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		createTable();
		post() ;
		
		
		
		

	
	
		
		
		
	}
/*public static ArrayList<String> get() throws Exception{
		
		Connection con  = getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM EMPLOYEE Where  gid <5");
		
		Resultset result  = statement.executeQuery();
		
		ArrayList<String> array = new ArrayList<String>();
		
		While(result.next()){
		System.out.println("Name");
		
			
			
		}
		
} */
		public static void createTable() throws Exception
	{
		try {
			//create prepared statement if not create table
			
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("create table staff(name varchar(25),department varchar(5),subject_name varchar(25))");
			create.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		finally {
			System.out.println("Function is completed");
		}
	}
	public static void post() throws Exception {
		/*final String var1 = "Shalitha";
		final String var2 = "UCSC";
		final String var3 = "DB";*/
		
		try {
			Connection conn = getConnection();
			PreparedStatement posted = conn.prepareStatement("INSERT INTO staff " + "VALUES ( 'Simpson', 'Mr.', 'Springfield')");
			
			posted.executeUpdate();
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Insert completed");
			
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
