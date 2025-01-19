package com.Week2;

public class BuilderPattern 
{
	//4.this is used to return current instance from method-Builder pattern
	//method returns current class object
	
	public BuilderPattern startApp()
	{
		System.out.println("Application Open!");
		return this;//object
	}
	
	public BuilderPattern runApp()
	{
		System.out.println("Application Runnig!");
		return this;
	}
	
	public void stopApp()
	{
		System.out.println("Application Stoped!");
	}

	public static void main(String[] args)
	{
		BuilderPattern b1=new BuilderPattern();
		//method chaining/builder pattern
		b1.startApp().runApp().stopApp();
				

	}

}
