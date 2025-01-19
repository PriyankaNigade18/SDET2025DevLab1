package com.Week2;

import java.util.Scanner;

public class RuntimeparameterPassing
{

	public void add(int a,int b )//a=num1 b=num2
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		RuntimeparameterPassing r1=new RuntimeparameterPassing();
		r1.add(num1,num2);
		
		int result=r1.sub(num1, num2);
		System.out.println("subtraction is: "+result);
		
		

	}

}
