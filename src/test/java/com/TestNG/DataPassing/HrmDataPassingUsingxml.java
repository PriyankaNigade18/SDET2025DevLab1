package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HrmDataPassingUsingxml extends BaseClass
{
//WebDriver driver;
//
//
//	@BeforeClass
//	@Parameters({"bname"})
//	public void setUp(String bname)
//	{
//		switch(bname.toLowerCase())
//		{case "chrome":driver=new ChromeDriver();break;
//		case "edge":driver=new EdgeDriver();break;
//		case "firefox":driver=new FirefoxDriver();break;
//		default:return;
//		}
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
  @Test
  public void testLogin()
  {
	   
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  System.out.println(driver.getCurrentUrl());
  }
}
