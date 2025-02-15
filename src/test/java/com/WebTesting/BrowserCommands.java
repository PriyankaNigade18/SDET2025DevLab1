package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application-get(url)
		//InvalidArgumentException: invalid argument
		//driver.get("www.google.com");
		driver.get("https://automationplayground.com/crm/");
		
		//getTitle():String
		System.out.println("Title is: "+driver.getTitle());
		
		//getCurrentUrl:String
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//getPageSource():String
		System.out.println(driver.getPageSource());
		
		//close the browser close() quit()
		//driver.close();
		driver.quit();

	}

}
