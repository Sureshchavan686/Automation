package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

import generics.Excel;

public class ValidLogin extends BaseTest{

	@Test
	public void testValidLogin()
	{
		String un=Excel.getCellValue(XL_PATH,"ValidLogin",1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLogin", 1, 1);
		String eHomePageTitle=Excel.getCellValue(XL_PATH, "ValidLogin", 1, 2);
		String eLoginPageTitle=Excel.getCellValue(XL_PATH, "ValidLogin", 1, 3);
		
		//enter valid User name

		LoginPage l=new LoginPage(driver);
		l.SetUsername(un);
		
		//enter valid password
		l.SetPassword(pw);
		
		//click on login button
		l.clickLoginButton();
		

		//verify home page is displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(eHomePageTitle);
		
		//click on logout 
		e.clicklogout();
		
		//verify login page is displayed
		
		l.verifyTitle(eLoginPageTitle);
	
	}
	
}
