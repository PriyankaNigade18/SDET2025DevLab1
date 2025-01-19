package com.Week2;

public class ThisKeywordDemo2 
{
	//this keyword help to call instance method
	
	public void startBrowser()
	{
		System.out.println("Browser started!");
		//runApp();
		this.runApp();
		//this.test();
	}

	public static void test()
	{
		System.out.println("This is static method");
	}
	
	public void runApp()
	{
		System.out.println("Application running!");
		this.stopBrowser();
	}
	
	public void stopBrowser()
	{
		System.out.println("Browser stopped!");
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.startBrowser();
		

	}

}
