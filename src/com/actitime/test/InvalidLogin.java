package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;

import generics.Excel;

public class InvalidLogin extends BaseTest{
	@Test
	public void testInvalidLogin(){
	String un=Excel.getCellValue(XL_PATH,"ValidLogin", 2, 0);
	String pw=Excel.getCellValue(XL_PATH,"ValidLogin", 2, 1);
	
	LoginPage l=new LoginPage(driver);
	
	l.SetUsername(un);
	
	l.SetPassword(pw);
	
	l.clickLoginButton();
	
	l.verifyErrDisplayed();
}

	
		
	}

