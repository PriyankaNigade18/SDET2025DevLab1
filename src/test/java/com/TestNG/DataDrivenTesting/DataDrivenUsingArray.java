package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenUsingArray 
{
//	//testData
//	@DataProvider(name="appdata")
//	public Object[][] testData()
//	{
//		 Object[][] data= {{"Admin","admin123"},{"John","test123"},{"Tom","test123"},{"Admin","admin123"}};
//		 return data;
//	}
//	
	
  @Test(dataProvider = "appdata",dataProviderClass = CustomData.class)
  public void testCase_Login(String un,String psw)
  {
	System.out.println("UserName is: "+un);
	System.out.println("Password is: "+psw);
  }
}
