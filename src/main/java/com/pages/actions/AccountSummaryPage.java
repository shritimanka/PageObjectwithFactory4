package com.pages.actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.AccountSummaryPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class AccountSummaryPage extends Page {
	
	public AccountSummaryPageLocators acctsummary;
	public AccountSummaryPage() {
		this.acctsummary=new AccountSummaryPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.acctsummary);
	}
	
	public String actual = driver.getTitle();

	
	public void goToAccountActivity() {
		
		
	}
	
	public void goToTransferFund() {
		
	}
	
	public void goToPayBills() {
		acctsummary.paybillsbtn.click();
		
	}
	
	public void goToMyMoneyMap() {
		
		
	}
	
	public void goToOnlineStatements() {
		
		
	}

}
