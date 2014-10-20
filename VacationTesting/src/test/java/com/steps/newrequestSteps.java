package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.NewRequestPage;

public class newrequestSteps extends ScenarioSteps {

	NewRequestPage newrequest;

	@Step
	public void clickOnNewRequest() {

		newrequest.clickOnNewRequest();

	}
	
	NewRequestPage startdate;
	
	@Step
	public void clickOnStartDate() {
		
		startdate.clickOnStartDate();	
		
	}
}
