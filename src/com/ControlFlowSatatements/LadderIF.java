package com.ControlFlowSatatements;

import java.util.Scanner;

public class LadderIF {

	public static void main(String[] args)
	{
		//vowel test
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		//string-->char
		char ch=sc.nextLine().charAt(0);
		
		
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='i')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='o')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='u')
		{
			System.out.println(ch+" is a vowel");

		}else
		{
			System.out.println(ch+" is not a vowel");
		}
		
		
		
//		String data=sc.nextLine();
//		char ch=data.charAt(0);
//		
//		System.out.println(ch);
//		
		
		
		
		/*
		 * Accept two numbers and test greater or number is equal
		 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else if(num1==num2)
		{
			System.out.println("Both numbers are equal");
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		
		*/
		
		
		
		
		
		
		
		
	}

}
