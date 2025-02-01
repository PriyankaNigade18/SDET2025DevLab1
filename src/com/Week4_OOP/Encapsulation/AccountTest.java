package com.Week4_OOP.Encapsulation;

public class AccountTest {

	public static void main(String[] args) 
	{

		Account user1=new Account();
		user1.setBalance(500);
		System.out.println(user1.getBalance());

		System.out.println("*********************");

		user1.setBalance(2000);
		System.out.println(user1.getBalance());
	}

}
