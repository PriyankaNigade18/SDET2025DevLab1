package com.Week5_OOPDataAbstraction;

public abstract class Employee 
{
	/*
	 * Abstract class can have implemented and non implemented method
	 * in Class When method is declared without body such method called
	 * abstract method
	 * then class has to declared with abstract keyword
	 * Object is not possible to create  so we need Child class
	 * Child class implement abstract method
	 * Using this technique only partial abstraction is possible
	 */
	
	//fully implemented
	public void createNewEmployee()
	{
		System.out.println("New Employee Created!");
		
	}
	
	//abstract method
	public abstract void displayEmployeeDetails();
	
	/*public static void main(String args[])
			{
		
		Employee e1=new Employee();
		
			}
	*/
	
	
	
	
	

}
