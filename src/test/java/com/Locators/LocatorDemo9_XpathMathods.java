package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathMathods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//click on fashion: text()
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		
		//click on women
		driver.findElement(By.xpath("//span[normalize-space()='Women']")).click();
		
		//open cart
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//cart message
		String text=driver.findElement(By.xpath("(//h3)[1]")).getText();
		System.out.println("Cart Message: "+text);
		
		//search for product-contains()
		driver.findElement(By.xpath("//input[contains(@id,'searcht')]")).sendKeys("watch",Keys.ENTER);
		
		//search box -->clear the product and search for bags-startswith()
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
	}

}
