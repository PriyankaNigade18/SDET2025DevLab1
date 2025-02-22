package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathBasics {

	public static void main(String[] args) {
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//email
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("priyankatest123@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		
		//login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
		
		
		
	}

}
