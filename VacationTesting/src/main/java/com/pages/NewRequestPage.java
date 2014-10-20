package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class NewRequestPage extends PageObject {

	@FindBy(css = "a[href*='new-request']")
	private WebElementFacade newrequest;

	public void clickOnNewRequest() {
		newrequest.click();
	}
	
	
	@FindBy(css = "button[class='Zebra_DatePicker_Icon']")	
	private WebElementFacade startdate;
	public void clickOnStartDate()
	{
		startdate.click();
		
	}
	
}
