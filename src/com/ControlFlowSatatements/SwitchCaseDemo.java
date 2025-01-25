package com.ControlFlowSatatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		/*
		 * toLowerCase()
		 * toUpperCase()
		 */
		
		//key==value
		switch(bname.toLowerCase())
		{
		case "chromeextention":
		case "chrome":
		//case "chrome","chromeextention":
			System.out.println("Test case is executing on Chrome !");
			break;
			
		case "safari":
			System.out.println("Test case is executing on safari!");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge!");
			break;
		case "firefox":
			System.out.println("Test case is executing on Firefox!");
			break;
			
			default:
				System.out.println("Wrong Choice!");
				
			
		}
		
		sc.close();
		
		
		/*
		System.out.println("Enter number between 0 to 5");
		int num=sc.nextInt();
		
		switch (num)
		{
		case 0:
			System.out.println("Zero");
			break;//exit from switch or loop
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("Wrong Choice!");
			break;
		}
		
		*/
		
		
		
		
		

	}

}
