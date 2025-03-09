package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropAction {
  @Test
  public void testDragAndDrop() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	   //frame
	  driver.switchTo().frame(0);
	  	  
	  WebElement src=driver.findElement(By.id("draggable"));
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,dest).perform();
	  
	  
	  
	  
	  
  }
}
