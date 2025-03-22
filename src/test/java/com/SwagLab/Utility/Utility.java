package com.SwagLab.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	
	public static void getScreenShot(WebDriver driver,String filename)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File(System.getProperty("user.dir")+"//Screenshot//"+filename+System.currentTimeMillis()+".png");
		 
		 try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//explicitWait utility
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
		  
	}
	
	
	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
		  
	}
	
	
	public static WebElement waitForElementClickable(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.elementToBeClickable(loc));
		  
	}
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.titleContains(title));
		  
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.urlContains(url));
		  
	}
	
	public static Alert handleAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	
	public static void windowHandling(WebDriver driver,String url,String title,By loc)
	{
		 Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> ir=allWindows.iterator();
		  
		  int count=0;
		  while(ir.hasNext())
		  {
			  driver.switchTo().window(ir.next());
			  count++;
			  System.out.println(count);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			 if(driver.getTitle().equalsIgnoreCase(title))
			 {
				 String heading=driver.findElement(loc).getText();
				 System.out.println(heading);
			 }else if(driver.getCurrentUrl().equalsIgnoreCase(url))
			 {
				 String heading=driver.findElement(loc).getText();
				 System.out.println(heading);
			 }
			  
		  }
	}
	
	public static void selectBasedDropDown(WebElement ddele,String value)
	{
		Select dd=new Select(ddele);
		  
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  //get all option
		  WebElement ele=null;
		  List<WebElement> allOption=dd.getOptions();
		  System.out.println("Total Options are: "+allOption.size());
		  
		  for(WebElement i:allOption)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  ele=i;
			  }
		  }
		  
		  ele.click();
		  
	}
	
	//Javascript utility-scroll
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
	}
	
	public static void scrollUpToElement(WebDriver driver,WebElement expEle)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",expEle);
		  
	}
	

}
