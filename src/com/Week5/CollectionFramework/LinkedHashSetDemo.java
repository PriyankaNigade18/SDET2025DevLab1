package com.Week5.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet extents HashSet implements Set
	 * underline data structure doublyLinkedlist+HashTabel
	 * It is order collection not based on indexing
	 * store unique elements
	 * 
	 * 
	 */
	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(90);
		ls.add(20);
		ls.add(30);
		ls.add(88);
		ls.add(20);
		ls.add(90);
		ls.add(100);
		
		System.out.println(ls);
		System.out.println("Total Elements: "+ls.size());
		System.out.println(ls.contains(78));
		ls.remove(100);
		System.out.println(ls);
		
		System.out.println("*******************");
		/*
		 * remove duplicate characters and print final string
		 */
		String s1="aabbccddeeffgghij";
		System.out.println(s1);
		LinkedHashSet<Character> lc=new LinkedHashSet<Character>();
		String res="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			lc.add(ch);
		}
		
		System.out.println(lc);
		
		for(Character i:lc)
		{
			res=res+i;
		}
		System.out.println(res);
		
		
		
		
		
		
		
		

	}

}
