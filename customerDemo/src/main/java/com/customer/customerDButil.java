package com.customer;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class customerDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String UserName, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where UserName='"+UserName+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<customer> getcustomer(String UserName) {
		
		ArrayList<customer> customer = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where UserName='"+UserName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String userName = rs.getString(5);
				String password = rs.getString(6);
				
				customer cus = new customer(id,name,email,phoneNumber,UserName,password);
				customer.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return customer;	
	}
    
    public static boolean insertcustomer(String name, String email, String phoneNumber, String UserName, String password) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phoneNumber+"','"+UserName+"','"+password+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    public static boolean updatecustomer(String id, String name, String email, String phoneNumber, String UserName, String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phoneNumber+"',username='"+UserName+"',password='"+password+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    public static List<customer> getCustomerDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<customer> customer = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from customer where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String email = rs.getString(3);
    			String phoneNumber = rs.getString(4);
    			String UserName = rs.getString(5);
    			String password = rs.getString(6);
    			
    			customer cus = new customer(id,name,email,phoneNumber,UserName,password);
    			customer.add(cus);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return customer;	
    }
    
    
    
}
    
    
    
    
    
    
    
    
    
    