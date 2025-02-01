package com.Week4_OOP.Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method Overloading:
	 * =====================
	 * If we declare same name method in same class but with multiple 
	 * signature then it becomes method Overloading
	 * 
	 * 1.Pass Number of Arguments to the method
	 * 2.Pass different type of arguments
	 * 3.Change order of argument
	 * 
	 * Constructor overloading is possible but overriding not possible
	 * Main() overloading is possible?: yes but practically we don't use
	 */
	public void add()//0 parameter
	{
		int a=100,b=299;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.Pass Number of Arguments to the method
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	//2.Pass different type of arguments
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	//3.Change order of argument
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	
	public void add(int a,double b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));

	}
	
	CompileTimePoly()
	{
		System.out.println("Default constructor calling!");
	}

	
	CompileTimePoly(int id)
	{
		System.out.println("Parametrize constructor calling: id!"+id);
	}
	
	CompileTimePoly(String name)
	{
		System.out.println("Parametrize constructor calling: name!"+name);
	}

	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100,78.80);
		c1.add(56.77, 60);
		c1.add(90,890);
		c1.add(78,90.66,880);

		CompileTimePoly c2=new CompileTimePoly(78);
	}

}
