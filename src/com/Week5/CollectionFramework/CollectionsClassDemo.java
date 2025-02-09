package com.Week5.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) 
	{
		/*
		 * Arrays class
		 * asList()
		 */
		
		List<Integer> l1=Arrays.asList(10,20,30);
		System.out.println(l1);
		List<Integer> l2=Arrays.asList(40,50,60,70);
		System.out.println(l2);
		
		List<Integer> list=new ArrayList<Integer>();
		//list.add(null);
		list.addAll(l1);
		list.addAll(l2);
		
		System.out.println(list);
		
		System.out.println("****************************");
		
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(90);
		l3.add(20);
		l3.add(78);
		l3.add(43);
		l3.add(10);
		l3.add(2);
		
		System.out.println(l3);
		
		
		//sort this list
		
		Collections.sort(l3);
		
		System.out.println(l3);
		
		System.out.println("Max Element: "+Collections.max(l3));
		System.out.println("Min Element: "+Collections.min(l3));
		
		List<Integer> src=Arrays.asList(1,2,3,4);
		System.out.println(src);
		
		List<Integer> dest=Arrays.asList(10,20,30,40,50,60);
		System.out.println(dest);
		//src to dest copied all the element
		Collections.copy(dest,src);
		
		//print the list
		for(Integer i:dest)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		

	}

}
