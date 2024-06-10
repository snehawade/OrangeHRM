package com.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pomclasses.LoginPagePom;

public class LoginPageTest extends Baseclass {
	LoginPagePom loginpagepom;

	@BeforeClass
	public void setup() {
		// getWebDriver();
		loginpagepom = new LoginPagePom();
	}

	@AfterClass
	public void teardown() {
		// driver.close();
	}

	@Test
	public void pageUrl() {

		String pageurl = driver.getCurrentUrl();

		if (pageurl.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("We are on correct page....Test pass");
		}

	}

	@Test
	public void loginTest() {
		loginpagepom.login(loginpagepom.getusername(), loginpagepom.getpassword());
	}

	@Test
	public void invalidloginTest() {
		loginpagepom.login(loginpagepom.getusername(), "123456");
		System.out.println(loginpagepom.getinvalidloginerrormsg());
	}

}
