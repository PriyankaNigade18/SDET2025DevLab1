package com.Week4_OOP.Inheritance;

public class AccessModifierTest
{
	int id=101;//default
	public String name="John";
	private long phno=87655443L;
	protected int acno=777888;

	public static void main(String[] args)
	{
		//same class
		AccessModifierTest test=new AccessModifierTest();
		System.out.println(test.id);
		System.out.println(test.name);
		System.out.println(test.phno);
		System.out.println(test.acno);

	}

}
