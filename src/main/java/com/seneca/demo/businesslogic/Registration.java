package com.seneca.demo.businesslogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.seneca.demo.common.initializeDriver;
import com.seneca.demo.pages.RegistrationPage;

public class Registration extends RegistrationPage{

	
	
	public void registerAUser(String language) {
	
		firstName.sendKeys("Likhita");
		lastName.sendKeys("Malladi");
		address.sendKeys("Alkapur");
		phone.sendKeys("1234567890");
		email.sendKeys("test@gmail.com");
		femaleRadioButton.click();
		moviesHobby.click();
		languages.click();
		selectLanguage(language);
		selectObject(skills).selectByVisibleText("C");
		//selectObject(countries).selectByVisibleText("Select Country");
		country.click();
		initializeDriver.driver.findElement(By.xpath("//input[@type='search']")).sendKeys("india");
		initializeDriver.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		selectObject(year).selectByVisibleText("1995");
		selectObject(month).selectByVisibleText("August");
		selectObject(date).selectByVisibleText("25");
		password.sendKeys("test@123");
		confirmPassword.sendKeys("test@123");
		submit.click();
		
	}
	
	public void selectLanguage(String language) {
		initializeDriver.driver.findElement(By.xpath("//a[contains(text(),'"+language+"')]")).click();
	}
	
	public Select selectObject(WebElement ele) {
		Select s=new Select(ele);
		
		return s;
	}
	
	
}
