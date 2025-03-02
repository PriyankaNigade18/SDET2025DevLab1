package com.WebelementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AlertHandlingDemo2 {
  @Test
  public void testAllTypesOfAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  
	//result
	  WebElement result=driver.findElement(By.id("result"));
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Thread.sleep(1500);
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of Alert1: "+alt1.getText());
	  //ok
	  alt1.accept();
	  System.out.println("Result is: "+result.getText());
	  
	  //alert2-confirmation alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Thread.sleep(1500);
	  
	 // Alert alt2=driver.switchTo().alert();
	  Alert alt2=Utility.handleAlert(driver);
	  System.out.println("Text of alert2: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  
	  System.out.println("Result is: "+result.getText());
	  
	  //alert3-Prompt
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Thread.sleep(1500);
	  
	  Alert alt3=Utility.handleAlert(driver);
	  System.out.println("Text of Alert3: "+alt3.getText());
	  
	  alt3.sendKeys("Hello All");
	  
	  alt3.accept();
	  
	  System.out.println("Result is: "+result.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
