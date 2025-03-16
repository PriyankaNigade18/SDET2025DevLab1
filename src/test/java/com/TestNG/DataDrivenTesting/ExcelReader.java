package com.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelReader {
  @Test
  public void excelFileReading() throws IOException
  {
	  
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //to read
	  FileInputStream fs=new FileInputStream(f1);
	  
	  
	  //wb--->sheet-->row--->cell--->data
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //Number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Total number of rows are: "+rows);//5
	  
	  //number of columns
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Total number of columns are: "+cells);//2
	  
	  //create array of same size
	  Object data[][]=new Object[rows-1][cells];//rows =4 cells=2
	  
	  //read data from the file and pass it to array
	  for(int r=1;r<rows;r++)//rows-skip the heading r=1
	  {
		  
		  for(int c=0;c<cells;c++)//cells
		  {
			  //array index always starts with 0
			  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			  System.out.print(data[r-1][c]+"   ");
		  }
		  System.out.println();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //single value reading 
//	  String value=wb.getSheet("userdata").getRow(1).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
	  
	  /*
	  XSSFSheet sheet1=wb.getSheet("userdata");
	  
	  XSSFRow row1=sheet1.getRow(2);
	  
	  XSSFCell cell1=row1.getCell(0); 
	  
	  String un=cell1.getStringCellValue();
	  
	  System.out.println(un);
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
