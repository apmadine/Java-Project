package com.cg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC004 {

	@Test
	public void tc004Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium\\Myworkspace\\SeleniumTraning\\Selenium_jars v.4\\chromedriver.exe");

		WebDriver driverObject = new ChromeDriver();
		String url = "https://jqueryui.com/droppable/";
		driverObject.get(url);
		Thread.sleep(20000);
		driverObject.close();

	}

}
