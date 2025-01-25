package com.ControlFlowSatatements;

public class NestedLoopDemo {

	public static void main(String[] args) 
	{

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*************************");
		int k=1;
		for (int m = 1; m <= 4; m++)//row
		{	
			 
			for (int n = 1; n <= m; n++)//cell
			{
							
				System.out.print(k+" ");
				k++;

			}
			System.out.println();
		}
		
		System.out.println("*************************");

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		System.out.println();
		System.out.println("****************************");
		int sum=0;
		for(int i=1;i<=4;i++)
		{ 
			for(int j=1;j<=i;j++)
			{ /*sum=sum+j; 
			System.out.print(sum +" ");*/
				
				sum=sum+1; 
				System.out.print(sum +" ");
				
			} System.out.println();}
		
		
		
		
		
		
 
	}
 

 

	}

