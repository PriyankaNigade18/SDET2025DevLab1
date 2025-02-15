package com.Week1;

import com.ExceptionHandling.ThrowsKeyword;

public class FirstCode 
{

	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.out.println("Hello All!");
		
		//static method from MethodDemo
		MethodDemo.display();
		
		//instance 
		MethodDemo obj=new MethodDemo();
		obj.accept();
		
		ThrowsKeyword t1=new ThrowsKeyword();
		
		t1.m1();
		
	}
	
	
	
	
}
