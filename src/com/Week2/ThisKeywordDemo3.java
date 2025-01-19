package com.Week2;

public class ThisKeywordDemo3 
{
	//this(): is used to call constructor
	
	ThisKeywordDemo3()
	{
		//this(11);
		System.out.println("Default constructor is calling....");
		//this(11);//Constructor call must be the first statement in a constructor
	}
	
	public void m()
	{
		System.out.println("Method call");
		ThisKeywordDemo3 t2=new ThisKeywordDemo3();
	}
	
	static {
		System.out.println("static is calling!");
	}
	
	ThisKeywordDemo3(int id)//id=11
	{
		this();
		System.out.println("Parameterize constructor is calling....id:"+id);
	}
	
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo3 t1=new ThisKeywordDemo3(200);
		
		t1.m();
	}

}
