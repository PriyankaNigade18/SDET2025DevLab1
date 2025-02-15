package com.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReading {

	public static void main(String[] args)throws Exception
	{
		// file path
		File f1=new File(System.getProperty("user.dir")+"//config.properties");
		
		//Thread.sleep(3000);
		
		//read file in stream
		FileInputStream fs=new FileInputStream(f1);
		
		//Properties class from Java
		Properties p1=new Properties();
		
		//load the file- load()
		p1.load(fs);
		
		//read the data using getProperty(Key)--->value
		
		System.out.println("Browser name is: "+p1.getProperty("bname"));
		
		
		System.out.println("Browser version is: "+p1.getProperty("bversion"));
		
	}

}
