package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class DropdownAutomation_Facebook {
  @Test
  public void testDropdown()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/");
	  
	  
	  //create an account page
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day dropdown
	  WebElement dayele=driver.findElement(By.id("day"));
	  Utility.selectBasedDropDown(dayele,"27");
	  
	  //month 
	  WebElement monthele=driver.findElement(By.id("month"));
	  Utility.selectBasedDropDown(monthele,"Dec");
	  //year
	  
	  WebElement yearele=driver.findElement(By.id("year"));
	  Utility.selectBasedDropDown(yearele,"2010");
	  
	  
	  
	  
	  
//	  Select dd=new Select(dayele);
//	  
//	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
//	  
//	  //get all option
//	  WebElement ele=null;
//	  List<WebElement> allOption=dd.getOptions();
//	  System.out.println("Total Options are: "+allOption.size());
//	  
//	  for(WebElement i:allOption)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  ele=i;
//		  }
//	  }
//	  
//	  ele.click();
//	  
	  
	  
	  
	  
	  
	  
	  
  }
}
