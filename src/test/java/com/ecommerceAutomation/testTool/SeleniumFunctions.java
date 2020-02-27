package com.ecommerceAutomation.testTool;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumFunctions {
	
	public static WebDriver driver;
	
//	String app
	public void openApp(String app) 
	{
		try{
			
			System.setProperty("webdriver.chrome.driver","./src/test/resources/chromeDriver/chromedriver79.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
//	        options.addArguments("--incognito");
	        driver = new ChromeDriver(options);
	        
	        driver.get(app);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		catch(Exception ex){
			System.out.println("Problem setting driver. "+ex.getMessage());
			ex.printStackTrace();
		}
	}

}
