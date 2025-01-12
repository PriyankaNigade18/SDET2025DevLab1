package com.Week1;

public class DataTypesDemo 
{

	public static void main(String[] args)
	{
		//boolean true/false size: 1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		
		status=false;
		System.out.println("Updated status is: "+status);//false
				
		boolean newStatus=true;
		System.out.println("new status is: "+newStatus);
		
		System.out.println("*************************************");
		
		/*
		 * character 2byte 
		 * 1.single character
		 * 2.special character
		 * 3.ASCII value of character
		 * 
		 * A - Z= 65 to 90
		 * a - z= 97 to 122
		 * 0 to 9= 47 to 57
		 * 
		 */
		
		char c1='A';
		char c2='$';
		char ch=97;//ascii value for character a
		
		System.out.println("Character data: "+c1);//A
		System.out.println("Character data: "+c2);//$
		System.out.println("Character data: "+ch);//a
		
		System.out.println("***********************************");
		//Numeric--->Integral-->1.Integer  2.Floating point
		
		//integer byte short int(default) long
		
		//byte 1byte -128 to 127
		
		byte b1=120;
		byte b2=127;
		byte b3=-128;
		//Type mismatch: cannot convert from int to byte
		//byte b4=150;
		
		System.out.println("byte data is: "+b1);
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		
		//short 2byte -32768 to 32767
		
		short s1=150;
		short s2=32767;
		//Type mismatch: cannot convert from int to short
		//short s3=50000;
		
		System.out.println("short data is: "+s1);
		System.out.println("short data is: "+s2);

		
		//int 4byte 
		int i1=50000;
		int i2=765433222;
		//The literal 99999999999 of type int is out of range 
		//int i3=99999999999;
		
		System.out.println("integer data is: "+i1);
		System.out.println("integer data is: "+i2);
		
		//long 8byte
		long l1=99999999999L;
		long l2=890L;
		
		System.out.println("long data is: "+l1);
		System.out.println("long data is: "+l2);
		
		System.out.println("*************************");
		
		//floating point 
		//float 4byte      double 8byte(default)
		
		double d1=89.677554;
		System.out.println("double type of data: "+d1);
		
		float f1=78.6654F;
		System.out.println("float type of data: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
