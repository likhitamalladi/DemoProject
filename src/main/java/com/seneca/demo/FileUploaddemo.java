package com.seneca.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class FileUploaddemo extends initializeDriver{

	demoConstants demoConstant=new demoConstants();
	@Test
	public void framesDemo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.Upload_URL);
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys(System.getProperty("user.dir")+"//resources//New Text Document.txt");
	
		driver.findElement(By.xpath("//button[@title='Upload selected files']")).click();
		driver.quit();
		
		
		
		
	}
}
