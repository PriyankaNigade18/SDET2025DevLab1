package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_TagName {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//number of inputboxes
		List<WebElement> allInputs=driver.findElements(By.tagName("input"));
		System.out.println("Total Number of Input Boxes: "+allInputs.size());//3
		
		//Number of images
		int count=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images in this page: "+count);//3
		
		
		//Number of Links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are: "+allLinks.size());//5
		
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		
		//get the text of every link
		//get the href attribute value in console
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			if(i.getDomAttribute("href").contains(exp))
			{
				System.out.println("Match found...Test Pass!");
				i.click();
				break;
			}
		}
		

	}

}
