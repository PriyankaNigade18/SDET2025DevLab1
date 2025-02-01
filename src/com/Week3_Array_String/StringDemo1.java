package com.Week3_Array_String;

public class StringDemo1 {
	/*
	 * String is an immutable class
	 * Literal: Object will be part of SCP
	 * using new keyword: Object will be part of Heap of JVM
	 */
	public static void main(String[] args)
	{

		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//Object Id's compared: true
		
		String s3=new String("Hello");
		System.out.println(s1==s3);//false
		
		
		//String is immutable class
		
		s1=s1+"All";
		
		System.out.println(s1==s2);//false
		
		
		
		
		

	}

}
