package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathIndexing {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//firstname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Raj");
		
		//lastname
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("sharma");
		
		//email
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=3]")).sendKeys("raj2025@gmail.com");
		
		//telephone
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("877665544");
		//password
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//get the message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
