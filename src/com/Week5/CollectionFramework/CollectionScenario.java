package com.Week5.CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class CollectionScenario {

	public static void main(String[] args)
	{
		/*
		 * declare list and remove duplicate elements from the list
		 * - order collection
		 * - unique (duplication allowed)

				List into Set
		 */
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(40);
		
		System.out.println(al);//[20, 30, 15, 10, 20, 10, 40]
		/*
		 * 1.using addAll()
		 * 2.Using constructor
		 */
		//LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(al);
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.addAll(al);
		System.out.println(ls);//[20,30,15,10,40]
		
		
		//how to sort any set- ls object
		
		TreeSet<Integer> ts=new TreeSet<Integer>(ls);
		System.out.println(ts);//[10, 15, 20, 30, 40]
		
		
		
		
		
		
		
	

	}

}
