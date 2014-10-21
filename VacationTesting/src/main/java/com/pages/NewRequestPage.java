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
	
	
	@FindBy(css = "input[name='startDate']")	
	private WebElementFacade startdate;
	public void clickOnStartDate()
	{
		startdate.click();
		
	}
	
	@FindBy(css = "td[class='dp_selected dp_current']")
	private WebElementFacade pickdate;
	public void pickStartDate()
	{
		pickdate.click();
		
	}
	
	@FindBy(css = "input[name='endDate']")
	private WebElementFacade enddate;
	public void clickOnEndDate()
	{
		enddate.click();
		
	}
	
	
	
}
