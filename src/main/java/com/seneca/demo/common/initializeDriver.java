package com.seneca.demo.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class initializeDriver {
	
	public static WebDriver driver;

	@BeforeSuite
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\server\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
