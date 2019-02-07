package com.seleniumapi;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementVerification extends BaseTest{
	
	@Test
	public void testAlldropDown() {
		
		WebElement allDropDown = driver.findElement(By.xpath("//*[@class='nav-search-facade']"));
		
		allDropDown.click();
		
		List<WebElement>valuesInAlldropDown = 
	}

}
