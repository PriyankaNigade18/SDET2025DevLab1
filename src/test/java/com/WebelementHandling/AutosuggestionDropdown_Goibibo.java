package com.WebelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutosuggestionDropdown_Goibibo {
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	  
	  driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();

	  //input
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
	  
	  List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
	  System.out.println("Total options: "+alloptions.size());
	  
	  for(WebElement i:alloptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Pantnagar, India"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
