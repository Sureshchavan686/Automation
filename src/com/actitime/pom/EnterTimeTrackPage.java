package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage extends BasePage {

	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpIcon;
	
	@FindBy(linkText="actiTIME")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[@class='product Version']")
	private WebElement productVersion;
	
	@FindBy(xpath="//img[@title='close']")
	private WebElement closeButton;
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);	
	
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	
	public void clickHelp()
	{
		helpIcon.click();	
	}
	
	public void ClickActiTIME()
	{
		aboutActiTIME.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	public void verifyVersion(String expected)
	{
		String actual=productVersion.getText();
		Assert.assertEquals(actual, expected);
	}
		
}



