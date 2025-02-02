package com.Week4_OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{

		AmazonSearch a1=new AmazonSearch();
		a1.search("iphone");
		a1.search(90000);
		a1.search(50000,"Watch");
		a1.search("laptop",90000);
		a1.search("zara","Bag");
		a1.search("iphone","mobile",778880);
		

	}

}
