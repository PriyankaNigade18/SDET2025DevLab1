package com.Week4_OOP.Inheritance;

public class Child extends Parent
{
	/*
	 * Parent and child class have same name method with same syntax
	 * then Parent class Method always override by child
	 * and You will get updated result from child
	 * 
	 */
	@Override
	public void color()
	{
		System.out.println("Blue");
	}

	public static void main(String[] args)
	{

		System.out.println("Scenario1: child class ref and child class object");
		
		Child c1=new Child();
		c1.color();//blue
		
		System.out.println("Scenario2:parent class ref and parent class object");

		Parent p1=new Parent();
		p1.color();//red
		
		System.out.println("Scenario3:parent class ref and child class object");

		Parent p2=new Child();
		p2.color();//blue
		
		

	}

}
