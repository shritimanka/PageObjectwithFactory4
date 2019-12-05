package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.LoginPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends Page {
	
	LoginPageLocators login;
	public LoginPage() {
		this.login=new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.login);
	}

	public void doLogin(String myusername, String mypassword) {
		log.debug("type username");
		//test.log(LogStatus.INFO, "Entering username");
		login.username.sendKeys(myusername);
		log.debug("type password");
		//test.log(LogStatus.INFO, "Entering password");
		login.password.sendKeys(mypassword);
		log.debug("click submit button");
		//test.log(LogStatus.INFO, "Click Submit Button");
		login.submitBtn.click();
	
		
	}

}
