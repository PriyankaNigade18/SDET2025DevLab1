package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class OpenCartExplicitWaitUsingWebDriverWait {
  @Test
  public void testExplicit() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  
	  Utility.waitForPresenceOfElement(driver,email).sendKeys("test@gmail.com");
	  Utility.waitForVisibilityOfElement(driver,password).sendKeys("test123");
	  Utility.waitForElementClickable(driver,loginBtn).click();
	  
	  
	  /*
	   * TimeoutException: Expected condition failed:
	   *  waiting for presence of element located by: 
	   * By.id: input-email#### (tried for 5 second(s) 
	   * with 500 milliseconds interval)
	   * interval time is polling time
	   * Selenium default polling time=500ms ==>0.5 sec
	   
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  
	  emailEle.sendKeys("test@gmail.com");
	  
	  //password
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
	  
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
