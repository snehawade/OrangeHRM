package com.utility;

import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;

public class Utility extends Baseclass {
	
	public static String getWebelementText(WebElement ele) {
		return ele.getText();
	}
	
	public static void setText(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	public static void webelementClick(WebElement ele) {
		ele.click();
	}
	public static void setText(WebElement ele, CharSequence[] text) {
		ele.sendKeys(text);
	}

}
