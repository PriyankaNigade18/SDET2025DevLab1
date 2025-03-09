package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DefaultTimeOutForWaits {
  @Test
  public void testDefaultTimeOut()
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  
	  
	  //pageLoad
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	  
	  //implicit wait-Global
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //set script time out
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	  
	  driver.get("https://www.google.com");
	  
	  
	  /*
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  System.out.println(allCap);
	  /*
	   * {acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=134.0.6998.35, 
	   *  chrome={chromedriverVersion=134.0.6998.35 (ea6ef4c2ac15ae95d2cfd65682da62c093415099-refs/branch-heads/6998@{#1472}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir31804_388054650}, 
	   *  fedcm:accounts=true,
	   *   goog:chromeOptions={debuggerAddress=localhost:65043}, networkConnectionEnabled=false, pageLoadStrategy=normal, platformName=windows, proxy=Proxy(), 
	   *   se:cdp=ws://localhost:65043/devtools/browser/d3b70a5d-6c3d-4fdb-9258-770ed76db648,
	   *    se:cdpVersion=134.0.6998.35, 
	   *    setWindowRect=true, 
	   *    strictFileInteractability=false,
	   *     timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *     unhandledPromptBehavior=dismiss and notify, 
	   *     webauthn:extension:credBlob=true, 
	   *     webauthn:extension:largeBlob=true, 
	   *     webauthn:extension:minPinLength=true, 
	   *     webauthn:extension:prf=true,
	   *  webauthn:virtualAuthenticators=true}
	   * 
	   * 
	   */
	  
  }
}
