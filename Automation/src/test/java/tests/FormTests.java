package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import junit.framework.Assert;
import utils.WaitUtils;

public class FormTests extends BaseTest {
	@Test(groups = {"Smoke", "Regression"})
	public void textBoxSubmission() {
		driver.get(BASE_URL + "/text-box"); 
		
		WebElement fullname = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement submit = driver.findElement(By.id("submit"));
		
		String name = "Ayan kumar Dash";
		String mail = "ayan@gmail.com";
		
		fullname.sendKeys(name);		
		email.sendKeys(mail);
		
		submit.click();

		WebElement output1= driver.findElement(By.id("name"));
		WebElement output= driver.findElement(By.id("email"));
		
		String outputText = output1.getText();
		String outputText2  = output2..getText();
		Assert.assertEquals(outputText, contains(name));
		Assert.assertEquals(outputText2, contains(mail));
	}
	
	@Test(groups = {"Regression"})
	public void checkBoxSelection() {
		driver.get(BASE_URL + "/checkbox");
		
		WebElement expandAll = driver.findElement(By.cssSelector("rct-title"));
		
		expandAll.click();
		
		WebElement doc  = driver.findElement(By.cssSelecto("rct-title"));
		
		doc.click();
		
		WebElement getDoc= driver.findElement(By.cssSelector("text-success"));
		
		Assert.assertEquals(getDoc, contains("Documents"));
	}

	
	
	
	private String contains(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}