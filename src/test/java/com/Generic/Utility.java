package com.Generic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	
	
	
	public static Alert handleAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	
	public static void windowHandling(WebDriver driver,String url,String title,By loc)
	{
		 Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> ir=allWindows.iterator();
		  
		  int count=0;
		  while(ir.hasNext())
		  {
			  driver.switchTo().window(ir.next());
			  count++;
			  System.out.println(count);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			 if(driver.getTitle().equalsIgnoreCase(title))
			 {
				 String heading=driver.findElement(loc).getText();
				 System.out.println(heading);
			 }else if(driver.getCurrentUrl().equalsIgnoreCase(url))
			 {
				 String heading=driver.findElement(loc).getText();
				 System.out.println(heading);
			 }
			  
		  }
	}
	
	public static void selectBasedDropDown(WebElement ddele,String value)
	{
		Select dd=new Select(ddele);
		  
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  //get all option
		  WebElement ele=null;
		  List<WebElement> allOption=dd.getOptions();
		  System.out.println("Total Options are: "+allOption.size());
		  
		  for(WebElement i:allOption)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  ele=i;
			  }
		  }
		  
		  ele.click();
		  
	}

}
