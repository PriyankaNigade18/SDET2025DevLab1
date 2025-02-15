package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToIdentifyElement {

	public static void main(String[] args) 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//identify element +perform action
		driver.findElement(By.id("APjFqb")).sendKeys("TestNG");
		
		/*
		//By locator technique
		
		//get the address
		By serachBox=By.id("APjFqb");
		
		//identify it using selenium
		WebElement searchEle=driver.findElement(serachBox);
		
		//validate or action
		System.out.println("Is search box displayed?: "+searchEle.isDisplayed());
		System.out.println("Is searchbox is Enabled?: "+searchEle.isEnabled());
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			searchEle.sendKeys("Java");
		}
		
		
		*/
		
		
		
		
		
	}

}
