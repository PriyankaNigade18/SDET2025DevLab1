package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling_Static {
  @Test
  public void testStaticTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //number of rows
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total rows are: "+rows);//7
	  
	  //number of columns
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  System.out.println("total Columns are: "+headings.size());//4
	  
	  //get headings
	  System.out.println("**********Headings***********");
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //specific row
	  System.out.println("************Specific Row************");
	  
	  List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td"));
	 
	  	for(WebElement i:row)
	  	{
	  		System.out.print(i.getText()+" ");
	  	}
	  
	  
	  //specific columns
		  System.out.println("************Specific Column************");
List<WebElement> allPrice=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));
	  
	int total=0;
	for(WebElement i:allPrice)
	{
		System.out.println(i.getText());
		String data=i.getText();
		int price=Integer.parseInt(data);
		total=total+price;
	
	}

	System.out.println("Total Books Price is: "+total);



	  //get the all data
	  System.out.println("******Get the all Data************");
	  List<WebElement> list=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
  }
}
