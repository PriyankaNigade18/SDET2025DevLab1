package com.Week5_OOPDataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{

		//child class ref and child class object
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposite();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		System.out.println(h1.x);
		//h1.x=200;
		System.out.println("******************");
		//Parent ref and child object
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
	}

}
