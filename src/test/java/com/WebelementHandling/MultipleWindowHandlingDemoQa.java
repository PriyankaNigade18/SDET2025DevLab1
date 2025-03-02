package com.WebelementHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class MultipleWindowHandlingDemoQa {
  @Test
  public void testMultipleWindows() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/browser-windows");
	  driver.manage().window().maximize();
	  
	  String parent=driver.getWindowHandle();
	  System.out.println(parent);
	  
	  String title;
	  //newTab
	  driver.findElement(By.id("tabButton")).click();
	  title=driver.getTitle();
	  System.out.println(title);
	  
	
	  //newwindow
	  driver.switchTo().window(parent);
	 
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	  title=driver.getTitle();
	  System.out.println(title);
	  
	  driver.switchTo().window(parent);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  //message
	  driver.findElement(By.id("messageWindowButton")).click();
	  title=driver.getTitle();
	  System.out.println(title);
	  
	  By heading=By.id("sampleHeading");
	  
	  Utility.windowHandling(driver,"https://demoqa.com/sample","",heading);
	  
//	  Set<String> allWindows=driver.getWindowHandles();
//	  System.out.println(allWindows);
	  
//	  Iterator<String> ir=allWindows.iterator();
//	  
//	  int count=0;
//	  while(ir.hasNext())
//	  {
//		  driver.switchTo().window(ir.next());
//		  count++;
//		  System.out.println(count);
//		  System.out.println(driver.getTitle());
//		  System.out.println(driver.getCurrentUrl());
//		 if(driver.getCurrentUrl().contains("https://demoqa.com/sample"))
//		 {
//			 String heading=driver.findElement(By.id("sampleHeading")).getText();
//			 System.out.println(heading);
//		 }
//		  
//	  }
	  
	  
	  
//	  LinkedList<String> ls=new LinkedList<String>(allWindows);
//	  System.out.println(ls);
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  String heading=driver.findElement(By.id("sampleHeading")).getText();
//	  System.out.println(heading);
	  
	  /*

	  String headingWindow=driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println(headingWindow);
	  
	  */
	  
	  
	  
  }
}
