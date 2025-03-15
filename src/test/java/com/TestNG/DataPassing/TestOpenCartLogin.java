package com.TestNG.DataPassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.PropertyUtil;

public class TestOpenCartLogin {
  @Test
  public void testLogin()
    {
	  PropertyUtil prop=new PropertyUtil("config");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(prop.getData("url"));
  	  driver.findElement(By.name("email")).sendKeys(prop.getData("email"));
	  driver.findElement(By.name("password")).sendKeys(prop.getData("pass"));
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
