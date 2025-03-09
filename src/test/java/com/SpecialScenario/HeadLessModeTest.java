package com.SpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessModeTest {
  @Test
  public void testHeadless() 
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  System.out.println("Session is created.....");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		  System.out.println("Application launch.....");

		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		  System.out.println("Search for valid Keyword.....");

		  System.out.println("All Options are captured.....");
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		driver.quit();
		
		  System.out.println("Session is closed.....");

		
  }
}
