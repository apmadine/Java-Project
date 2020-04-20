package com.cg.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 {

	@BeforeSuite
	public void beforeSuite(){
	System.out.println("before Suite");
	}

	@BeforeClass
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "");
		System.out.println("set property");
	}

	@BeforeTest
	public void beforeTestAnno() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}

	@Test
	public void loginValidation() {
		System.out.println("Login Validation");
	}

	@Test
	public void logout() {
		System.out.println("Logout Validation");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}

	@AfterTest
	public void afterTestAnno() {
		System.out.println("AfterTest");
	}

	@AfterClass
	public void OneTime() {
		System.out.println(" one time Execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
