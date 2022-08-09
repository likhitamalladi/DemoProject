package com.seneca.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.seneca.demo.businesslogic.Registration;
import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class alertdemo extends initializeDriver{
	demoConstants demoConstant=new demoConstants();
	@Test
	public void createAccount() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.ALERT_URL);
		driver.manage().window().maximize();
		//Ok alert
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("Testing");
		a.accept();
		
	//	driver.quit();
		
	}
}
