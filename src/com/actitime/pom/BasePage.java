package com.actitime.pom;


import org.testng.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public abstract class BasePage {

	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void verifyTitle(String expectedTitle)
	{
		WebDriverWait  wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			Reporter.log("Title is Same:PASS",true);
		
		}
	catch(TimeoutException e)
		{
		Reporter.log("Title is not Same:FAIL",true);
	Assert.fail();
		}
	}
	
	public void verifyElementDisplayed(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Displayed:PASS",true);
		}
		
		catch(TimeoutException e)
		{

			Reporter.log("Element is not Displayed:FAIL",true);
			Assert.fail();
				
		}
	
	}
		
}
