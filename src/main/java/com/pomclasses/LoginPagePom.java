package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;
import com.utility.Utility;

public class LoginPagePom extends Baseclass {
	

	
	public LoginPagePom() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath ="//p[text()='Username : Admin']")
	private WebElement usernameText;
	
	@FindBy(xpath ="//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameInput;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']//child::p")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//div[contains(@class,\"alert-content--error\")]//p")
	private WebElement invalidloginerrormsg;
	
	public String getusername() {
		
		String userName = Utility.getWebelementText(usernameText);
		return userName.substring(userName.indexOf('A'));
	}
	
	public String getpassword() {
		String password = Utility.getWebelementText(passwordText);
		return password.substring(password.lastIndexOf('a'));
	}
	
	public String getinvalidloginerrormsg() {
		String invalidpass = Utility.getWebelementText(invalidloginerrormsg);
		return invalidpass;
	}
	
	public AdminPagePom login(String userName,String password ) {
		
		Utility.setText(usernameInput, userName);
		Utility.setText(passwordInput, password);
		Utility.webelementClick(loginbutton);
		return new AdminPagePom();
		
		
		
	}
	
	
	

}

