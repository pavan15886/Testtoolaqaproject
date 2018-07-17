package com.toolsqa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	/*This constructor is used to create properties object and read the data from properties file */
	public SeleniumTestBase() {
		try{
			prop = new Properties();
			FileInputStream fis= new FileInputStream("C:/Users/Pavan/workspace/ToolsqaContactUsDemo/src/main/java/com/toolsqa/config/config.properties");
			prop.load(fis);
		}catch(IOException e)
		{
			e.getMessage();
		}
	
	}

	
//This method is to initialize browser drivers and maximize drivers
 public static void initialization(){
	 
	 String browserName = prop.getProperty("browser");
	 
	 if(browserName.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver_win32/chromedriver.exe");	
		 driver = new ChromeDriver(); 
	 }
	 else if(browserName.equals("FF")){
		 System.setProperty("webdriver.gecko.driver","please mention the firefox driver path if you prefer to run in FF");	
		 driver = new ChromeDriver(); 
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url"));
	 
 }

}
