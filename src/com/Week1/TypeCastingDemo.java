package com.Week1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// Primitive to Primitive
		
		//implicit automatic--->JVM-->small size--->large size
		//byte-->short-->int-->long-->float--->double
		
		int x=8877666;//4byte
		long l1=x;//8byte
		System.out.println("int to long conversion: "+l1);
		
		char ch='A';
		int y=ch;
		System.out.println("char to int conversion: "+y);//65
		
		int z=89;
		float f1=z;
		System.out.println("int to float conversion: "+f1);//89.0
		
		System.out.println("***************************");
		//explicit manual conversion large size--->small size
		
		//double-->float--->long-->int-->short-->byte
		
		long l2=988766557877L;//8byte
		
		int a=(int)l2;//4byte
		System.out.println("long to int conversion: "+a);
		
		int b=90;//4byte
		char c1=(char) b;//2byte
		System.out.println("int to char conversion: "+c1);//Z
		
		double d1=98.76545;//8 byte
		float f2=(float) d1;
		System.out.println("double to float conversion: "+f2);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
