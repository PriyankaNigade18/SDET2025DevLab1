package com.Week5.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3_IterationWays {

	/*
	 * ArrayList is Class implement List interface
	 * underline data structure is Dynamic Array
	 * It is order collection
	 * Duplication allowed
	 * It is nonSynchronize
	 * Initial capacity is 10 virtual segment
	 * Frequent operation is Data retrieval
	 * 
	 */
	public static void main(String[] args) 
	{

		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		System.out.println("*******Simple for loop*******");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("*******for-each loop*******");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}

		System.out.println("*******iterator()*******");
		
		/*
		 * iterator() returns Iterator interface object
		 * 1.hasNext(): Returns true if the iteration has more elements.
		 * 2.next(): Returns the next element in the iteration.
		 */
		
		
		Iterator<Integer> ir=al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("*******listIterator()*******");
		
		ListIterator<Integer> lr=al.listIterator();
//		while(lr.hasNext())
//		{
//			//System.out.println(lr.next());
//				
//		
//			System.out.println(lr.next());
//					
//			//System.out.println(lr.next());
//		}
//		lr.set(100);//last element value replace
		//indexing wise working
		
		int n=3;
		for(int i=0;i<n;i++)
		{
			lr.next();
			
		}
		lr.set(200);
		System.out.println(al);
		
		
		System.out.println("*****Reverse order iterator****");
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		
		
		
		

		List<String> loc=new ArrayList<String>();
		loc.add("India");
		loc.add("Us");
		
		System.out.println("******For each************");
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		List<Double> marks=new ArrayList<Double>();
		marks.add(89.77);
		marks.add(56.66);
		System.out.println("******For each************");
		for(Double i:marks)
		{
			System.out.println(i);
		}
		
		List<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add("Pune");
		empdata.add('M');
		empdata.add(30);
		empdata.add(877665544L);
		
		System.out.println("******For each************");
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		

	}

}
