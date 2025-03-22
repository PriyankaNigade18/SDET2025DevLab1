package com.TestNG.TestListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart() invoke as test started: "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess() invoke as test is pass: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure() invoke as test is Fail: "+result.getName());
	}
	
	

}
