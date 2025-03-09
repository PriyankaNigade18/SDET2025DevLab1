package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo3_Enabled {
  @Test
  public void testChrome()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is:  "+driver.getTitle());
  }
  
  
  @Test
  public void testEdge()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is:  "+driver.getTitle());
  }
  
  @Test(enabled=false)
  public void testFirefox()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
	  System.out.println("Title is:  "+driver.getTitle());
  }
  
  @Test
  public void testFirefox2()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
	  System.out.println("Title is:  "+driver.getTitle());
  }
}
