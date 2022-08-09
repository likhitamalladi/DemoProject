package com.seneca.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class windowdemo extends initializeDriver{
	demoConstants demoConstant=new demoConstants();
	@Test
	public void createAccount() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.WINDOW_URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		switchTochildwindow();
		driver.findElement(By.xpath("//a[contains(@href,'download')]")).click();
		driver.close();
		switchTomainwindow();
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		switchTochildwindow();
		driver.findElement(By.xpath("//a[contains(@href,'download')]")).click();
		driver.close();
		switchTomainwindow();
		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]")).click();
		switchTochildwindow();
		driver.findElement(By.xpath("//a[contains(@href,'download')]")).click();
		driver.close();
		
		driver.quit();
		
		
		
	}
	public void switchTomainwindow() {
		Set<String> window1=driver.getWindowHandles();
		for(String a:window1) {
			driver.switchTo().window(a);
			if(driver.getTitle().contains("Frames & windows")) {
				break;
			}
			
		}
	}
	public void switchTochildwindow() {
		Set<String> window=driver.getWindowHandles();
		for(String a:window) {
			driver.switchTo().window(a);
			if(driver.getTitle().contains("Selenium")) {
				break;
			}
			
		}
	}
}
