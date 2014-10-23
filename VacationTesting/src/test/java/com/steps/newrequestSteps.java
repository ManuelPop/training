package com.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewVacationRequestMenuItem;


public class newrequestSteps extends ScenarioSteps {

	NewVacationRequestMenuItem newrequest;

	@Step
	public void clickOnNewVacationRequest() {

		newrequest.clickOnNewVacationRequest();

	}
	
	
	@Step
	 public void clickToSelectStartDateOfVacation(int month, int day, int year) throws ParseException
	 {
	  newrequest.clickOnStartDateToSelectStartDate();
	  try {
		newrequest.settingDateByGivenParameter(month, day, year);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 }

	 public void clickToSelectEndDateOfVacation(int month, int day, int year) throws ParseException {
	  newrequest.clickOnEndDateToSelectEndDate();
	  try {
		newrequest.settingDateByGivenParameter(month, day, year);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 }
	
	

	//Special Vacation type
	NewVacationRequestMenuItem specialvacation;
	
	@Step
	public void chooseSpecialVacationType(){
		specialvacation.chooseSpecialVacationType();
		
	}
	NewVacationRequestMenuItem othervacation;
	
	@Step
	public void chooseOtherSpecialVacationType() {
		othervacation.chooseOtherSpecialVacationType();
		
	}
	NewVacationRequestMenuItem marriagevacation;
	
	@Step
	public void chooseMarriageVacationType() {
		marriagevacation.chooseMarriageVacationType();
		
	}
	NewVacationRequestMenuItem childvacation;
	
	@Step
	public void chooseChildBirthVacationType() {
		childvacation.chooseChildBirthVacationType();
		
	}
	NewVacationRequestMenuItem funeralvacation;
	
	@Step
	public void chooseFuneralVacationType() {
		funeralvacation.chooseFuneralVacationType();
		
	}
	
	
	
	NewVacationRequestMenuItem holiday;
	
	@Step
	public void chooseHolidayVacationType() {
		holiday.chooseHolidayVacationType();		
	}
	
	
	NewVacationRequestMenuItem unpaid;
	
	@Step
	public void chooseVacationWithoutPaymentType() {
		unpaid.chooseVacationWithoutPayment();
		
	}
	
	
	NewVacationRequestMenuItem sick;
	
	@Step
	public void chooseSickLeaveVacationType() {
		sick.chooseSickVacationType();
		
	}
	
	
	
	
	
	NewVacationRequestMenuItem addcomment;
	
	@Step
	public void addComment() {
		addcomment.addComment();
		
	}
	
	NewVacationRequestMenuItem content;
	
	@Step
	public void addContentToComment(String text) {
		content.addContentToCommentBox(text);
		
	}
	
	NewVacationRequestMenuItem save;
	
	@Step
	public void clickOnSaveButton() {
		save.clickOnSaveButton();
		
	}
	
	NewVacationRequestMenuItem cancel;
	
	@Step
	public void clickOnCancelButton() {
		cancel.clickOnCancel();
		
	}

	NewVacationRequestMenuItem logout;
	
	@Step
	public void logOut() {
		logout.logOut();
		
	}
	
	
	
	@Step
    public void verifyIfFailed(String message){
        WebElement alert = getDriver().findElement(By.cssSelector("div[class='portlet-msg-error']"));
        Assert.assertTrue(alert.getText().toLowerCase().contains(message.toLowerCase()));
	}
	
	
	@Step
    public void verifyIfSucceed(String message){
        WebElement alert = getDriver().findElement(By.cssSelector("div[class='portlet-msg-success']"));
        Assert.assertTrue(alert.getText().toLowerCase().contains(message.toLowerCase()));
	}
	
	
	NewVacationRequestMenuItem withdraw;
	
	@Step
	public void clickOnWithdrawButton(){
		withdraw.clickOnWithdrawButton();
	}
	
	
}
