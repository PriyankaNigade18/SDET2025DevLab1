package com.ControlFlowSatatements;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args)
	{

	      Scanner scanner = new Scanner(System.in);
	      
	        System.out.println("Enter your environement : ");
	        String env = scanner.nextLine();
	 
	        switch (env.toUpperCase()) {
	            case "DEV","BUILD","QA","STAGE","PROD":
	                System.out.println("Test case is executing on " +env);
	                break;
	            default:
	                System.out.println("Please, enter another environement");
	        }
	 
	        scanner.close();
	    }

	}


