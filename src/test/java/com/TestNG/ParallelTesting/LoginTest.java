package com.TestNG.ParallelTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
  @Test
  public void testlogin()
  
  {
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Login")).click();
	  driver.findElement(By.name("email")).sendKeys("priyankatest123@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("test123");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
