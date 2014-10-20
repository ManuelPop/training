package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Constants.Constants;

import com.requirements.Application;
import com.steps.Loginsteps;
import com.steps.newrequestSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class RequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public Loginsteps loginstep;

	@Steps
	public newrequestSteps newrequest;
	
	@Steps
	public newrequestSteps startdate;
	
	@Test
	public void test() {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewRequest();
		newrequest.clickOnStartDate();
		newrequest.pickStartDate();

	}

}
