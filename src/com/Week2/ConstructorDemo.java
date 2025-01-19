package com.Week2;

public class ConstructorDemo 
{
	
	/*
	 * constructor is special method to initialize object
	 * Constructor name is similar to its class name
	 * Constructor should not have any return type
	 * Constructor can not be static,final,abstract
	 * Types
	 * =======
	 * 1.Default constructor (JVM)
	 * 2.Parameterize Constructor
	 * 
	 * Constructor overloading is possible but not overriding
	 */
	//instance
	int id;
	String name;
	
	public ConstructorDemo()
	{
		System.out.println("This is default constructor");
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	
	public ConstructorDemo(int i,String n)
	{
		//initialize instance variable
		System.out.println("This is parameterize constructor");
		//instance=local
		id=i;
		name=n;
		
		System.out.println("id is: "+id);
		System.out.println("Name is: "+name);
		
	}
	

	public static void main(String[] args)
	{
		//call
		ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo c2=new ConstructorDemo(101,"Parag");
		

	}

}
