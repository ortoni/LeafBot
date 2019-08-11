package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;

public class TC001_Login extends com.leafBot.testng.api.base.ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName = "Login";
		testcaseDec = "Login";
		author = "balaji";
		category = "smoke";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






