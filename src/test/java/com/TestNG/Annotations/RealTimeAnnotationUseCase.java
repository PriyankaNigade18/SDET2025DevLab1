package com.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationUseCase extends BaseClass {
  
//	WebDriver driver;
	
//	@BeforeClass
//	public void setUp()
//	{
//		 driver=new ChromeDriver();
//		 driver.get("https://automationplayground.com/crm/login.html");
//		  
//	}
	
	@Test(priority=1)
  public void testCRMAppforLogin() throws InterruptedException 
  {
	 
		System.out.println("Test 1 is running.....");
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  Thread.sleep(2000);
	  
	   
  }
  
  @Test(priority=2)
  public void testCRMAppforLogout() throws InterruptedException
  {
	//logout
		System.out.println("Test 2 is running.....");
	  driver.findElement(By.linkText("Sign Out")).click();
	  Thread.sleep(2000);
  }
  
//  @BeforeMethod
//  public void getAppUrl()
//  {
//	  System.out.println("Url is: "+driver.getCurrentUrl());
//  }
//  
//  @AfterClass
//  public void tearDown()
//  {
//	  //close
//	  driver.quit();
//  }
}
