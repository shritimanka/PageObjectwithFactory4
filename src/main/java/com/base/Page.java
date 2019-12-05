package com.base;


import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.WebDriverWait;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelReader;
import com.utilities.ExtentManager;


public class Page {
	
	/*
	 * WebDriver
	 * ExcelReader
	 * Logs
	 * Wait
	 * ExtentReports
	 */
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("MLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
		
	public static void initConfiguration() {
		
		if(Constants.browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Launching Chrome Browser");
			test.log(LogStatus.INFO, "Chrome Browser Launched");
		}
		driver.get(Constants.testUrl);
		driver.manage().window().maximize();		
	}
	
	public static void quitBrowser() {
		driver.quit();
		log.debug("Closing Browser");
		test.log(LogStatus.INFO, "Browser closing");
		
	}

	
}
