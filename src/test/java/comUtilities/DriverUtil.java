package comUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil
{

	public static AppiumDriver driver;
	
	public static AppiumDriver initDriverSession()
	{
		//set the capabilities
		  UiAutomator2Options options=new UiAutomator2Options();
		  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		  options.setCapability("appium:app",path);
		  
		  //server address
		  try {
		  URL url=new URL("http://0.0.0.0:4723");
		    //create AppiumDriver session
		   driver=new AndroidDriver(url,options);
		  System.out.println("Session Id is: "+driver.getSessionId());
		  }catch(MalformedURLException m)
		  {
			  
		  }
		  
		  return driver;
		  
	}
	
	
	
}
