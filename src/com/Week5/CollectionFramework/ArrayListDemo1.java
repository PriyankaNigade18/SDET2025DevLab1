package com.Week5.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {
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
		
		//Generic --->type safe and no type casting required
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);
		al.add(20);
		
		System.out.println(al);
		
		int num=al.get(0);
		System.out.println(num);
		
		
		
		
		/*
		//non generic way 1.not type safe 2.type casting required
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Pooja");
		al.add(67.78);
		al.add('h');
		
		System.out.println(al);
		
		int num=(int) al.get(0);
		System.out.println(num);
		
		*/
		
		
		
		
		
		
		
		
		
		
		

	}

}
