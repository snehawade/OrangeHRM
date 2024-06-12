package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pomclasses.AdminPagePom;
import com.pomclasses.LoginPagePom;

public class AdminPageTest extends Baseclass {

	AdminPagePom adminpagepom;
	LoginPagePom loginpagepom;
	
	@BeforeClass
	public void setup() {
		// getWebDriver();
		loginpagepom = new LoginPagePom();
		adminpagepom = new AdminPagePom();
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void usersearchtest() throws InterruptedException {
		
		Assert.assertEquals(loginpagepom.getusername(), "Admin");
		Assert.assertEquals(loginpagepom.getpassword(), "admin123");
			
		loginpagepom.login(loginpagepom.getusername(), loginpagepom.getpassword());
			
		adminpagepom.clickOnAdmin();
		adminpagepom.setUsername("Admin");
		adminpagepom.clickOnSearchButton();
		
		
	}
	
	
}
