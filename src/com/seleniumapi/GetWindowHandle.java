package com.seleniumapi;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetWindowHandle {

	String expectedURL = "www.booking.com";

	@Test
	public void userAbleToValideUsernameInputField() throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println(
				"*****************************************************************************************************");
		System.out.println(os);

		String macPath = System.getProperty("user.dir");
		System.out.println(macPath);

		String macDriverPath = macPath + "/ChromeDriver/chromedriver";
		System.out.println(macDriverPath);

		System.setProperty("webdriver.chrome.driver", macDriverPath);

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.booking.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement flight = driver.findElement(By.cssSelector("#cross-product-bar > div > a:nth-child(2) > span"));
		flight.click();
		
		ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		
		WebElement accomodation = driver.findElement(By.xpath("#NVkk > div.keel-grid.headerContainerGrid.Common-Layout-Brands-Booking-Header > div.col.cross-product-bar > div > a:nth-child(1) > span"));
		accomodation.click();
	}
}
