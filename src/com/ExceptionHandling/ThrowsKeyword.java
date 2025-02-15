package com.ExceptionHandling;

public class ThrowsKeyword 
{

	public void m1() //throws InterruptedException
	{
		System.out.println("M1 is calling.....");
		m2();
	}
	
	public void m2() //throws InterruptedException
	{
		System.out.println("M2 is calling.....");
		m3();

	}
	
	public void m3() //throws InterruptedException
	{
		System.out.println("M3 is calling.....");
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			//System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("done!");

	}
	
	public static void main(String[] args) //throws InterruptedException 
	{
		ThrowsKeyword t1=new ThrowsKeyword();
		t1.m1();

	}

}
