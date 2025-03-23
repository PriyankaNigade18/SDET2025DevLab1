package com.TestNG.ChainTestReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.aventstack.chaintest.plugins.ChainTestListener;


@Listeners(ChainTestListener.class)
public class BaseClass {

WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}
	
	
	@AfterMethod
	public void getStatus(ITestResult result)
	{
		if(!result.isSuccess())
		{
			ChainTestListener.embed(getScreenshot(),"image/png");
		}
	}
	
	public byte[] getScreenshot()
	{
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	
	
	
}
