package com.Week4_OOP.Encapsulation;

public class Account
{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance)
	{
		if(balance>=1000)
		{
		this.balance = balance;
		System.out.println("Account is activated!");
		}else
		{
			System.out.println("Insufficiant Balance..Account is not activated!");
		}
	}
	
	

}
