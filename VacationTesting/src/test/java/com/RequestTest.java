package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Constants.Constants;

import com.google.protobuf.TextFormat.ParseException;
import com.requirements.Application;
import com.steps.Loginsteps;
import com.steps.newrequestSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)

public class RequestTest {
	
	
	String keyword;
	
	@Qualifier
	public String getContent() {
		return keyword;
	}

	public void setContent(String keyword) {
		this.keyword = keyword;
	}

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
	
	
	
	//Special-Other
	@Test
	public void test1() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewRequest();	
		newrequest.selectStartDate(11, 26, 2014);
	    newrequest.selectEndDate(11, 26, 2014);
		newrequest.chooseSpV();
		newrequest.chooseOther();
		newrequest.addComment();
		newrequest.addContent("anything..");
		newrequest.clickOnSave();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}
	
	//Special-Marriage
		@Test
		public void test2() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewRequest();	
			newrequest.selectStartDate(11, 26, 2014);
		    newrequest.selectEndDate(11, 26, 2014);
			newrequest.chooseSpV();
			newrequest.chooseMarriage();
			newrequest.addComment();
			newrequest.addContent("anything..");
			newrequest.clickOnSave();
			//newrequest.clickOnCancel();
			newrequest.logOut();
		}
		
		
		//Special-Child birth
		@Test
		public void test3() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewRequest();	
			newrequest.selectStartDate(11, 26, 2014);
		    newrequest.selectEndDate(11, 26, 2014);
			newrequest.chooseSpV();
			newrequest.chooseChild();
			newrequest.addComment();
			newrequest.addContent("anything..");
			newrequest.clickOnSave();
			//newrequest.clickOnCancel();
			newrequest.logOut();
		}
		
		
		//Special-funeral
		@Test
		public void test4() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewRequest();	
			newrequest.selectStartDate(11, 26, 2014);
		    newrequest.selectEndDate(11, 26, 2014);
			newrequest.chooseSpV();
			newrequest.chooseFuneral();
			newrequest.addComment();
			newrequest.addContent("anything..");
			newrequest.clickOnSave();
			//newrequest.clickOnCancel();
			newrequest.logOut();
		}
	
	
	
	//holiday
	@Test
	public void test5() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewRequest();	
		newrequest.selectStartDate(11, 27, 2014);
	    newrequest.selectEndDate(11, 27, 2014);
		newrequest.chooseHoliday();
		newrequest.addComment();
		newrequest.addContent("anything..");
		newrequest.clickOnSave();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}
	
	
	//without payment
	@Test
	public void test6() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewRequest();	
		newrequest.selectStartDate(11, 28, 2014);
	    newrequest.selectEndDate(11, 28, 2014);
		newrequest.chooseUnpaid();
		newrequest.addComment();
		newrequest.addContent("anything..");
		newrequest.clickOnSave();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}
	
	
	//sick leave
	@Test
	public void test7() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewRequest();	
		newrequest.selectStartDate(11, 28, 2014);
	    newrequest.selectEndDate(11, 28, 2014);
		newrequest.chooseSick();
		newrequest.addComment();
		newrequest.addContent("anything..");
		newrequest.clickOnSave();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}

}
