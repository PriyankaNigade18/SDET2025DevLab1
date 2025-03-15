package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class CustomData 
{

	//testData
		@DataProvider(name="appdata")
		public Object[][] testData()
		{
			 Object[][] data= {{"Admin","admin123"},{"John","test123"},{"Tom","test123"},{"Admin","admin123"}};
			 return data;
		}
		
}
