package com.Week1;

public class MethodDemo
{
	/*
	 * instance method we call using Object
	 * static method we call using className
	 * If you are calling in same class then without class name 
	 * you can call static method.
	 */
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	public static void display()
	{
		System.out.println("This is static method");
	}
	

	public static void main(String[] args)
	{
		//calling function
		
		display();
		MethodDemo.display();
		
		//object
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method display() from the type MethodDemo should be accessed in a static way
		//m1.display();
		
		
		
		
		



	}

}
