package com.Week4_OOP.Polymorphism;

public class AmazonSearch 
{
	
	public void search(String pname)
	{
		System.out.println("Product search by product name: "+pname);
	}

	
	public void search(int price)
	{
		System.out.println("Product search by product price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search by product name: "+pname+" and product price: "+price);
	}
	
	public void search(int price,String pname)
	{
		System.out.println("Product search by product name: "+pname+" and product price: "+price);
	}
	
	public void search(String bname,String pname)
	{
		System.out.println("Product search by product brandname: "+bname+" and product name: "+pname);
	}
	
	
	public void search(String bname,String pname,int price)
	{
		System.out.println("Product search by product brandname: "+bname+" and product name: "+pname+" and price: "+price );
	}
}
