package com.Week2;

public class Employee 
{
	//instance data
	int empId;
	String empName;
	
	public void display()
	{
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee name is: "+empName);
	}
	

	public static void main(String[] args)
	{
		//calling
		
		Employee e1=new Employee();
		e1.empId=101;
		e1.empName="Sarang";
		e1.display();
		System.out.println("**************");
		
		Employee e2=new Employee();
		e2.empId=102;
		e2.empName="Smita";
		e2.display();
		
		
		
		
		
		
		


	}

}
