package com.Week2;

public class InvoiceTask {

	public static void main(String[] args)
	{

		
				int item1Price = 200;
				int item1Quantity = 3;
				
				int item2Price = 80;
				int item2Quantity = 5;
				
				int item3Price = 150;
				int item3Quantity = 2;
				
				int item1TotalPrice = item1Price*item1Quantity;
				int item2TotalPrice = item2Price*item2Quantity;
				int item3TotalPrice = item3Price*item3Quantity;
				
				float item1Discount = item1TotalPrice * 15 /100;
				float item2Discount = item2TotalPrice * 15 /100;
				float item3Discount = item3TotalPrice * 15 /100;
				
				float item1SeriveCharge = item1TotalPrice * 2 /100;
				float item2SeriveCharge = item2TotalPrice * 2 /100;
				float item3SeriveCharge = item3TotalPrice * 2 /100;
				
				float item1Bill = (item1TotalPrice-item1Discount)+item1SeriveCharge;
				
				float item2Bill = (item2TotalPrice-item2Discount)+item2SeriveCharge;
				
				float item3Bill = (item3TotalPrice-item3Discount)+item3SeriveCharge;
				
				System.out.println("Alex Total Bill is :"+(item1Bill+item2Bill+item3Bill));
			}
		 
		
		 

	}


