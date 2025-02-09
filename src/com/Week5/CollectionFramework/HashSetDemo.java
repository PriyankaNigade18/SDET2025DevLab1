package com.Week5.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/*
	 * HashSet is class implement Set interface
	 * underline data structure is HashTable
	 * HashTable maintains element as per hash()
	 * hashFunction calculate key and hashcode for element 
	 * and based n key it store value in table
	 * Initially 16 virtual segment 
	 * Internally it use linkedList
	 * |Key|hashcode|value|address of next element|
	 * 
	 * hashcode/index for null value is always 0 
	 * 
	 * it is not order collection
	 * duplication not allowed
	 * 
	 * HashSet is faster than TreeSet and LinkedHashSet
	 */
	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("Total Elements: "+hs.size());
		
		hs.remove(null);
		
		System.out.println(hs);
		
		System.out.println("*******for each loop***********");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		System.out.println("********iterator()*************");
		
		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		

	}

}
