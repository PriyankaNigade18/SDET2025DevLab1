package com.JavaScriptExecutorScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJavascriptCommands {
  @Test
  public void testJs() throws InterruptedException
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //get the title
	  System.out.println(driver.getTitle());
	  
	 String title= js.executeScript("return document.title").toString();
	  System.out.println("Using js: "+title);
	  
	  //refresh page
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  System.out.println("************************");
	  js.executeScript("window.history.go()");
	  System.out.println("Refresh completd");
	
	  //open alert
	  js.executeScript("alert('Hello This is Js alert')");
	  
	  driver.switchTo().alert().accept();
	  
	  	  //click on cart ele
	  	  WebElement ele=driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]"));
	  	  
	  	  js.executeScript("arguments[0].click();",ele);
	  
	  
	  
	  
	  
	  
	  
  }
}
