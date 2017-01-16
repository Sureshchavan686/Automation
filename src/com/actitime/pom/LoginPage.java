package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

		
	@FindBy(id="username")
	private WebElement unTB;
	
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="loginButton")
	private WebElement LoginButton;
	
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
			private WebElement errMsg;
			
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void SetUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void SetPassword(String pw)
	{
		pwTB.sendKeys(pw);
		
	}
	
	public void clickLoginButton()
	{
		LoginButton.click();
	}
	
	
	
	
	
	public void verifyErrDisplayed()
	{
	
	verifyElementDisplayed(errMsg);
	

	}
	
	}
	