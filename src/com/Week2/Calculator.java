package com.Week2;

public class Calculator 
{
	public void add()//0 parameter method
	{
		int a=10,b=20;//local
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//2 parameters local a=90,b=40
	{
		a++;//91
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void mul(int a,int b,int c)//3 parameters a=10 b=20 c=30
	{
		System.out.println("Multiplication is: "+(a*b*c));
	}
	/*
	 * method with return
	 *- we use return keyword to return any value/output from the method
	 *- return statement should be last statement of you method
	 *- when we use return then return type of method need to update as per value
	 * - return value it will return to the method call
	 */
	
	public int div(int a,int b)//a=100 b=10
	{
		int c=a/b;
		return c;
	}

	public String info()
	{
		String msg="Hello All!";
		return msg;
	}
	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		c1.add();
		/*
		 * Compile time parameter passing:
		 * If you pass parameters/arguments at the time of 
		 * calling that method is called compile time parameter passing
		 */
		c1.sub(90,40);
		
		c1.mul(10,20,30);
		
		System.out.println("Division is: " +c1.div(100,7));
//		int result=c1.div(100,10);
//		System.out.println("Division is: "+result);

		System.out.println(c1.info());
	}

}
