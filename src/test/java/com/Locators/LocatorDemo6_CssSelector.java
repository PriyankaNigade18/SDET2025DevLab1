package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssSelector {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//email- css with id
		//driver.findElement(By.cssSelector("input#input-email")).sendKeys("priyankatest123@gmail.com");
		
		//^ startswith
		driver.findElement(By.cssSelector("input[id^='input-e']")).sendKeys("priyankatest123@gmail.com");
		
		//password with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		
		//login - with classname
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//tagname with class, attribute,id
		driver.findElement(By.cssSelector("input.btn.btn-primary[value='Login']")).click();
		
		
		
	}

}
