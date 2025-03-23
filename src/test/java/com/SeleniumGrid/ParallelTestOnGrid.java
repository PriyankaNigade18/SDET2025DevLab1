package com.SeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ParallelTestOnGrid 
{
	WebDriver driver;
  @Test
  @Parameters({"bname"})
  public void testParallel(String bname) throws MalformedURLException, InterruptedException 
  {
	  switch(bname)
	  {
	  case "chrome":
		  
		  ChromeOptions cap1=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap1);
		  break;
		  
	  case "edge":
		  
		  EdgeOptions cap2=new EdgeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap2);
		  break;
		  
	  case "firefox":
	  
	  FirefoxOptions cap3=new FirefoxOptions();
	  driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap3);
	  break;
	  }
	  
	 System.out.println("Remote connectivity is completed......");
	 Thread.sleep(10000);
	 driver.get("https://www.google.com");
	 Thread.sleep(10000);
	 System.out.println("Title is: "+driver.getTitle());
	 driver.quit();
	 
	  
	  
	  
  }
}
