package com.seneca.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class FramesDemo extends initializeDriver{

	demoConstants demoConstant=new demoConstants();
	@Test
	public void framesDemo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.Frames_URL);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input")).sendKeys("Test Automation");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement outerFrame=driver.findElement(By.xpath("//iframe[contains(@src,'Multiple')]"));
		driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'Single')]")));
		
		driver.findElement(By.xpath("//input")).sendKeys("Test Automation Multiple");
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
		
		
	}
}
