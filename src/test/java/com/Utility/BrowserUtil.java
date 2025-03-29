package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil
{
	public static WebDriver driver;
	
	
	/*
	 * In Java, 
	 * ThreadLocal is a class that allows you to create variables
	 *  that are accessible only to the thread that created them, 
	 * ensuring thread-safe storage of data unique to each thread.
	 * 
	 *  get(): get the driver
	 *  set(): set the driver
	 */
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver setDriver(String bname)
	{
		if(bname.equals("Chrome"))
		{
			driver=new ChromeDriver();
			tdriver.set(driver);
		}
		return getDriver();
	}
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	
	
	
	
	
	
	
	
	
	

}
