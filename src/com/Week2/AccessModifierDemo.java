package com.Week2;

public class AccessModifierDemo 
{
	
	int id=101;//default
	public String name="Sarang";
	private long phno=98877665L;
	
	

	public static void main(String[] args)
	{
		// Within a same class

		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
	}

}
