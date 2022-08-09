package com.seneca.demo;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.seneca.demo.businesslogic.Registration;
import com.seneca.demo.common.demoConstants;
import com.seneca.demo.common.initializeDriver;

public class createaccount extends initializeDriver{
	demoConstants demoConstant=new demoConstants();
	@Test
	public void createAccount() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(demoConstant.DEMO_URL);
		driver.manage().window().maximize();
		Registration register=new Registration();
		register.registerAUser("English");
		
		driver.quit();
		
	}

}
