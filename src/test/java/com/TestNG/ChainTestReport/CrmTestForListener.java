package com.TestNG.ChainTestReport;

import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.TestNG.TestListeners.TestListeners.class)
public class CrmTestForListener extends BaseClass
{
	
		
  @Test(priority=1)
  public void testSignInLink()
  {
	  ChainTestListener.log("Testing signIn link functionality");
	  driver.findElement(By.linkText("Sign In")).click();
	  
  }
  
  
  @Test(priority=2)
  public void testLogin()
  {
	  
	driver.findElement(By.id("email-id##")).sendKeys("test@gmail.com");
	driver.findElement(By.id("password")).sendKeys("test123");
	driver.findElement(By.id("submit-id")).click();
	  ChainTestListener.log("Testing login with valid credentials");

	
	  
  }
  
  
  @Test(priority=3)
  public void testSignOut()
  {
	  
	driver.findElement(By.linkText("Sign Out")).click();  
	  ChainTestListener.log("Testing signOut link functionality");

  }
}
