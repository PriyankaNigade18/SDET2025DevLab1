package com.Week2;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) 
	{

		System.out.println("Enter your name");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println(id);
		

	}

}
