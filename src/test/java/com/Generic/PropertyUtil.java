package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil 
{ 
	public Properties prop;
	
	public PropertyUtil(String fname)
	{
		//Properties class-java.util
		 prop=new Properties();
		//file-path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//"+fname+".properties");
		  
		  //file read in stream FileInputStream()
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
		  //load the file
			 prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  
		  
	}
	
	//method
	public String getData(String key)
	{
		return prop.getProperty(key);
	}

}
