package com.Week5_OOPDataAbstraction;

//multiple inheritance in java-Interface
public class NobleHs implements IMA,USMA
{
	
	public void medicalService()
	{
		System.out.println("NobleHs......Medical()");

	}

	@Override
	public void cardio() {
		System.out.println("NobleHs......Cardio()");
		
	}

	@Override
	public void physio() {
		System.out.println("NobleHs......Physio()");

		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.....Nero()");

		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs.....dental()");

	}

	@Override
	public void covid19Test() {
		
		System.out.println("NobleHs.....covid19Test()");

	}

}
