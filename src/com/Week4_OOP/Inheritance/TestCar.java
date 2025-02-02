package com.Week4_OOP.Inheritance;

public class TestCar {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: child ref and child object");
		//single level BMW--->Car
		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.breakFeature();
		b1.price();
		
		System.out.println("Hierarchical relation Audi--->Car");
		
		Audi a1=new Audi();
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.autoGear();//individual
		a1.breakFeature();
		a1.price();
		System.out.println("Scenario2:Parent ref and Parent object");
		//single level BMW--->Car
		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.breakFeature();
		c1.price();
		
		System.out.println("Scenario3: Parent ref and child object");
		//single level BMW--->Car
		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.breakFeature();
		c2.price();
		
		
		Car c3=new Audi();
		
		
		//Audi a2=new Car();
		
	}

}
