package com.TestNG.ParallelTesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassA {
  @Test
  public void chromeTets()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  
  @Test
  public void edgeTets()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
  }
  
  
  @Test
  public void firefoxTets()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
  }
}
