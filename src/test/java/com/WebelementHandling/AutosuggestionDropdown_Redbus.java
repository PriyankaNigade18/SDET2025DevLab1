package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutosuggestionDropdown_Redbus {
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.redbus.in/");
	  
	  //from 
	  driver.findElement(By.id("src")).sendKeys("pune");
	  
	  WebElement ele=null;
	  List<WebElement> allOptions= driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li//text[@class='placeHolderMainText']"));
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Kharadi"))
		  {
			  ele=i;
		  }
	  }
	  
	  ele.click();
	  
	  
	  
  }
}
