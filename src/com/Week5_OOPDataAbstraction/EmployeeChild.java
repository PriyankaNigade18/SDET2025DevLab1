package com.Week5_OOPDataAbstraction;

public class EmployeeChild extends Employee
{

	
	public void accept()
	{
		System.out.println("child class accept method!");
	}
	@Override
	public void displayEmployeeDetails() {

		System.out.println("Child display Details of Employee!");
		
	}
	
	public static void main(String[] args)
	{

		System.out.println("Scenario1: Child class ref and child class object: parent+child");

		EmployeeChild c1=new EmployeeChild();
		c1.accept();//individual
		c1.createNewEmployee();//inherited method
		c1.displayEmployeeDetails();//inherited abstract method
		
		System.out.println("Scenario2: Parent class ref and Parent class object: Invalid");
		
		//Employee e1=new Employee();
		
		System.out.println("Scenario3: Parent class ref and Child class object: Parent");
		Employee e1=new EmployeeChild();
		e1.createNewEmployee();
		e1.displayEmployeeDetails();

		
		
		
		
		

		
		
		
		
	}

	

}
