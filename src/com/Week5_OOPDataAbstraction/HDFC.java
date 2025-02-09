package com.Week5_OOPDataAbstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	{
		System.out.println("HDFC....customer details");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC....Withdraw()");
		
	}

	@Override
	public void deposite() {
		System.out.println("HDFC....deposite()");

		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC....rateOfInterest 8%()");

		
	}

}
