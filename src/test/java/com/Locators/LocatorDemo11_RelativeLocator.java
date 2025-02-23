package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo11_RelativeLocator {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");

		//get the search ele from Customer service which is at right side
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toRightOf(By.linkText("Customer Service"))).sendKeys("customer data");
		
		//get the search box which id left of SignIn
		WebElement searchbox=driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toLeftOf(By.linkText("Sign In")));
		
		searchbox.clear();
		searchbox.sendKeys("testing");
		
		
		//get the email ele which is above password ele
		
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmail.com");
		
		//get the password ele which is below email id
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		//near : check the checkbox which near to Remember me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		//get the submit button which is below that checkbox
		driver.findElement(RelativeLocator.with(By.id("submit-id")).below(By.id("remember"))).click();
		
		
		
		
		
		
	}

}
