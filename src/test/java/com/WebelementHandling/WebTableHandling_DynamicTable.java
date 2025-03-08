package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling_DynamicTable {
  @Test
  public void testDynamicTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("*****Number of rows including heading******");
	  int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
	  System.out.println("Total rows are: "+rows);//5
	  
	  System.out.println("*****Number of columns******");
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@id='taskTable']//th"));
	  System.out.println("Total number of Columns: "+headings.size());//5
	  
	  System.out.println("*******Print Headings**********");
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("******Specific column Data*********");
	  //get the specific column
	  int count=0;
	  for(WebElement i:headings)
	  {
		  count++;
		  if(i.getText().contains("Memory (MB)"))
		  {
			  System.out.println("position of Memory column is: "+count);
			  List<WebElement> cdata=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+count+"]"));
			  for(WebElement j:cdata)
			  {
				  System.out.println(j.getText());
			  }
		  }
	  }
	  
	  
	  System.out.println("******Specific Row Data*********");

	  //get the specific row
	  
	  int hcount=0;
	  for(WebElement i:headings)
	  {
		  hcount++;
		  
		  if(i.getText().contains("Name"))
		  {
			  System.out.println("Position of Name column is: "+hcount);
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+hcount+"]"));
			  int rcount=0;
			  for(WebElement k:cellData)
			  {
				  rcount++;
				  if(k.getText().contains("Chrome"))
				  {
					  System.out.println("Position of Chrome row is: "+rcount);
					  List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr["+rcount+"]//td"));
					  for(WebElement r:rowData)
					  {
						  System.out.println(r.getText());
					  }
				  }
			  }
			  
			  
			  
			  
			  
			  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
