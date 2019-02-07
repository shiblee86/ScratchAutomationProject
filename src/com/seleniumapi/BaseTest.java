package com.seleniumapi;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	String expectedURL = "https://www.amazon.com/";

	@BeforeClass
	public void beforeClassMethod() {
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println(
				"*****************************************************************************************************");
		System.out.println(os);

		String macPath = System.getProperty("user.dir");
		System.out.println(macPath);

		String macDriverPath = macPath + "/ChromeDriver/chromedriver";
		System.out.println(macDriverPath);

		System.setProperty("webdriver.chrome.driver", macDriverPath);

		driver = new ChromeDriver();

	}

	@BeforeMethod
	public void setUp() {

		driver.navigate().to(expectedURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// What is the default timeout in selenium - 30 sec
		
		// Selenium will wait 60 sec to find the element. It will then move onto the
		// next step.
		driver.manage().window().fullscreen();
		
		String currentURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedURL, currentURL);
		// If we use assert and the test case fails, the rest of the test cases will not
		// run
		// If we use verify (if), even if the test case fails, the rest if the test
		// cases will run
		// JUnit is a framework of java
		// What the difference between JUnit and TestNG
		// - JUnit has no reporting, TestNG has reporting
		// What is the synchronization
		// Implicit wait, explicit wait, thread.sleep, fluent wait

	}

	@AfterMethod
	public void segregateTestCases() {
		System.out.println("Test case has run");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
