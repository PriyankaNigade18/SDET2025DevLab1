package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=zxczxc&submit-name=");

		//get the ancestor node tag for john
		String atag=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("For John Ancestor tag name is: "+atag);//tbody
		
		//get the parent node tag for John
		String ptag=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("For John Parent tag name is: "+ptag);//tr
		
		
		//get all the child nodes for row4
		int count=driver.findElements(By.xpath("//tbody/tr[4]//child::td")).size();
		System.out.println("Total child elemenets are: "+count);//5
		
		
		//get all number of rows after John
		int totalrows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After John total rows are: "+totalrows);//2
		
		
		//get all td tag after John
		int totaltd=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("After John total td tags are: "+totaltd);//13

		
		//get all rows before John
		int rows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Before John total rows are: "+rows);//4

		
		// get all following sibling for John
		List<WebElement> fsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		System.out.println("Total Following siblings are for John: "+fsibling.size());
		for(WebElement i:fsibling)
		{
			System.out.println(i.getText());
		}
		
		//get preceding sibling for john
		int psibling=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("For John preceding sibling are: "+psibling);
		
		
		
		
		
		
		
	}

}
