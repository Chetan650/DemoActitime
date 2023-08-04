package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Log In");
		
	}

	@AfterMethod
	public void logOut() {
		Reporter.log("Log Out");
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser");
		driver.quit();
	}
}
