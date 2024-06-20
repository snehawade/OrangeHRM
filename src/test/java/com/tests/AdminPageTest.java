package com.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pomclasses.AdminPagePom;
import com.pomclasses.LoginPagePom;
import com.utility.ExcelReader;
import com.utility.Utility;

@Listeners(MyListner.class)
public class AdminPageTest extends Baseclass {

	@BeforeClass
	public void setup() {
		launchWeb();

	}

	@AfterClass
	public void teardown() {
		//driver.close();
	}

	@Test
	public void addUserTest() throws EncryptedDocumentException, IOException {

		
		LoginPagePom loginpagepom = new LoginPagePom();
		
		Assert.assertEquals(loginpagepom.getusername(), "Admin");
		Assert.assertEquals(loginpagepom.getpassword(), "admin123");

		AdminPagePom adminpagepom = loginpagepom.login(loginpagepom.getusername(), loginpagepom.getpassword());

		adminpagepom.gotoAdminPage();
		adminpagepom.addUser();

		Map<String, Object> userData = getExcelSheetRowData();

		System.out.println(userData.get("User_Role").toString());
		adminpagepom.setUserRole(userData.get("User_Role").toString());
		
		//Utility.getScreenShot("addUserTest");
		
		adminpagepom.setUserStatus(userData.get("Status").toString());

		adminpagepom.setEmployeename(userData.get("Employee_Name").toString());
		
		

		adminpagepom.setUserDetails(userData.get("User_Name").toString(), userData.get("Password").toString(),
				userData.get("Confirm_Password").toString());

	}

	public Map<String, Object> getExcelSheetRowData() throws EncryptedDocumentException, IOException {
		FileInputStream fis = ExcelReader.readExcelSheet("User_Details.xlsx");
		Sheet sh = ExcelReader.getSheet(fis,"Add_User");
		Map<String, Object> rowData = ExcelReader.getRowData(sh, 1);
		System.out.println(rowData);
		return rowData;

	}

}
