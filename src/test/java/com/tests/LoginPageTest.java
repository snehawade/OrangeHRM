package com.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;

public class LoginPageTest extends Baseclass {
	
	@BeforeClass
	public void setup() {
		getWebDriver();
	}
		
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void pageUrl() {
		
		String pageurl = getWebDriver().getCurrentUrl();
		
		if(pageurl.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("We are on correct page....Test pass");
		}
		
		
	}
	

}
