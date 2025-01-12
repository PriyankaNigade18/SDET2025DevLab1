package com.Week1;

public class StudentData
{
	//data
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		/*
		 * To access members of a class we need Object
		 */
		StudentData s1=new StudentData();
		//s1.show();//default data
		s1.id=101;
		s1.name="Yash";
		s1.show();//original data
		
		System.out.println("*****************");
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Jay";
		s2.show();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
