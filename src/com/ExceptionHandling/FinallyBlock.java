package com.ExceptionHandling;

public class FinallyBlock
{
	public static void main(String args[])
	{
		/*
		 * finally block
		 * to execute special code we use finally block
		 * finally block executes with or without exception
		 */
		try {
		System.out.println(9/0);
		}catch(Exception e)
		{
			System.out.println("Please enter number other than 0 otherwise you will get  "+e.getMessage());
		}
		finally
		{
			System.out.println("Finally block is calling!");
		}
		
		String s1="67687Ab";
		
		int num=Integer.parseInt(s1);
		System.out.println(num);
		
		
		
		
	}

}
