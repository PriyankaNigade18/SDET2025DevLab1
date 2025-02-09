package com.Week5.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {

	/*
	 * ArrayList is Class implement List interface
	 * underline data structure is Dynamic Array
	 * It is order collection
	 * Duplication allowed
	 * It is nonSynchronize
	 * Initial capacity is 10 virtual segment
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is list empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(null);
		al.add(40);
		al.add(20);
		
		System.out.println(al);
		System.out.println("After adding elements is list empty?: "+al.isEmpty());//false
		System.out.println("Total number of element: "+al.size());
		//add one more element at index =4
		al.add(4,50);
		
		System.out.println(al);
		
		//remove
		al.remove(3);
		System.out.println(al);
		
		//contains(): search specific element
		System.out.println("Look for 40?: "+al.contains(40));
		System.out.println("Look for null?: "+al.contains(null));

		
		
		//clear - clear the complete list
		//al.clear();
		
//		System.out.println(al);//[]
//		System.out.println(al.size());//0
		
		
		//indexOf()
		System.out.println("index of 40 is: "+al.indexOf(40));
		
		System.out.println(al.subList(0,3));//0,1,2
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
