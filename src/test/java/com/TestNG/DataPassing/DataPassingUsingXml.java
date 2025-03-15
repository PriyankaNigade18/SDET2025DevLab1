package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataPassingUsingXml
{
	@Parameters({"un","psw"})
   @Test
    public void testCase(String u,String p) 
  {
	  System.out.println("User Name is: "+u);
	  System.out.println("Password is: "+p);
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(u);
	  driver.findElement(By.name("password")).sendKeys(p);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  
  }
}
