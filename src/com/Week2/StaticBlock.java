package com.Week2;

public class StaticBlock
{
	static String orgName;
	
	static
	{
		orgName="HSBC";
		System.out.println("Static block is calling!");
		System.out.println("Static value assigned: "+orgName);
		
	}

	public static void main(String[] args)
	{
		System.out.println("Main() is calling!");

	}

}
