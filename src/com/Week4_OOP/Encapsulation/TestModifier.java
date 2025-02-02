package com.Week4_OOP.Encapsulation;

import com.Week4_OOP.Inheritance.AccessModifierTest;

public class TestModifier extends AccessModifierTest {

	public static void main(String[] args)
	{
		AccessModifierTest test=new AccessModifierTest();
		System.out.println(test.name);
		
		
		//protected data: current class has to become child of AccessModifierTest
		TestModifier t1=new TestModifier();
		System.out.println(t1.name);
		System.out.println(t1.acno);
		

	}

}
