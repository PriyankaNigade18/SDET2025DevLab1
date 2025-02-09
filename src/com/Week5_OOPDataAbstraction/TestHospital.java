package com.Week5_OOPDataAbstraction;

public class TestHospital {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: child class ref and child class object");
		NobleHs h1=new NobleHs();
		h1.medicalService();//individual
		h1.cardio();//inherited abstract method
		h1.physio();//inherited abstract method
		h1.dental();
		h1.nero();
		h1.covid19Test();
		
		System.out.println("Scenario2: Parent class ref and child class object");

		IMA i1=new NobleHs();
		i1.cardio();
		i1.physio();
		i1.covid19Test();
		System.out.println("Scenario2: Parent class ref and child class object");

		USMA u1=new NobleHs();
		u1.dental();
		u1.nero();
		u1.covid19Test();
		
		
		
	}

}
