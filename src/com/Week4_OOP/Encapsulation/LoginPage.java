package com.Week4_OOP.Encapsulation;

public class LoginPage
{
	//Encapsulation=private data +Public methods
	private String username;
	private String password;
	
	//public method
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//Business logic
	public void doLogin(String un,String psw)
	{
		System.out.println("Hello "+un+" Welcome to your profile!");
	}
	

}
