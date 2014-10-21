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

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewRequestPage;
import com.requirements.Application;
import com.steps.Loginsteps;
import com.steps.VacationTrackSteps;
import com.steps.newrequestSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)

public class VacationTrackTest {
	
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public Loginsteps loginstep;
	
	
	@Steps
	public VacationTrackSteps vacationtracker;
	
	
	
	@Test
	public void Test() throws ParseException {
		
		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		vacationtracker.clickOnTracker();
		vacationtracker.selectStartDate(10, 1, 2014);
		vacationtracker.selectEndDate(11, 3, 2014);
		vacationtracker.clickOnApply();
		
		
	}
	}
	
	


