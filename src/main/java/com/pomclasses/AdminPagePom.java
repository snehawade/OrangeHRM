package com.pomclasses;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class AdminPagePom extends Baseclass {
	
	public AdminPagePom() {
	
		PageFactory.initElements(getWebDriver(),this);// implementing pageobject model in selenium framework
		
		//PageFactory.initElements(driver, this) statement initializes the page element 
			//so that you can work directly on the element without getting the NullPointerException 
			//(since the page object has been initialized implicitly).
	}
	
	
	// user managment page:-
	@FindBy(xpath = "//span[contains(text(),'User Management ')]//parent::li")
	private WebElement usermanagment;

	@FindBy(xpath = "//a[contains(text(),'Users')]//parent::li")
	private WebElement users;

	@FindBy(xpath = "//button[@title='Help']")
	private WebElement help;
	
	//user page :- 
	
	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper']//a[contains(@href,'viewAdminModule')]")
	private WebElement admin;
			
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	
	@FindBy(xpath = "((//div[text()='Admin'])[1]")
	private WebElement usernametext;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
	private WebElement userroleselect;
	
	@FindBy(xpath = "((//div[text()='Admin'])[2]")
	private WebElement userroleselectoption;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]//input")
	private WebElement employeename;
	
	@FindBy(xpath = "//div[text()='Pruthviraj Gharge']")
	private WebElement employeenametext;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
	private WebElement statusselect;
	
	@FindBy(xpath = "((//div[text()='Enabled'])[1]")
	private WebElement statusselecttext;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement reset;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement search;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement adduserpage;
	
	public void clickOnAdmin() throws InterruptedException {
		System.out.println(admin.isDisplayed());
		admin.click();
		Thread.sleep(Duration.ofSeconds(10));
	}

	public void setUsername (String text) {
		
		username.sendKeys(text);
				
	}
	
	public void clickOnSearchButton() throws InterruptedException {
		search.click();
		Thread.sleep(Duration.ofSeconds(5));
	}
	
	/*public String selectuserrole() {
		
		Utility.webelementClick(userroleselect);
		String text = Utility.getWebelementText(userroleselectoption);
		return text;
					
	}
	
	public String setemployeename() {
		
		Utility.webelementClick(employeename);
		String emptext = Utility.getWebelementText(employeenametext);
		return emptext;
		
	}
	
	public String status() {
		Utility.webelementClick(statusselect);
		String statustext = Utility.getWebelementText(statusselecttext);
		return statustext;
		
	}*/
	
	/*public void searchuser(String usertext) throws InterruptedException {
		
		//super.login(super.getusername(),super.getpassword());
		
		 * Actions act = new Actions(driver); act.moveToElement(admin); admin.click();
		 */
		
		/*	Utility.setText(userroleselect,text);
		Utility.setText(employeename, emptext);
		Utility.setText(statusselect, statustext);
		
		search.click();
	}*/
	
	
	
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

	// Admin edit page:-

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

		
	// Job- job title page:-
	
	@FindBy(xpath = "//span[contains(text(),'Job ')]//parent::li")
	private WebElement job;

	@FindBy(xpath = "//a[contains(text(),'Job Titles')]//parent::li")
	private WebElement jobtitle;

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

	// job title account assistant edit page:-

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

	// Job- pay grade page:-
	
	@FindBy(xpath = "//a[contains(text(),'Pay Grades')]//parent::li")
	private WebElement playgrades;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement namecheckbox;

	@FindBy(xpath = "//input[@type='checkbox' and @value='0']")
	private WebElement grade1checkbox;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletegrade1;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editgrade1;

	// grade1 edit page-pay grade:-
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement paygradecancelbutton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement paygradesavebutton;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addcurrencies;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxcurrency;

	// Job- Employment status page:-
	
	@FindBy(xpath = "//a[contains(text(),'Employment Status')]//parent::li")
	private WebElement employmentstatus;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addemploymentstatus;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxemployementstatus;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxfreelance;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxfulltimecontract;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editfreelance;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editfulltimecontract;

	// edit Employment status page:-

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement freelancecancelbutton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement freelancesavebutton;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement fulltimecontractcancelbutton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement fulltimecontractsavebutton;

	// Job- Job categories page:-
	
	@FindBy(xpath = "//a[contains(text(),'Job Categories')]//parent::li")
	private WebElement jobcategories;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addejobcategories;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxjobcategories;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxcraftworkers;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxlaborersandhelpers;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttoncraftworkers;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttonlaborersandhelpers;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editcraftworkers;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editlaborersandhelpers;

	// edit job categories page:-

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoncraftworkers;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoncraftworkers;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttonlaborersandhelpers;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttonlaborersandhelpers;

	// Job- work shift page:-
	
	@FindBy(xpath = "//a[contains(text(),'Work Shifts')]//parent::li")
	private WebElement workshifts;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addeworkshift;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxname;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxgeneral;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxtwilight;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttongeneral;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttontwilight;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editgereral;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement edittwilight;

	// edit work shift page:-

	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]/div[contains(@class,'oxd-autocomplete-text-input--before')]")
	private WebElement editgeneralassignedemployeetext;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement editgeneralworkshiftcancelbutton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement editgenralworkshiftsavebutton;

	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]/div[contains(@class,'oxd-autocomplete-text-input--before')]")
	private WebElement edittwilightassignedemployeetexttwilight;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttonedittwilightworkshift;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttonedittwilightworkshift;

	// Organization-general information page:-
	
	@FindBy(xpath = "//a[contains(text(),'General Information')]//parent::li")
	private WebElement generalinformation;
	
	@FindBy(xpath = "//span[contains(text(),'Organization ')]//parent::li")
	private WebElement organization;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']/label")
	private WebElement editenablebuttongeneralinformation;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement countrydropdrownarrow;

	@FindBy(xpath = "//textarea[contains(@class,'oxd-textarea oxd-textarea--active')]")
	private WebElement notestext;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebuttongeneralinformation;

	// Organization-locations page:-
	
	@FindBy(xpath = "//a[contains(text(),'Locations')]//parent::li")
	private WebElement locations;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement textname;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement textcity;

	@FindBy(xpath = "//div[text()='-- Select --']")
	private WebElement selectdropdowncounrty;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement resetbuttonlocation;

	@FindBy(xpath = "(//button[contains(@class,'oxd-button oxd-button--medium oxd-button')])[2]")
	private WebElement searchbuttonlocation;

	@FindBy(xpath = "(//button[contains(@class,'oxd-button oxd-button--medium oxd-button')])[3]")
	private WebElement addbuttonlocation;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxnamelocation;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxcanadianregionalhq;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxhqcausa;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttoncanadianregionalhq;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttonhqcausa;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editcanadianregionalhq;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement edithqcausa;

	// edit page Location

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcanadianregionalhq;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcanadianregionalhq;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttonedithqcausa;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttonedithqcausa;

	// Organization Structure page:-
	
	@FindBy(xpath = "//a[contains(text(),'Structure')]//parent::li")
	private WebElement structure;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']/label")
	private WebElement editenablebuttonorganizationstructure;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addeorganizationstructure;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash-fill'])[1]")
	private WebElement deletebuttonadministration;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash-fill'])[2]")
	private WebElement deletebuttonengineering;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editbuttonadministration;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editbuttonengineering;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-plus'])[1]")
	private WebElement addbuttonadministration;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-plus'])[2]")
	private WebElement addbuttonengineering;

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-up']")
	private WebElement dropdownarrowengineering;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash-fill'])[3]")
	private WebElement deletebuttondevelopment;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[3]")
	private WebElement editbuttondevelopment;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-plus'])[3]")
	private WebElement addbuttondevelopment;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash-fill'])[4]")
	private WebElement deletebuttonqualityassurance;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[4]")
	private WebElement editbuttonqualityassurance;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-plus'])[4]")
	private WebElement addbuttonqualityassurance;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash-fill'])[5]")
	private WebElement deletebuttontechops;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[5]")
	private WebElement editbuttontechops;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-plus'])[5]")
	private WebElement addbuttontechops;

	// qualification-Skill page:-
	
	@FindBy(xpath = "//a[contains(text(),'Skills')]//parent::li")
	private WebElement skills;
	
	@FindBy(xpath = "//span[contains(text(),'Qualifications ')]//parent::li")
	private WebElement qualifications;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addskill;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxnameskill;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxcontentcreation;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxcopywritting;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttoncontentcreation;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttoncopywritting;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editcontentcreation;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editcopywritting;

	// edit qualification Skill page:-

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcontentcreation;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcontentcreation;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcopywritting;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcopywritting;

	// qualification-education page:-
	
	@FindBy(xpath = "//a[contains(text(),'Education')]//parent::li")
	private WebElement education;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addeducation;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxleveltext;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxbachelorsdegree;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxcollegeundergraduate;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttonbachelorsdegree;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttoncollegeundergraduate;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editbachelorsdegree;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editcollegeundergraduate;

	// edit qualification education page:-

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditbachelorsdegree;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditbachelorsdegree;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcollegeundergraduate;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcollegeundergraduate;

	// qualification-licenses page:-
	
	@FindBy(xpath = "//a[contains(text(),'Licenses')]//parent::li")
	private WebElement licenses;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addlicenses;

	@FindBy(xpath = "//div[@role='columnheader']//input[@type='checkbox']")
	private WebElement checkboxnametext;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkboxcdmp;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkboxcism;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement deletebuttoncdmp;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement deletebuttoncism;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement editcdmp;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editcism;

	// edit qualification licenses page:-

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcdmp;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcdmp;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancelbuttoneditcism;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebuttoneditcism;

	// Languages Page:-
	
	@FindBy(xpath = "//a[contains(text(),'Languages')]//parent::li")
	private WebElement languages;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Name_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Arabic_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement Chinese_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement English_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement French_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	private WebElement Russian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	private WebElement Spanish_checkbox;
	// Delete button of Arabic
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Arabic_delete;
	// Edit button of Arabic
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Arabic_Edit;
	// After edit form textbox,buttons of Arabic
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Arabic_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Arabic;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Arabic;

	// Delete button of Chinese
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Chinese_delete;
	// Edit button of Chinese
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Chinese_Edit;
	// After edit form textbox,buttons of Chinese
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Chinese_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Chinese;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Chinese;

	// Delete button of English
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement English_delete;
	// Edit button of English
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement English_Edit;
	// After edit form textbox,buttons of English
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement English_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_English;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_English;

	// Delete button of French
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement French_delete;
	// Edit button of French
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement French_Edit;
	// After edit form textbox,buttons of French
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement French_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_French;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_French;

	// Delete button of Russian
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Russian_delete;
	// Edit button of Russian
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Russian_Edit;
	// After edit form textbox,buttons of Russian
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Russian_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Russian;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Russian;

	// Delete button of Spanish
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Spanish_delete;
	// Edit button of Spanish
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Spanish_Edit;
	// After edit form textbox,buttons of Spanish
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Spanish_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Spanish;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Spanish;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement ADD_button;

	// Memberships page:-
	
	@FindBy(xpath = "//a[contains(text(),'Memberships')]//parent::li")
	private WebElement memberships;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Membership_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement ACCA_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement British_Computer_Society_BCS_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement Chartered_Institute_of_Marketing_CIM_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement CIMA_checkbox;
	// Delete button of ACCA
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement ACCA_delete;
	// Edit button of Spanish
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement ACCA_Edit;
	// After edit form textbox,buttons of Spanish
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement ACCA_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_ACCA;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_ACCA;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement ADD_button_ACCA;
	// Same x-path of British computer society(BCS),CIM & CIMA...............
	
	// Nationalities page x-path:-
	
	@FindBy(xpath = "//a[contains(text(),'Nationalities')]//parent::li")
	private WebElement nationalities;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Nationality_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Afghan_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement Albanian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement Algerian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement American_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	private WebElement Andorran_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	private WebElement Angolan_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	private WebElement Antiguans_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[9]")
	private WebElement Argentinean_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[10]")
	private WebElement Armenian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[11]")
	private WebElement Australian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[12]")
	private WebElement Austrian_checkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[13]")
	private WebElement Azerbaijani_checkbox;
	// Same x-path of Edit and delete button as above
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Afghan_delete;
	// Edit button of Afghan
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Afghan_Edit;
	// After edit form textbox,buttons of Afghan
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Afghan_Edit_testbox;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Afghan;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Afghan;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement ADD_button_Afghan;
	// Same x-path to all Natinality field options only change index no.

	// Corporate Branding Page.......
	
	@FindBy(xpath = "//a[contains(text(),'Corporate Branding')]//parent::li")
	private WebElement corporatebranding;

	@FindBy(xpath = "(//div[@tabindex='0'])[1]")
	private WebElement Primary_Color;

	@FindBy(xpath = "(//div[@tabindex='0'])[2]")
	private WebElement Secondary_Color;

	@FindBy(xpath = "(//div[@tabindex='0'])[3]")
	private WebElement Primary_Font_Color;

	@FindBy(xpath = "(//div[@tabindex='0'])[4]")
	private WebElement Secondary_Font_Color;

	@FindBy(xpath = "(//div[@tabindex='0'])[5]")
	private WebElement Primary_Gradient_Color_1;

	@FindBy(xpath = "(//div[@tabindex='0'])[6]")
	private WebElement Primary_Gradient_Color_2;

	@FindBy(xpath = "(//div[text()='Browse'])[1]")
	private WebElement Browse_Client_logo;

	@FindBy(xpath = "(//div[text()='Browse'])[2]")
	private WebElement Browse_Client_Banner;

	@FindBy(xpath = "(//div[text()='Browse'])[3]")
	private WebElement Browse_Login_Banner;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']")
	private WebElement Social_Media_Images_swich_button;

	@FindBy(xpath = "//button[text()=' Reset to Default ']")
	private WebElement Reset_to_Default;

	@FindBy(xpath = "//button[text()=' Preview ']")
	private WebElement Preview_button;

	@FindBy(xpath = "//button[text()=' Publish ']")
	private WebElement Publish_button;
	// Configuration Page xpath..........
	
	@FindBy(xpath = "//span[contains(text(),'Configuration ')]//parent::li")
	private WebElement configuration;
	
	// Email Configuration page:-
	
	@FindBy(xpath = "//a[contains(text(),'Email Configuration')]//parent::li")
	private WebElement emailconfiguration;
	
	@FindBy(xpath = "//a[text()='Email Configuration']")
	private WebElement Email_Configuration_link;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Mail_sent_textbox;

	@FindBy(xpath = "//input[@value='smtps']")
	private WebElement SECURE_SMTP_radiobutton;

	@FindBy(xpath = "//input[@value='smtp']")
	private WebElement SMTP_radiobutton;

	@FindBy(xpath = "//input[@value='sendmail']")
	private WebElement sendmail_radiobutton;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']")
	private WebElement send_text_mail_button;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement Text_email_address_field;

	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement Reset_button;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button;
	
	// Email Subscriptions page
	
	@FindBy(xpath = "//a[contains(text(),'Email Subscriptions')]//parent::li")
	private WebElement emailsubscriptions;
	
	@FindBy(xpath = "//a[text()='Email Subscriptions']")
	private WebElement Email_Subscriptions_link;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement Leave_Applications_button;

	@FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[1]")
	private WebElement Leave_Applications_wrapperSwich;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement Leave_Approvals_button;

	@FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[2]")
	private WebElement Leave_Approvals_wrapperSwich;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement Leave_Assignments_button;

	@FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[3]")
	private WebElement Leave_Assignments_wrapperSwich;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement Leave_Cancellations_button;

	@FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[4]")
	private WebElement Leave_Cancellations_wrapperSwich;

	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement Leave_Rejections_button;

	@FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[5]")
	private WebElement Leave_Rejections_wrapperSwich;
	
	//Localization Page:- 
	
	@FindBy(xpath = "//a[contains(text(),'Localization')]//parent::li")
	private WebElement localization;
	
	//Language Packages page:- 
	
	@FindBy(xpath = "//a[contains(text(),'Language Packages')]//parent::li")
	private WebElement languagepackages;

	//Modules page:-
	
	@FindBy(xpath = "//a[contains(text(),'Modules')]//parent::li")
	private WebElement modules;
	
	//social media authentication page:-
	
	@FindBy(xpath = "//a[contains(text(),'Social Media Authentication')]//parent::li")
	private WebElement socialmediaauthentication;
	
	//Register Oauth client page:-
	
	@FindBy(xpath = "//a[contains(text(),'Register OAuth Client')]//parent::li")
	private WebElement registeraouthclient;
	
	//LDAP configuration page :-
	
	@FindBy(xpath = "//a[contains(text(),'LDAP Configuration')]//parent::li")
	private WebElement ldapconfiguration;
}
