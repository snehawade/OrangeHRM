package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class LoginPagePom extends Baseclass {
	
	public LoginPagePom() {
		
		PageFactory.initElements(getWebDriver(),this);
		
	}
	
	
	@FindBy(xpath ="//p[text()='Username : Admin']")
	private WebElement usernameText;
	
	@FindBy(xpath ="//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']//child::p")
	private WebElement forgotPassword;
	
	

}

