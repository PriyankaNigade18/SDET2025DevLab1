package com.MouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightclickAction {
  @Test
  public void testRightclick() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //right click-contextClick()
	  
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //menu
	  
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  WebElement e=null;
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  e=i;
		  }
	  }
	  
	  //click
	  e.click();
	  
	  //alert will open
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
