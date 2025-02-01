package com.ControlFlowSatatements;

public class BranchingStatements
{

	public String info()
	{
		String i="Selenium WebDriver is WebUI automation library";
		return i;
	}
	public static void main(String[] args)
	{
		// break: exit from switch and loop
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}
		
		
		System.out.println("*************************");
		
		//continue:skip certain part of a code 
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		BranchingStatements b1=new BranchingStatements();
		System.out.println(b1.info());
		
		//break cannot be used outside of a loop or a switch
		if(true)
		{
			//break;
		}
		
		
		
		
		
		
		

	}

}
