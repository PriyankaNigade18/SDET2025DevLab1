package com.ControlFlowSatatements;

import java.util.Scanner;

public class LadderIF {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name");
		String bname=sc.nextLine();
		//System.out.println(bname);
		
		if(bname.equalsIgnoreCase("chrome"))
			{
			System.out.println("Test case is executing on Chrome!");
			}else if(bname.equalsIgnoreCase("edge"))
			{
				System.out.println("Test case is executing on Edge!");

			}else if(bname.equalsIgnoreCase("firefox"))
			{
				System.out.println("Test case is executing on Firefox!");

			}else
			{
				System.out.println("Wrong browser!");
			}
		
		
		
		
		
		/* String Equality
		 * =================
		 * 1.equals(): exact match this is case sensitive
		 * 2.equalsIgnoreCase(): this is not a case sensitive
		 * 
		 * == compares object id
		 * methods compare data
		 * 
		 */
		
//		int x=100;
//		int y=100;
//		System.out.println(x==y);//true 100==100
		
//		String s1="Hello";
//		String s2="hello";
//		System.out.println(s1==s2);//true object Id==object Id false
		
//		System.out.println(s1.equals(s2));//true/false
//		System.out.println(s1.equalsIgnoreCase(s2));//true//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
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
		
		
		*/
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
