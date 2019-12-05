package com.pages.actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.HomePageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends Page {
	
	public HomePageLocators home;
	public HomePage() {
		this.home=new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public void gotoSignIn() {
		log.debug("clicking signin button");
		//test.log(LogStatus.INFO, "Clicking on SignIn Button");
		
		home.signInBtn.click();
		
	
		
	}
	
	public void goToHome() {
		
		
	}
	
	public void goToOnLineBanking() {
		
	}
	
	public void goToFeedback() {
		
		
	}

}
