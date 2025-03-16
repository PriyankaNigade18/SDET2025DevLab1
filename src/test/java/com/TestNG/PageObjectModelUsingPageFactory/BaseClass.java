package com.TestNG.PageObjectModelUsingPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.TestNG.PageObjectModelUsingByLocator.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public HRMLoginPage lp;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new HRMLoginPage(driver);
	}
}
