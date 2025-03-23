package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstGridTestCase {
  @Test
  public void testGrid() throws MalformedURLException, InterruptedException 
  {
	  //cpability-chrome
	 // ChromeOptions cap=new ChromeOptions();
	  
	  EdgeOptions cap=new EdgeOptions();
	  
	  URL url=new URL("http://localhost:4444");
	  
	  //start the session on remote server- RemoteWebDriver class
	  
	  WebDriver driver=new RemoteWebDriver(url,cap);
	  
	  System.out.println("Remote connectivity is completed....");
	  
	  Thread.sleep(5000);
	  
	  driver.get("https://www.amazon.in");
	  
	  Thread.sleep(10000);
	  
	  System.out.println("Title of Application: "+driver.getTitle());
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
