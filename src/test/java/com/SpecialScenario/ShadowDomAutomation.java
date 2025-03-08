package com.SpecialScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShadowDomAutomation {
  @Test
  public void testShadowDomElements() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //host-->root-->element
	  WebElement host1=driver.findElement(By.cssSelector("div#shadow_host"));
	  
	  //host-->get root
	  SearchContext root1=host1.getShadowRoot();
	  
	  //root1-->ele
	  String text1=root1.findElement(By.cssSelector("span.info")).getText();
	  System.out.println(text1);
	  
	  //root1-->host2--->root2--->ele(nested shadow dom element)
	  WebElement host2=root1.findElement(By.cssSelector("div#nested_shadow_host"));
	  SearchContext root2=host2.getShadowRoot();	  
	  String text2=root2.findElement(By.cssSelector("div#nested_shadow_content")).getText();
	  System.out.println(text2);
	  
	  //inputbox
	  root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello All!");
	  
	  //click on blog
	  WebElement link=root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
	  
	  Thread.sleep(1000);
	  
	  //mouse action
	  Actions act=new Actions(driver);
	  act.moveToElement(link).click().build().perform();
	  
	  driver.navigate().back();
	  
	  
	  //checkbox
	  root1.findElement(By.cssSelector("input[type='checkbox']")).click();
	  
	  //file upload
	  root1.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\istqbnote.txt");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
