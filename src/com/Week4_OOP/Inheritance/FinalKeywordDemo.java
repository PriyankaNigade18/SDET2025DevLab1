package com.Week4_OOP.Inheritance;

//final class Demo
class Demo
{
	
	final double pi=3.14;
	
	public final void areaOfCircle(int r)
	{
		System.out.println("Area of circle:"+(pi*r*r));
	}
	
}

//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
	//@Override//Cannot override the final method from Demo
//	public void areaOfCircle(int r)
//	{
//		int rd=r*r;
//		System.out.println("Updated Area of circle:"+(pi*rd*rd));
//	}

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		//d1.pi=3.22;//The final field Demo.pi cannot be assigned
		System.out.println(d1.pi);
		d1.areaOfCircle(10);
		FinalKeywordDemo f1=new FinalKeywordDemo();
		f1.areaOfCircle(4);
		
		
		
	}

}
