package com.TestNG.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{

	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/login.html");
		  
	}
	
	@BeforeMethod
	  public void getAppUrl()
	  {
		  System.out.println("Url is: "+driver.getCurrentUrl());
	  }
	  
	  @AfterClass
	  public void tearDown()
	  {
		  //close
		  driver.quit();
	  }
}
