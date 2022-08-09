package com.seneca.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seneca.demo.common.initializeDriver;

public class RegistrationPage extends initializeDriver{
		
	public WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	
	public WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	
	public WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	
	public WebElement email=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	
	public WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));

	public WebElement maleRadioButton=driver.findElement(By.xpath("//input[@value='Male']"));
	
	public WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@value='FeMale']"));
	
	public WebElement cricketHobby=driver.findElement(By.xpath("//input[@value='Cricket']"));
	
	public WebElement moviesHobby=driver.findElement(By.xpath("//input[@value='Movies']"));
	
	public WebElement hockeyHobby=driver.findElement(By.xpath("//input[@value='Hockey']"));
	
	public WebElement languages=driver.findElement(By.xpath("//div[@id='msdd']"));
	
	public WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
	
	public WebElement countries=driver.findElement(By.xpath("//select[@id='countries']"));
	
	public WebElement country=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
	
	//public WebElement countryTextBox=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	public WebElement year=driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
	
	public WebElement month=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	
	public WebElement date=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
	
	public WebElement password=driver.findElement(By.xpath("//input[@id='firstpassword']"));
	
	public WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	
	public WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	
	
	
}
