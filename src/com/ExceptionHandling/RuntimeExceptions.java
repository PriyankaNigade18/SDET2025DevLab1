package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RuntimeExceptions
{
	int id=101;
	

	public static void main(String[] args)
	{
		RuntimeExceptions r1=new RuntimeExceptions();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("check Object/data is null");
		}
		
		
		
		String s1="1234";
		System.out.println(s1+200);//1234200
		//string to integer
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+200);//1434
		}catch(NumberFormatException n)
		{
			System.out.println("Please enter correct numbers in string");
		}
		
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);
		 
		}catch(Exception e)
		{
			System.out.println("Please enter correct index value");
		}
		
		
		
	
			int a=10,b=0;
			System.out.println("Addition is: "+(a+b));
			System.out.println("Subtraction is: "+(a-b));
			try {
			System.out.println("Division is: "+(a/b));
			
			}catch(ArithmeticException r)
			{
				System.out.println("For division Please enter number other than 0");
			}
			System.out.println("multiplication is: "+(a*b));
			try {
			System.out.println("Modulus is: "+(a%b));
			}catch(Exception e)
			{
				System.out.println("For modulus Please enter number other than 0");

			}

	}

}
