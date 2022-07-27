package com.customer;

public class customer {
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private String UserName;
	private String password;
	public customer(int id, String name, String email, String phoneNumber, String UserName, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.UserName = UserName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public String getPassword() {
		return password;
	}
	
}
