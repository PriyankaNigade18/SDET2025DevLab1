package com.Week2;

public class ThisKeywordDemo1 
{
//instance
	int price;
	String productName;
	
	//this keyword: refer current class instance(data/method)
	
	//constructor
	public ThisKeywordDemo1(int price,String productName)//price=9999 name=watch
	{
		System.out.println("Constructor is calling....");
		//local=local
			this.price=price;
			this.productName=productName;
	}
	
	//method
	public void show()
	{
		System.out.println("show() is calling....");
//		System.out.println("product price is: "+price);//9999
//		this.price=898766;
		System.out.println("product price is: "+price);
		System.out.println("product name is: "+productName);
	
	}
	
	public static void main(String[] args) 
	{

	ThisKeywordDemo1 t1=new ThisKeywordDemo1(9999,"watch");
	t1.show();

	
	}

}
