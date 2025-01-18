package com.Week2;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		System.out.println("*********Arithmetic Operators*****");
		int a=20,b=10;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		//System.out.println(a+b+"Sum");
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println("*********Unary Operators*****");
		/*
		 * Increment ++              decrement --
		 * 
		 * a++ = post increment   a--= post decrement
		 *  a++ = a=a+1          a-- =a=a-1
		 *  
		 * ++a = pre increment     --a =pre decrement
		 * 
		 */

		int x=90;
		System.out.println(x);//90
		System.out.println(x++);//90
		System.out.println(x);//91
		
		int y=60;
		System.out.println(y);//60
		System.out.println(++y);//61
		
		
		int a1=167;
		int b1=a1++;//assignment then operation
		System.out.println(a1);//168
		System.out.println(b1);//167
		
		int s=59;
		int t=s++;
		System.out.println(s);//60
		System.out.println(t);//59
		
		int p=45;
		int q=++p;//operation then assignment
		
		System.out.println(p);//46
		System.out.println(q);//46
		
		
		int u=189;
		int v=++u;
		System.out.println(u);//190
		System.out.println(v);//190
		
		//decrement
		
		int c=89;
		System.out.println(c);//89
		System.out.println(c--);//89
		System.out.println(c);//88
		
		int d=66;
		System.out.println(d);//66
		System.out.println(--d);//65
		
		int k=190;
		int l=k--;//assignment then decrement
		System.out.println(k);//189
		System.out.println(l);//190
		
		
		int e=78;
		int f=--e;//decrement then assignment
		System.out.println(e);//77
		System.out.println(f);//77
		
		
		
		System.out.println("****RElational operators**********");
		/*
		 * e=f=77 l=190 k=189 d=65 u=v=190
		 * 
		 */
		
		System.out.println("less than <: "+(k<v));//true
		System.out.println("less than equal to <=: "+(v<=l));//true
		System.out.println("greater than >: "+(f>v));//false
		System.out.println("greater than equal to >=: "+(e>=d));//true
		System.out.println(k==u);//false
		System.out.println(u==v);//true
		System.out.println(v!=l);//false
		System.out.println(e!=d);//true
		
		System.out.println("*****Logical operators***********");
		/*
		 * a 		b			and(&&)			or(||)
		 * T		T			true			true
		 * T		F			false			true
		 * F		T			false			true
		 * F		F			false			false	
		 * 
		 */
		
		System.out.println((u==v) && (e!=d));//true
		System.out.println((u==v) && (v!=l));//false
		System.out.println((v!=u) && (e>d));//false
		System.out.println((e==v) && (f>v));//false
		
		System.out.println((u==v) || (e!=d));//true
		System.out.println((u==v) || (v!=l));//true
		System.out.println((v!=u) ||(e>d));//true
		System.out.println((e==v) || (f>v));//false
		
		//not !
		
		System.out.println(u==v);//true
		System.out.println(!(u==v));//false
		
		System.out.println("*****************************");
		//ternary operator -condition?true:false
		
		int num1=90,num2=900;
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		
		
		System.out.println("***********************");
		
		System.out.println(num1>num2?num1+" is greater than "+num2:num2+" is greater than "+num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
