package com.SpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVGElementAutomation {
  @Test
  public void testHrmSVGElement()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  List<WebElement> svgEle=driver.findElements(By.xpath("//*[name()='svg']"));
	  System.out.println("Total SVG elements on page are: "+svgEle.size());
	  
	  for(WebElement i:svgEle)
	  {
		  i.click();
		  break;
	  }
	  
	  
	  
	  
  }
  
  
  @Test
  public void testSVGAutomation()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  List<WebElement> list=driver.findElements(By.xpath("//div[@class='svg-container']//*[name()='svg']//child::*"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println("Shape is: "+i.getTagName());
		  System.out.println("Color is: "+i.getDomAttribute("fill"));
	  }
  }
}
