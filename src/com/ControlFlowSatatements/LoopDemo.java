package com.ControlFlowSatatements;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args)
	{
		// Hello statement 5 time-for
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("*******************");
		//1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************");
		//numbers 10 to 1
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************");
		//sum of 100 natural numbers =5050
		//1+2+3+4....+100=5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of 100 natural numbers: "+sum);
		
		System.out.println("*******************");

		
//		for(;;)//by default for loop condition is true
//		{
//			System.out.println("Hi");
//		}
		
		//while loop
		
		int i=1;
		while(i<=5)
		{
		System.out.println("Hello");
		i++;
		}
		
		System.out.println("***************************");
		/*
		 * Accept number from user and print sum of digits
		 * num=23||1234||123
		 * digits are not sure
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for Sum of Digits logic");
		int num=sc.nextInt();
		int temp=num;
		int rem,result=0;
		while(num>0)//digits
		{
			rem=num%10;
			num=num/10;
			result=result+rem;
			
		}
		
		System.out.println("Sum of digits for number:  "+temp+" is: "+result);
		
		System.out.println("*******************************");
		
		//do while loop- exit control
		
		int j=1;
		do
		{
			System.out.println("Hello");
			j++;
			
		}while(j>=5);
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
