package com.Week2;

import com.Week1.StudentData;

public class MethodCallingWithObject 
{
	public void call(StudentData sobj)
	{
		//s.id=101;
		sobj.name="Pooja";
		sobj.show();
	}
	
	public void increase(int a)//100
	{
		System.out.println(a);//100
		a=a*2;//200
		System.out.println(a);//200
	}

	public static void main(String[] args)
	{
		MethodCallingWithObject obj=new MethodCallingWithObject();
		
		StudentData sobj=new StudentData();
		sobj.id=201;
		obj.call(sobj);
		System.out.println(sobj.id);
		
		int a=100;
		System.out.println(a);//100
		obj.increase(a);
		System.out.println(a);//100
		
		

	}

}
