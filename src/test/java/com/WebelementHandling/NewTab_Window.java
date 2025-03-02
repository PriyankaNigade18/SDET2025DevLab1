package com.WebelementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab_Window {
  @Test
  public void testNewTab_Window() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println(driver.getWindowHandle());
	  
	  //newWindow
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  System.out.println(newWin.getWindowHandle());
	  
	  //newTab
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  
	  
	  
  }
}
