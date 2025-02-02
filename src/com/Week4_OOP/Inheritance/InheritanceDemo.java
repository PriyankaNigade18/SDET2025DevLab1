package com.Week4_OOP.Inheritance;



class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}


class B extends A//Single level inheritance: A is Parent and B is child
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}

class C extends B//Multilevel inheritance B is parent and c is child
{
	
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
	
	
}
class D extends A//Hierarchical Inheritance A is parent and D is child
{
	public void m4()
	{
		System.out.println("M4 is calling!");
	}
}

public class InheritanceDemo {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: child class ref and child class object:Parent+Child");

		//single level B--->A
//		B b1=new B();
//		b1.m1();//inherited method
//		b1.m2();//individual method
		
		//multilevel C--->B--->A
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
//		c1.m3();//individual
		
		//Hierarchical Inheritance B and D is child for A
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		System.out.println("Scenario2: Parent class ref and Parent class object:Parent");
		
		//single level B--->A
//		A a1=new A();
//		a1.m1();//individual
		
		//multilevel C--->B--->A
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//Hierarchical Inheritance B and D is child for A
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("Scenario3: Parent class ref and Child class object:Parent");

		//single level B--->A
//		A a2=new B();
//		a2.m1();
		//multilevel C--->B--->A
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
		
		//Hierarchical Inheritance B and D is child for A
		A a2=new D();
		a2.m1();//individual
		System.out.println("Scenario4: Child class ref and Parent class object:Invalid");
		//single level B--->A
		//B b2=new A();
		
		
		
		
		
		
		
		
		
		
		
	}

}
