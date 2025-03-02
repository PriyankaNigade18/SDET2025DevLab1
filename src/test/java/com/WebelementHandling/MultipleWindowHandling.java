package com.WebelementHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindows()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
	  //child window
	 Set<String> allWindowsId= driver.getWindowHandles();
	 System.out.println(allWindowsId);
	 
	 //switch to child window
	 for(String childId:allWindowsId)
	 {
		 if(!parentId.equals(childId))
		 {
			
			 driver.switchTo().window(childId);
			 System.out.println("child Window Id:"+driver.getWindowHandle());
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			//driver.close();
			 //driver.quit();
		 }
	 }
	 
	 //parent
	 driver.switchTo().window(parentId);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
