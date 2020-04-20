package com.cg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {

	@Test
	public void tcoo3test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium\\Myworkspace\\SeleniumTraning\\Selenium_jars v.4\\chromedriver.exe");

		WebDriver driverObject = new ChromeDriver();
		driverObject.get("http://selenium-webapp.pushvastech.in/");
		
		Thread.sleep(20000);
		driverObject.close();

	}

}
