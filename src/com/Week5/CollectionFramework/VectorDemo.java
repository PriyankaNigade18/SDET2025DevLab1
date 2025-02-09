package com.Week5.CollectionFramework;

import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector is class implements List interface
	 * Underline data structure is Dynamic Array
	 * It is synchronize(thread safe)-one process at a time
	 * Performance is slow
	 * 
	 */
	public static void main(String[] args)
	{

		Vector<String> pl=new Vector<String>();
		
		System.out.println("Vector is empty?: "+pl.isEmpty());
		pl.add("C");
		pl.add("C++");
		pl.add("Java");
		pl.add("JavaScript");
		pl.add("Python");
		pl.add("Python");
		System.out.println("Vector is empty?: "+pl.isEmpty());
		
		System.out.println(pl);
		System.out.println("Total elements: "+pl.size());
		System.out.println("Look for Java?: "+pl.contains("Java"));
		
		pl.add(0,"C#");
		
		System.out.println(pl);
	}

}
