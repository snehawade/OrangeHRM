package com.tests;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utility.Utility;

public class MyListner implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
	    try {
			Utility.getScreenShot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Utility.getScreenShot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }
}
