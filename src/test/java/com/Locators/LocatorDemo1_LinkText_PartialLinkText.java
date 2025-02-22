package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_LinkText_PartialLinkText {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//sign in link
		//driver.findElement(By.linkText("Sign In")).click();
		//NosuchElementException
		//driver.findElement(By.linkText("Sign")).click();//Exception
		
		
		//partial text match
		driver.findElement(By.partialLinkText("In")).click();

	}

}
