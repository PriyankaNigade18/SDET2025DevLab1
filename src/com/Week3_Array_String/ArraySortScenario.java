package com.Week3_Array_String;

import java.util.Arrays;

public class ArraySortScenario {

	public static void main(String[] args)
	{

		int arr[]= {32,45,10,78,22};
		Arrays.sort(arr);
		System.out.println("AfterSorting: ");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("*****using bubble sort****");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("For String sorting");
		
		String name[]= {"Kiran","Abhi","Avi","Neetu","John","Carel"};
		
		Arrays.sort(name);
		System.out.println("Using Arrays: ");
		for(String i:name)
		{
			System.out.println(i);
		}
		System.out.println("*****using bubble sort****");
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					String temp2=name[i];
					name[i]=name[j];
					name[j]=temp2;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for(String i:name)
		{
			System.out.println(i);
		}
		
		
		
		
		

	}

}
