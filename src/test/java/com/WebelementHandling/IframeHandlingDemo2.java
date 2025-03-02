package com.WebelementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class IframeHandlingDemo2 {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //frame1--->middle
	  driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
	  System.out.println(driver.getPageSource());
	  System.out.println(driver.findElement(By.id("content")).getText());
	  
	  //middle--->right side
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-right");
	  
	  System.out.println(driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText());
	  
	  
  }
}
