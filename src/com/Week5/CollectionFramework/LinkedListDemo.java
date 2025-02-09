package com.Week5.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * LinkedList is class implements List interface
	 * Underline data structure is doublyLinkedList
	 * Frequent operation is data insertion and deletion
	 * It is ordered collection based on indexing
	 * Duplication also allowed
	 * 
	 *  
	 */
	public static void main(String[] args)
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(40);
			
		}
		System.out.println("Is list empty?: "+ls.isEmpty());
		System.out.println(ls);
		System.out.println("Total Elements are : "+ls.size());
		System.out.println("Search for 30?: "+ls.contains(30));
		ls.add(0,100);
		
		System.out.println(ls);
		
		ls.addFirst(80);
		ls.addLast(80);

		
		System.out.println(ls);
		System.out.println(ls.getFirst()+" : "+ls.getLast());
		
		ls.remove(1);
		
		System.out.println(ls);
		
		
		
		
		
		
		
		
		
		
		

	}

}
