package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends com.leafBot.testng.api.base.ProjectSpecificMethods {

	public HomePage() {
		// Pagefactory code
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogout;

	public LoginPage clickLogout() {
		eleLogout.click();
		return new LoginPage();
	}
}
