package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;

public class TC002_Cl extends com.leafBot.testng.api.base.ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
		
		/*LoginPage page = new LoginPage();
		page.enterUsername();
		page.enterPassword();
		page.clickLogin();
		
		HomePage page1 = new HomePage();
		page1.clickLogout();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






