package com.Week5.CollectionFramework;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args)
	{

		Hashtable<Integer,String> hm=new Hashtable<>();
		hm.put(101, "Kiran");
		hm.put(102, "Geeta");
		hm.put(103,"Abhi");
		
		System.out.println(hm);
		System.out.println("Total Entries: "+hm.size());
		
		
		for(Entry<Integer,String> i:hm.entrySet())
		{
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
	}

}
