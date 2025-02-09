package com.Week5.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	/*
	 * HashMap is class implement Map interface
	 * It maintains <Key,value>
	 * underline data structure is HashTable
	 * initial capacity 16 virtual segment
	 * Key duplication not allowed
	 * Value duplication allowed
	 * It is not based on order
	 * Entry is interface in Map
	 * 
	 * 
	 */
	public static void main(String[] args)
	{

		Map<String,Integer> hm=new HashMap<String,Integer>();
		if(hm.isEmpty())
		{
			hm.put("VimanNagar",411014);
			hm.put("Lohegaon",411047);
			hm.put("Kharadi",411047);
			hm.put("whagoli",411048);
			
		}
		
		System.out.println(hm);
		
		
		System.out.println("Total entries: "+hm.size());
		System.out.println(hm);
		
		System.out.println("Search for key Kharadi?: "+hm.containsKey("Kharadi"));
		System.out.println("Search for value 411049?: "+hm.containsValue(411049));
		
		System.out.println("******************forEach *****************");
		
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
			//System.out.println(i);
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
		System.out.println("************Map--->Set-->iterator()************");
		
		Set<Entry<String,Integer>> set=hm.entrySet();
		
		Iterator<Entry<String,Integer>> ir=set.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
			
		}
		
		
		System.out.println("********LinkedHashMap************");
		//same order-LinkedHashMap
		LinkedHashMap<String,Integer> lm=new LinkedHashMap<String,Integer>();
		lm.put("VimanNagar",411014);
		lm.put("Lohegaon",411047);
		lm.put("Kharadi",411047);
		lm.put("whagoli",411048);
			
		System.out.println(lm);
		
		System.out.println("********TreeMap************");

		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		//as per key it sorts the map
		tm.put("VimanNagar",411014);
		tm.put("Lohegaon",411047);
		tm.put("Kharadi",411047);
		tm.put("whagoli",411048);
		
		System.out.println(tm);
		
		
		
		
		
		
		
		
		
		
		

	}

}
