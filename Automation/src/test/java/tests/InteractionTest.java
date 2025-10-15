package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import junit.framework.Assert;
import utils.WaitUtils;

public class InteractionTest {
	@Test(groups = {"Smoke"})
	public void handleConfermAllert() {
		driver.get(BASE_URL + "/alerts"); 
		
		WebElement confirmButton = driver.findElement(By.id("confirmButton"));
		confirmButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		
	}

	
}
