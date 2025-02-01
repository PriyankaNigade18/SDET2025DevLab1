package com.Week3_Array_String;

public class Array2DDemo {

	public static void main(String[] args)
	{
		// Using new keyword
		
		int id[][]=new int[2][3];
		
		id[0][0]=10;
		id[0][1]=20;
		id[0][2]=30;
		
		id[1][0]=40;
		id[1][1]=50;
		id[1][2]=60;
		
		System.out.println("Number of rows: "+id.length);//2
		System.out.println("Number of columns: "+id[0].length);//3
		
		//single element
		System.out.println(id[1][1]);//50
		
		//System.out.println(id[0][3]);//ArrayIndexOutOfBoundsException
		
		System.out.println("*********Iteration using for loop***********");
		
		for(int r=0;r<id.length;r++)//row
		{
			for(int c=0;c<id[r].length;c++)//col
			{
				System.out.print(id[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********Iteration using foreach loop***********");

			
		for(int i[]:id)//i[10,20,30]
		{
			for(int j:i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************************");
		//literal
		int num[][]= {{10,20},{30,40},{50,60},{70,80}};
		
		System.out.println("Number of rows: "+num.length);//4
		System.out.println("Number of columns: "+num[0].length);//2
		
		System.out.println(num[2][1]);//60
		
		System.out.println("*******Iteration**********");
		
		for(int i[]:num)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("***************************************");
		
		Object data[][]= {{"UserName","Password"},{"Amit","test123"},{"Kiran","test"},{"Sudha","test123"}};
		
		
		for(int i=1;i<data.length;i++) //row
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
//		for(Object i[]:data)
//		{
//			for(Object j:i)
//			{
//				if(j.equals("UserName")||j.equals("Password"))
//				{
//					continue;
//				}
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
		
		
		

	}

}
