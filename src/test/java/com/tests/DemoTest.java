package com.tests;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups = {"regression"}, priority = 4)
	public void Test1() {
		System.out.println("In test 1");
	}
	
	@Test(groups = {"regression","sanity"},priority = 1)
	public void Test2() {
		System.out.println("In test 2");
	}

	@Test(invocationCount = 4, priority = -2)
	public void Test3() {
		System.out.println("In test 3");
	}

	@Test(dependsOnGroups = {"sanity"})
	public void Test4() {
		System.out.println("In test 4");
	}

	@Test(dependsOnMethods = {"Test4"})
	public void Test5() {
		System.out.println("In test 5");
	}
	
	@Test(enabled = true)
	public void Test6() {
		System.out.println("In test 6");
	}
}
