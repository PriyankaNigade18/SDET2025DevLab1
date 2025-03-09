package com.SpecialScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestAppInIncognitoBrowser {
  @Test
  public void testIncognitoBrowser()
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--incognito");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.google.com");
  }
}
