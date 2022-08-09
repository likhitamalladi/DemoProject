package com.seneca.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class draganddropDemo extends initializeDriver{

	demoConstants demoConstant=new demoConstants();
	@Test
	public void framesDemo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.Static_URL);
		driver.manage().window().maximize();
		
		WebElement drag1=driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement drag2=driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement drag3=driver.findElement(By.xpath("//img[@id='node']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1, drop).build().perform();
		a.dragAndDrop(drag2, drop).build().perform();
		a.dragAndDrop(drag3, drop).build().perform();
		
		
		driver.quit();
		
		
		
		
	}
}
