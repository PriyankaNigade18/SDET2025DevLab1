package com.WebelementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeHandling {
  @Test
  public void testFrame() 
  
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame with indexing-frame1
	  driver.switchTo().frame(0);
	   
	  driver.findElement(By.name("mytext1")).sendKeys("Frame1");
	  
	  /*
	   * Selects either the first frame on the page, 
	   * or the main document when a page containsiframes. 
	   */
	  //come to main window
	  driver.switchTo().defaultContent();
	  
	  //switch to frame-NoSuchFrameException: no such frame
		  driver.switchTo().frame(1);
	  //textbox2
	  driver.findElement(By.name("mytext2")).sendKeys("Frame2");
	  
	  //frame3
	  
	  //come to main window
	  driver.switchTo().defaultContent();
	  
	  //frame with Webelement
	  WebElement frameEle=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  
	  driver.switchTo().frame(frameEle);
	  WebElement ele=driver.findElement(By.name("mytext3"));
	  ele.sendKeys("Frame3");
	  
	  //frame3-->inner page-->in differnt frame-->inner frame
	  driver.switchTo().frame(0);
	  
	  //select radio button
	  driver.findElement(By.id("i9")).click();
	  
	  //come to parent frame
	  driver.switchTo().parentFrame();//frame3
	  
	  ele.clear();
	  ele.sendKeys("Hello");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
