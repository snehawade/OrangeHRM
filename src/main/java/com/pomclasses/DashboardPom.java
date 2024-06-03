package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPom {
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
	private WebElement search;
			
	@FindBy(xpath = "//span[text()='Admin']//parent::a")
	private WebElement admin;
	
	@FindBy(xpath = "//span[text()='PIM']//parent::a")
	private WebElement pim;
	
	@FindBy(xpath = "//span[text()='Leave']//parent::a")
	private WebElement leave;
	
	@FindBy(xpath = "//span[text()='Time']//parent::a")
	private WebElement time;
	
	@FindBy(xpath = "//span[text()='Recruitment']//parent::a")
	private WebElement recruitment;
	
	@FindBy(xpath = "//span[text()='My Info']//parent::a")
	private WebElement myinfo;
	
	@FindBy(xpath = "//span[text()='Performance']//parent::a")
	private WebElement performance;
	
	@FindBy(xpath = "//span[text()='Dashboard']//parent::a")
	private WebElement dashboard;
	
	@FindBy(xpath = "//span[text()='Directory']//parent::a")
	private WebElement directory;
	
	@FindBy(xpath = "//span[text()='Maintenance']//parent::a")
	private WebElement maintenance;
	
	@FindBy(xpath = "//span[text()='Claim']//parent::a")
	private WebElement claim;
	
	@FindBy(xpath = "//span[text()='Buzz']//parent::a")
	private WebElement buzz;
	
	@FindBy(xpath = "//button/i[@class='oxd-icon bi-chevron-left']")
	private WebElement leftsidebutton;
	
	@FindBy(xpath = "//ul/li[@class='--active oxd-userdropdown']")
	private WebElement userdropdown;
	
	@FindBy(xpath = "//a[text()='About']//parent::li")
	private WebElement about;
	
	@FindBy(xpath = "//a[text()='Support']//parent::li")
	private WebElement support;
	
	@FindBy(xpath = "//a[text()='Change Password']//parent::li")
	private WebElement changepassword;
	
	@FindBy(xpath = "//a[text()='Logout']//parent::li")
	private WebElement logout;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button']")
	private WebElement help;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-stopwatch']")
	private WebElement stopwatch;
	
	@FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[1]")
	private WebElement pendingselfreview;
	
	@FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[2]")
	private WebElement candidatetoreview;
	
	@FindBy(xpath = "//button[@title='Assign Leave']")
	private WebElement assignleave;
	
	@FindBy(xpath = "//button[@title='Leave List']")
	private WebElement leavelist;
	
	@FindBy(xpath = "//button[@title='Timesheets']")
	private WebElement timesheets;
	
	@FindBy(xpath = "//button[@title='Apply Leave']")
	private WebElement applyleave;
	
	@FindBy(xpath = "//button[@title='My Leave']")
	private WebElement myleave;
	
	@FindBy(xpath = "//button[@title='My Timesheet']")
	private WebElement mytimesheet;
	
	@FindBy(xpath = "(//div[@class='orangehrm-buzz-widget-header']//p[contains(@class,'buzz-widget-header-emp')])[1]")
	private WebElement buzzpostusername;
	
	@FindBy(xpath = "(//div[@class='orangehrm-buzz-widget-header']//p[contains(@class,'buzz-widget-header-time')])[1]")
	private WebElement buzzposttime;
		
	@FindBy(xpath = "//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
	private WebElement leavecardicon;
	
	@FindBy(xpath = "//div[@class='orangehrm-leave-card-details']//p[text()='Tran Anh']")
	private WebElement leaveemployename;
	
	@FindBy(xpath = "//div[@class='orangehrm-leave-card-details']//p[text()='CAN - FMLA']")
	private WebElement leaveemploydetail;
	
	@FindBy(xpath = "//div[@class='orangehrm-leave-card-details']//following-sibling::p[text()='123456']")
	private WebElement leaveemployeid;
	
	@FindBy(xpath = "//span[text()='Engineering']//parent::li")
	private WebElement engineeringunit;
	
	@FindBy(xpath = "//span[text()='Human Resources']//parent::li")
	private WebElement resourcesunit;
	
	@FindBy(xpath = "//span[text()='Administration']//parent::li")
	private WebElement administrationunit;
	
	@FindBy(xpath = "//span[text()='Client Services']//parent::li")
	private WebElement clientserviceunit;
	
	@FindBy(xpath = "(//span[text()='Unassigned']//parent::li)[1]")
	private WebElement unassignedunit;
	
	@FindBy(xpath = "//span[text()='Texas R&D']//parent::li")
	private WebElement texasrdlocationt;
	
	@FindBy(xpath = "//span[text()='New York Sales Office']//parent::li")
	private WebElement newyarksaleofficelocation;
	
	@FindBy(xpath = "(//span[text()='Unassigned']//parent::li)[2]")
	private WebElement unassignedlocation;
	
	@FindBy(xpath = "//canvas[@id='jkuZ6JqO']")
	private WebElement subunitpiechart;
	
	@FindBy(xpath = "//canvas[@id='mxa9vK4q']")
	private WebElement locationpiechart;
	
	
	
	
	
	
			
	
	
	
	
	

}
