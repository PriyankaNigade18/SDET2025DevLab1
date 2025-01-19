package com.ControlFlowSatatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args)
	{
		// true/false
		//accept number from user and test is it even or odd
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}else
		{
			System.out.println(num+" is odd");
		}
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}else
		{
			System.out.println("Invalid age!");
		}
		*/
	}

}
