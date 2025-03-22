package com.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;


import com.SwagLab.Pages.*;
import com.SwagLab.Utility.*;

public class BaseClass 
{
	public WebDriver driver;
	public Page1_LoginPage lp;
	public PropertyUtil prop;
	public Page2_Inventory ip;
	public Page3_CartPage cp;
	public Page4_CheckOut co;
	public Page5_Overview ov;
	
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname)
	{
		prop=new PropertyUtil("config");
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new Page1_LoginPage(driver);
		ip=new Page2_Inventory(driver);
		cp=new Page3_CartPage(driver);
		co=new Page4_CheckOut(driver);
		ov=new Page5_Overview(driver);
		
		
	
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
