package com.TestNG.ParallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest 
{
  @Test(priority=1)
  public void testcase1()
  {
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  System.out.println("Test Case 1 for list of options");
	  
  }
  
  @Test(priority=2)
  public void testregisterlink()
  {
	  driver.findElement(By.linkText("Register")).click();
	  System.out.println("Test Case 2 for open regiter page");
	  
  }
  
  @Test(priority=3)
  public void testLogin()
  {
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Login")).click();
	  
  }
}
