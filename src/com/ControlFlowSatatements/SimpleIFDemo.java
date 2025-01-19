package com.ControlFlowSatatements;

import java.util.Scanner;

public class SimpleIFDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
	//one single true condition
			if(age>=18)
			{
				System.out.println("Valid person for voating!");
			}

	}

}
