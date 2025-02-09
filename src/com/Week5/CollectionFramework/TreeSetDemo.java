package com.Week5.CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class implement Set interface
	 * Underline data structure is Search Tree
	 * It always returns sorted set
	 */
	public static void main(String[] args) 
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		ts.add(1);
		ts.add(12);
		ts.add(8);
		ts.add(6);
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		System.out.println("Total Elements: "+ts.size());
		
		System.out.println("headSet(): less than element: "+ts.headSet(10));
		System.out.println("tailSet(): greater and equal element: "+ts.tailSet(10));
		System.out.println("subsSet(): "+ts.subSet(5,10));
		
		System.out.println(ts.first());///lowest
		System.out.println(ts.last());//max
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
