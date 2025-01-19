package com.Week2;

//import java.io.File;
//
//import com.Week1.FirstCode;
public class Task2 
{
	//int count=0;instance variable get the new memory for every new object
	//static variable shares same memory with all object
	static int count=0;
	
		Task2()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{

		Task2 t1=new Task2();
		Task2 t2=new Task2();
		Task2 t3=new Task2();
		Task2 t4=new Task2();
		Task2 t5=new Task2();
		
//		FirstCode f1=new FirstCode();
//		
//		File ff;


	}

}
