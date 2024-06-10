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
		String userName = usernameText.getText();
		return userName.substring(userName.indexOf('A'));
	}
	
	public String getpassword() {
		String password = usernameText.getText();
		return password.substring(password.lastIndexOf('a'));
	}
	
	public String getinvalidloginerrormsg() {
		return invalidloginerrormsg.getText();
	}
	
	public void login(String userName,String password ) {
		
		usernameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		loginbutton.click();
		
	}
	
	
	

}

