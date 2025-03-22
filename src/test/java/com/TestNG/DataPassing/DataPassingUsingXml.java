package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class DataPassingUsingXml
{
	@Parameters({"un","psw"})
   @Test
    public void testCase(String u,String p) throws InterruptedException 
  {
	  System.out.println("User Name is: "+u);
	  System.out.println("Password is: "+p);
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  Thread.sleep(2000);
	  Utility.getScreenShot(driver,"HrmHomepage");
	  driver.findElement(By.name("username")).sendKeys(u);
	  driver.findElement(By.name("password")).sendKeys(p);
	  Utility.getScreenShot(driver,"Credentials");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  Utility.getScreenShot(driver,"dashboard");
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  
  }
}
