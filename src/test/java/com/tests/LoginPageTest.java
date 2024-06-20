package com.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pomclasses.LoginPagePom;
import com.utility.ExcelReader;
import com.utility.Utility;

@Listeners(MyListner.class)
public class LoginPageTest extends Baseclass {
	
	@BeforeClass
	public void setup() {
		launchWeb();
		
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
	public void adminLoginTest() throws IOException {
		
		LoginPagePom loginpagepom = new LoginPagePom();
		
		Assert.assertEquals(loginpagepom.getusername(), "Admin");
		Assert.assertEquals(loginpagepom.getpassword(), "admin123");
		
		//Utility.getScreenShot("adminLoginTest");
		loginpagepom.login(loginpagepom.getusername(), loginpagepom.getpassword());
	}

	/*@Test
	public void invalidloginTest() {
		
		loginpagepom.login(loginpagepom.getusername(), "123456");
		System.out.println(loginpagepom.getinvalidloginerrormsg());
	}*/

}
