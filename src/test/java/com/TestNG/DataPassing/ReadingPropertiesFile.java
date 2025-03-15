package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingPropertiesFile {
  @Test
  public void testFileRead() throws IOException 
  {
	  
	  //file-path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//config.properties");
	  
	  //file read in stream FileInputStream()
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties class-java.util
	  Properties prop=new Properties();
	  
	  
	  //load the file
	  prop.load(fs);
	  
	  //read the file-getProperty(key)===>value
	  System.out.println("Browser name is: "+prop.getProperty("browsername"));
	  System.out.println("Url is: "+prop.getProperty("url"));
	  System.out.println("Email id is: "+prop.getProperty("email"));
	  System.out.println("Password is: "+prop.getProperty("pass"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
