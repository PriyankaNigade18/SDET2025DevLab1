package com.Week2;

public class WrapperClassDemo1 
{
	/*
	 * Wrapper classes use for conversion 
	 * of primitive to Object and Object to primitive
	 * 
	 * to store primitive data as Object
	 */

	public static void main(String[] args)
	{
		// primitive to Object
		//int---->Integer
		int x=100;
		Integer obj=Integer.valueOf(x);
		System.out.println(obj);
		
		
		double d1=45.78;
		Double dobj=Double.valueOf(d1);
		System.out.println(dobj);
		
		
		char c1='R';
		Character chObj=Character.valueOf(c1);
		System.out.println(chObj);
		
		//Object ----->Primitive
		//Integer---->int
		Integer i1=90;
		int num1=i1.intValue();
		System.out.println(num1);//90
		float f1=i1.floatValue();
		System.out.println(f1);
		
		Long l1=76655443322L;
		long data=l1.longValue();
		System.out.println(data);
		
		//String Object to primitive
		//String s1="100ABC";
		String s1="100";
		System.out.println(s1+100);//100ABC100
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		String s2="56.78";
		System.out.println(s2+11.11);//56.7811.11
		double dnum=Double.parseDouble(s2);
		System.out.println(dnum+11.11);//67.89
		
		//String to char-->charAt(index)
		String s3="A";
		char ch=s3.charAt(0);
		System.out.println(ch);
		
		
		
		
		
		
		
		/*Scenario: 
		 * confirm the amount where
		 * amount should be equal to 5000
		 * amount should be less that 10000
		 * 
		 */
		
		String billmsg="Your Total bill is 5000";
		String d=billmsg.split(" ")[4];
		System.out.println(d);
		int amount=Integer.parseInt(d);
		if(amount==5000 && amount<10000)
		{
			System.out.println("Amount matched!");
		}
			
		
		
		
		
		
		
		
		//System.out.println("bill is available?: "+billmsg.contains("bill"));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
