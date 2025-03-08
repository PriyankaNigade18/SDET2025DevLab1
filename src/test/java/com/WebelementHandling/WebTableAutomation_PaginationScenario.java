package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableAutomation_PaginationScenario {
  @Test
  public void testTable() throws InterruptedException
  
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //total pages in table
	  List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total Pages in table are: "+pages.size());//4
	  
	  
	  //total rows and columns as per page
	  for(WebElement i:pages)
	  {
		  System.out.println("Page Number: "+i.getText());
		  //open page
		  i.click();
		  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		  System.out.println("Total Rows: "+rows);
		  int cells=driver.findElements(By.xpath("//table[@id='productTable']//tr[1]//th")).size();
		  System.out.println("Total Columns are: "+cells);
		  
	  }
	  
	  System.out.println("*****************************");
	  //click on page 3 and get the 4th row name from 2nd column-Fitness tracker
	  for(WebElement i:pages)
	  {
		  if(i.getText().contains("3"))
		  {
			  i.click();
			  System.out.println("Text is:"+driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[4]//td[2]")).getText());
		  }
	  }
	  
	  System.out.println("*****************************");

	  for(WebElement i:pages)
	  {
		  i.click();
		  
		  
		  List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
		  int count=0;
		  for(WebElement j:allNames)
		  {
			  count++;
			  if(j.getText().contains("Fitness Tracker"))
			  {
				  System.out.println("Page Number : "+i.getText());
				  System.out.println("Match found at row: "+count);
				  
				  //check the chebox
				  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+count+"]//td[4]//input[@type='checkbox']")).click();
				  Thread.sleep(4000);
				  
				  break;
			  }
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
