package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Generic.ExcelUtil;

public class TestExcelFile {
  
	
@DataProvider(name="file")
  public Object[][] getData() 
  {
	
	  Object arr[][]=ExcelUtil.getSheetData("Books");
	  return arr;
	  
	 
  }

@Test(priority=1)
public void readSingleData()
{
	String author=ExcelUtil.getData("Books",2,1);
	System.out.println(author);
}

@Test(priority=2,dataProvider="file")
public void readData(String BookName,String Author,String price,String discount)
{
	System.out.println(BookName+": "+Author+":"+price+":"+discount);
}



}
