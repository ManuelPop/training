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
import com.requirements.Application;
import com.steps.newrequestSteps;
import com.steps.Loginsteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)

public class NewVacationRequestTests {
	
	
	/*String keyword;
	
	@Qualifier
	public String getContent() {
		return keyword;
	}

	public void setContent(String keyword) {
		this.keyword = keyword;
	}
*/
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
	public void testSpecialVacationRequestOtherType() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewVacationRequest();	
		newrequest.clickToSelectStartDateOfVacation(11, 2, 2014);
	    newrequest.clickToSelectEndDateOfVacation(11, 2, 2014);
		newrequest.chooseSpecialVacationType();
		newrequest.chooseOtherSpecialVacationType();
		newrequest.addComment();
		newrequest.addContentToComment("anything..");
		newrequest.clickOnSaveButton();
		//newrequest.clickOnCancel();
		newrequest.verifyIfFailed("Your request failed to complete.");
		newrequest.logOut();
		
	}
	
	
		@Test
		public void testSpecialVacationRequestMarriageType() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewVacationRequest();	
			newrequest.clickToSelectStartDateOfVacation(11, 7, 2014);
		    newrequest.clickToSelectEndDateOfVacation(11, 7, 2014);
			newrequest.chooseSpecialVacationType();
			newrequest.chooseMarriageVacationType();
			newrequest.addComment();
			newrequest.addContentToComment("anything..");
			newrequest.clickOnSaveButton();
			//newrequest.clickOnCancel();
			newrequest.verifyIfSucceed("Your request completed successfully.");
			newrequest.clickOnWithdrawButton();
			newrequest.logOut();
		}
		
		
		
		@Test
		public void testSpecialVacationRequestChildBirthType() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewVacationRequest();	
			newrequest.clickToSelectStartDateOfVacation(10, 28, 2014);
		    newrequest.clickToSelectEndDateOfVacation(10, 28, 2014);
			newrequest.chooseSpecialVacationType();
			newrequest.chooseChildBirthVacationType();
			newrequest.addComment();
			newrequest.addContentToComment("anything..");
			newrequest.clickOnSaveButton();
			//newrequest.clickOnCancel();
			newrequest.logOut();
		}
		
		
		
		@Test
		public void testSpecialvacationRequestFuneralType() throws ParseException {

			loginstep.login(Constants.PMuser, Constants.PMpassword);
			loginstep.clickVacation();
			newrequest.clickOnNewVacationRequest();	
			newrequest.clickToSelectStartDateOfVacation(11, 13, 2014);
		    newrequest.clickToSelectEndDateOfVacation(11, 13, 2014);
			newrequest.chooseSpecialVacationType();
			newrequest.chooseFuneralVacationType();
			newrequest.addComment();
			newrequest.addContentToComment("anything..");
			newrequest.clickOnSaveButton();
			//newrequest.clickOnCancel();
			newrequest.logOut();
		}
	
	
	
	
	@Test
	public void testHolidayVacationRequest() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewVacationRequest();	
		newrequest.clickToSelectStartDateOfVacation(11, 15, 2014);
	    newrequest.clickToSelectEndDateOfVacation(11, 17, 2014);
		newrequest.chooseHolidayVacationType();
		newrequest.addComment();
		newrequest.addContentToComment("anything..");
		newrequest.clickOnSaveButton();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}
	
	
	@Test
	public void testVacationWithoutPaymentRequest() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewVacationRequest();	
		newrequest.clickToSelectStartDateOfVacation(11, 11, 2014);
	    newrequest.clickToSelectEndDateOfVacation(11, 11, 2014);
		newrequest.chooseVacationWithoutPaymentType();
		newrequest.addComment();
		newrequest.addContentToComment("anything..");
		newrequest.clickOnSaveButton();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}
	
	
	
	@Test
	public void testSickLeaveVacationRequest() throws ParseException {

		loginstep.login(Constants.PMuser, Constants.PMpassword);
		loginstep.clickVacation();
		newrequest.clickOnNewVacationRequest();	
		newrequest.clickToSelectStartDateOfVacation(11, 29, 2014);
	    newrequest.clickToSelectEndDateOfVacation(11, 28, 2016);
		newrequest.chooseSickLeaveVacationType();
		newrequest.addComment();
		newrequest.addContentToComment("anything..");
		newrequest.clickOnSaveButton();
		//newrequest.clickOnCancel();
		newrequest.logOut();
	}

}
