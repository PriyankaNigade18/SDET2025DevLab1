package com.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData 
{
	public XSSFWorkbook wb;

	//testData
		@DataProvider(name="appdata")
		public Object[][] testData()
		{
			 Object[][] data= {{"Admin","admin123"},{"John","test123"},{"Tom","test123"},{"Admin","admin123"}};
			 return data;
		}
		
		@DataProvider(name="excelfile")
		public Object[][] fileData()
		{
			 //file path
			  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
			  
			//wb--->sheet-->row--->cell--->data
			  //to read
			  FileInputStream fs;
			  Object data[][]=null;
			try {
				fs = new FileInputStream(f1);
			  
			  wb=new XSSFWorkbook(fs);
			  
			  //Number of rows
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Total number of rows are: "+rows);//5
			  
			  //number of columns
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Total number of columns are: "+cells);//2
			  
			  //create array of same size
			  data=new Object[rows-1][cells];//rows =4 cells=2
			  
			  //read data from the file and pass it to array
			  for(int r=1;r<rows;r++)//rows-skip the heading r=1
			  {
				  
				  for(int c=0;c<cells;c++)//cells
				  {
					  //array index always starts with 0
					  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					  
				  }
				  
				  
			  }
			 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			
			 return data;
		}
		
}
