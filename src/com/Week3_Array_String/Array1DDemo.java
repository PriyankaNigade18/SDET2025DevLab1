package com.Week3_Array_String;

public class Array1DDemo {
	/*
	 * Array is static data structure 
	 * Array is store data as per index value
	 * Array is of fix size and fix type
	 * Types:
	 * ===========
	 * 1.single dimensional (1D)
	 * 2.Multi dimensional (2D)
	 * 
	 * Ways
	 * ============
	 * 1.Using new Keyword
	 * 2.Using literal
	 * 
	 */
	public static void main(String[] args) 
		{
		
		//using new keyword
		//declaration
		int sid[]=new int[5];
		//initialize
		sid[0]=101;
		sid[1]=102;
		sid[3]=104;
		sid[4]=105;
		
		//length of array
		System.out.println("Length is:"+sid.length);//5
		
		//single element from array
		System.out.println(sid[2]);//0
		System.out.println(sid[3]);//104
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println("******Iteration using for loop***********");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("******Iteration using foreach loop***********");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************************");
		
		//using literal way
		
		double marks[]= {78.55,45.66,38.88,88.65};
		
		System.out.println("Length of array is: "+marks.length);//4
		
		System.out.println(marks[3]);//88.65
		
		System.out.println("*******Iteration using for loop********");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("******Iteration using foreach loop***********");

		for(double i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************************");

		String pl[]= {"C","C++","Java","Python","JS"};
		
		System.out.println("Length is: "+pl.length);
		
		
		for(int i=0;i<pl.length;i++)
		{
			System.out.println(pl[i]);
		}
		System.out.println("******Iteration using foreach loop***********");
		
		for(String i:pl)
		{
			if(i.equals("Java"))
			{
				System.out.println(i);
				break;
			}
			//System.out.println(i);
		}
		
		
		System.out.println("**************************************");
		
		//real time data= Object type
		Object empdata[]= {"Sarang","Pune",30,'M',98767665L,98767665L};
		System.out.println("Length is: "+empdata.length);
		System.out.println(empdata[2]);//30
		
		System.out.println("Iterate");
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("******Iteration using foreach loop***********");
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
