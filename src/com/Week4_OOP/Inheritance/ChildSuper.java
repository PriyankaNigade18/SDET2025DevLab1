package com.Week4_OOP.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;

	public void childIncome()
	{
		
		System.out.println("Parent id: "+super.pid);
		super.parentIncome();
		System.out.println("child id: "+cid);
		System.out.println("Child income is $17000");
	}
	
	ChildSuper()
	{
		
		super();
		System.out.println("Child class constructor.....");
		
	}

	public static void main(String[] args) 
	{

		ChildSuper c1=new ChildSuper();
		c1.childIncome();
		

	}

}
