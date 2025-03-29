package Hooks;

import org.openqa.selenium.WebDriver;

import Utility.BrowserUtility;

import io.cucumber.java.Before;

public class AppHooks 
{
	
	public WebDriver driver;
	
	@Before
	public void setBrowser()
	{
		driver=BrowserUtility.setDriver("chrome");
	}

}
