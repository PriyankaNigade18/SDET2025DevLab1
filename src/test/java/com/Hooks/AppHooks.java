package com.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BrowserUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{
public WebDriver driver;

	@Before
	public void setup()
	{
		//driver=new ChromeDriver();
		driver=BrowserUtil.setDriver("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.quit();
	}

}
