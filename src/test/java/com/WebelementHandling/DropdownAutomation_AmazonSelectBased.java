package com.WebelementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class DropdownAutomation_AmazonSelectBased
{
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //get the address
	  WebElement ddele=driver.findElement(By.id("searchDropdownBox"));	
	  
	  Utility.selectBasedDropDown(ddele,"Kindle Store");
	  
	  
	 /*
	  //select class Object
	  Select dd=new Select(ddele);
	  
	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  
	  //single selection
	  dd.selectByIndex(3);
	  
	  Thread.sleep(1500);
	  
	  dd.selectByValue("search-alias=computers");
	  
	  Thread.sleep(1500);
	  
	  dd.selectByVisibleText("Gift Cards");
	  
	  //get the all options
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  WebElement ele=null;
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("MP3 Music"))
		  {
			  System.out.println("Match found...");
			  //i.click();
			  ele=i;
			  
		  }
		  
		  
	  }
	  
	  ele.click();
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
