package com.TestNG.ScreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot {
  @Test
  public void testApp() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	 Screenshot shot= new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	 
	 
	 File dest=new File(System.getProperty("user.dir")+"//Screenshot//AmazonFullPage"+System.currentTimeMillis()+".png");
	 
	 try {
	 ImageIO.write(shot.getImage(),"PNG",dest);
	 }catch(Exception e)
	 {
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
