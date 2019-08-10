package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends com.leafBot.testng.api.base.ProjectSpecificMethods {

	public LoginPage() {
		// Pagefactory code
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "username")
	WebElement eleUsername;
	@FindBy(how = How.ID, using = "password")
	WebElement elePassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogin;

	public LoginPage enterUsername(String data) {
		eleUsername.sendKeys(data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		elePassword.sendKeys(data);
		return this;
	}

	public HomePage clickLogin() {
		eleLogin.click();
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		return new HomePage();
	}

}
