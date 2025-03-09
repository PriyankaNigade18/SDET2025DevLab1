package com.SpecialScenario;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkAutomation 
{
	/*
	 * 
	 * 1.link is available with href
	 * 2.href should not be null or empty-->cant test
	 * 3.href us valid the convert it as URL to send request to server
	 * 4.get the response code
	 * 5.Compare it 
	 * 
	 * 
	 * 
	 */
  @Test
  public void testBrokenLink()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are: "+allLinks.size());
	  int brokencount=0;
	  for(WebElement i:allLinks)
	  {
		  String hrefValue=i.getDomAttribute("href");
		  if(hrefValue==null || hrefValue.isEmpty())
		  {
			  System.out.println(hrefValue+" :Invalid link as href is null or emepty: Can't Automate");
			  //skip it
			  continue;
		  }else {
		  
		  //valid link-->send the request to server
		  //string to url conversion
		  try {
		  URL url=new URL(hrefValue);
		  //open connection
		  HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		  
		  //connect with server-->get responsecode
		  conn.connect();
		  //get responsecode
		
		  
		  if(conn.getResponseCode()>=400)
		  {
			  System.out.println(hrefValue+"========== Broken link=========");
			  brokencount++;
		  }else
		  {
			  System.out.println(hrefValue+"  Valid link");

		  }
		  
		  }catch(Exception e)
		  {
			  
		  }
		  }
		  
	  }
	  
	  
	  
	  System.out.println("Total Broken links are: "+brokencount);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
