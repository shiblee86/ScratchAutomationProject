package com.seleniumapi;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases extends BaseTest {

	// public static void main(String[] args) throws InterruptedException {

	@Test
	public void userAbleToSearchInInputField() throws InterruptedException {

		WebElement searchInputTextField = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

		//searchInputTextField.click();
		// driver.close();
		// The purpose of clicking is to see, whether search box is visible
		// This is a smoke test. The design has been created. Test is to see if the
		// labels are visible

		//WebElement usernameInput = driver.findElement(By.cssSelector("#formElement_1"));
		// If you use cssSelector, then # is necessary for id and . is necessary for
		// class

		if (searchInputTextField.isDisplayed() && searchInputTextField.isEnabled()) {
			searchInputTextField.sendKeys("iPhone");
			System.out.println("search box is displayed and enabled");
		} else {
			System.out.println("search box is not active");
		}
		
		WebElement searchButton = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
		searchButton.click();
		// Api test - successful message 200
		// Whether username and password exist
		// All the WebElement
		// Get window handle

		// List<WebElement> loginPageItems = new ArrayList<>();
	}

}
