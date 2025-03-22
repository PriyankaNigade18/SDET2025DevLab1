package com.TestNG.TestListeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport() 
  {
	  //create ExtentReport class object
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AppReprort.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("Automation Report");
	  spark.config().setReportName("Sprint1 Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached the report
	  extent.attachReporter(spark);
	  
	  //to generate log create test
	 ExtentTest test= extent.createTest("Test suite");
	  
	 
	 //logs
	 test.log(Status.PASS,"Test Pass");
	 
	 test.log(Status.FAIL,"Test Fail");
	 
	 test.log(Status.SKIP,"Test skip");
	 
	 test.log(Status.INFO, "Test information");
	 
	 test.log(Status.WARNING,"Test warning");
	 
	 //close the report
	 extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}
