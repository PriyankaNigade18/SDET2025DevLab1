package  Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//By locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By btn=By.id("login-button");
		
	
	
	//Methods
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void enterUsername(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn).click();
	}
	
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	public InvetoryPage doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(btn).click();
		return new InvetoryPage(driver);
	}
}
