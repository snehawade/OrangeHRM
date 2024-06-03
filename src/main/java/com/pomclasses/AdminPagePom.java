package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPagePom {

	@FindBy(xpath = "//span[contains(text(),'User Management ')]//parent::li")
	private WebElement usermanagment;
	
	@FindBy(xpath = "//a[contains(text(),'Users')]//parent::li")
	private WebElement users;
	
	@FindBy(xpath = "//span[contains(text(),'Job ')]//parent::li")
	private WebElement job;
	
	@FindBy(xpath = "//a[contains(text(),'Job Titles')]//parent::li")
	private WebElement jobtitle;
	
	@FindBy(xpath = "//a[contains(text(),'Pay Grades')]//parent::li")
	private WebElement playgrades;
	
	@FindBy(xpath = "//a[contains(text(),'Employment Status')]//parent::li")
	private WebElement employmentstatus;
	
	@FindBy(xpath = "//a[contains(text(),'Job Categories')]//parent::li")
	private WebElement jobcategories;
	
	@FindBy(xpath = "//a[contains(text(),'Work Shifts')]//parent::li")
	private WebElement workshifts;
	
	@FindBy(xpath = "//span[contains(text(),'Organization ')]//parent::li")
	private WebElement organization;
	
	@FindBy(xpath = "//a[contains(text(),'General Information')]//parent::li")
	private WebElement generalinformation;
	
	@FindBy(xpath = "//a[contains(text(),'Locations')]//parent::li")
	private WebElement locations;
	
	@FindBy(xpath = "//a[contains(text(),'Structure')]//parent::li")
	private WebElement structure;
	
	@FindBy(xpath = "//span[contains(text(),'Qualifications ')]//parent::li")
	private WebElement qualifications;
	
	@FindBy(xpath = "//a[contains(text(),'Skills')]//parent::li")
	private WebElement skills;
	
	@FindBy(xpath = "//a[contains(text(),'Education')]//parent::li")
	private WebElement education;
	
	@FindBy(xpath = "//a[contains(text(),'Licenses')]//parent::li")
	private WebElement licenses;
	
	@FindBy(xpath = "//a[contains(text(),'Languages')]//parent::li")
	private WebElement languages;
	
	@FindBy(xpath = "//a[contains(text(),'Memberships')]//parent::li")
	private WebElement memberships;
	
	@FindBy(xpath = "//a[contains(text(),'Nationalities')]//parent::li")
	private WebElement nationalities;
	
	@FindBy(xpath = "//a[contains(text(),'Corporate Branding')]//parent::li")
	private WebElement corporatebranding;
	
	@FindBy(xpath = "//span[contains(text(),'Configuration ')]//parent::li")
	private WebElement configuration;
	
	@FindBy(xpath = "//a[contains(text(),'Email Configuration')]//parent::li")
	private WebElement emailconfiguration;
	
	@FindBy(xpath = "//a[contains(text(),'Email Subscriptions')]//parent::li")
	private WebElement emailsubscriptions;
	
	@FindBy(xpath = "//a[contains(text(),'Localization')]//parent::li")
	private WebElement localization;
	
	@FindBy(xpath = "//a[contains(text(),'Language Packages')]//parent::li")
	private WebElement languagepackages;
	
	@FindBy(xpath = "//a[contains(text(),'Modules')]//parent::li")
	private WebElement modules;
	
	@FindBy(xpath = "//a[contains(text(),'Social Media Authentication')]//parent::li")
	private WebElement socialmediaauthentication;
	
	@FindBy(xpath = "//a[contains(text(),'Register OAuth Client')]//parent::li")
	private WebElement registeraouthclient;
	
	@FindBy(xpath = "//a[contains(text(),'LDAP Configuration')]//parent::li")
	private WebElement ldapconfiguration;
	
	@FindBy(xpath = "//button[@title='Help']")
	private WebElement help;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
	private WebElement userroleselect;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]//input")
	private WebElement employeename;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
	private WebElement statusselect;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement reset;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement search;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement adduserpage;
	
	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement usernamecheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='1']")
	private WebElement fmlnamecheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='2']")
	private WebElement fmlname1checkbox;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='3']")
	private WebElement noonecheckbox;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deleteadmin;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletefmlname;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[3]")
	private WebElement deletefmlname1;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[4]")
	private WebElement deletenoone;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editadmin;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editfmlname;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[3]")
	private WebElement editfmlname1;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[4]")
	private WebElement editnoone;
	
	//Admin edit page:-
	
	@FindBy(xpath = "//div[text()='Admin']")
	private WebElement editadminuserrole;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]//input")
	private WebElement editadminemployeename;
	
	@FindBy(xpath = "//span[contains(@class,'oxd-checkbox-input oxd-checkbox-input--active --label-right')]")
	private WebElement admincheckboxchangepassword;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement admincancelbutton;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement adminsavebutton;
	
			
	//job title page:-
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addjobtitlepage;			
	
	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement jobtitlecheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='0']")
	private WebElement accountassistantcheckbox;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deleteaccountassistant;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editaccountassistant;
	
	//job title account assistant edit page:-
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement editjobtitle;
	
	@FindBy(xpath = "(//textarea[contains(@class,'oxd-textarea oxd-textarea--active')])[1]")
	private WebElement editjobdescription;
	
	@FindBy(xpath = "//div[text()='Browse']")
	private WebElement jobspecificationbrowse;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
	private WebElement editjobtitlesendbutton;
	
	@FindBy(xpath = "(//textarea[contains(@class,'oxd-textarea oxd-textarea--active')])[2]")
	private WebElement editjobtitlenote;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement jobtitlecancelbutton;
				
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement jobtitlesavebutton;
	
	//pay grade page:-
	
	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement namecheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='0']")
	private WebElement grade1checkbox;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletegrade1;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editgrade1;
	
	//grade1 edit page-pay grade:-
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
}
