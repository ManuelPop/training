package com.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewVacationRequestMenuItemPage;


public class newrequestSteps extends ScenarioSteps {

	NewVacationRequestMenuItemPage newrequest;

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
	NewVacationRequestMenuItemPage specialvacation;
	
	@Step
	public void chooseSpecialVacationType(){
		specialvacation.chooseSpecialVacationType();
		
	}
	NewVacationRequestMenuItemPage othervacation;
	
	@Step
	public void chooseOtherSpecialVacationType() {
		othervacation.chooseOtherSpecialVacationType();
		
	}
	NewVacationRequestMenuItemPage marriagevacation;
	
	@Step
	public void chooseMarriageVacationType() {
		marriagevacation.chooseMarriageVacationType();
		
	}
	NewVacationRequestMenuItemPage childvacation;
	
	@Step
	public void chooseChildBirthVacationType() {
		childvacation.chooseChildBirthVacationType();
		
	}
	NewVacationRequestMenuItemPage funeralvacation;
	
	@Step
	public void chooseFuneralVacationType() {
		funeralvacation.chooseFuneralVacationType();
		
	}
	
	
	
	NewVacationRequestMenuItemPage holiday;
	
	@Step
	public void chooseHolidayVacationType() {
		holiday.chooseHolidayVacationType();		
	}
	
	
	NewVacationRequestMenuItemPage unpaid;
	
	@Step
	public void chooseVacationWithoutPaymentType() {
		unpaid.chooseVacationWithoutPayment();
		
	}
	
	
	NewVacationRequestMenuItemPage sick;
	
	@Step
	public void chooseSickLeaveVacationType() {
		sick.chooseSickVacationType();
		
	}
	
	
	
	
	
	NewVacationRequestMenuItemPage addcomment;
	
	@Step
	public void addComment() {
		addcomment.addComment();
		
	}
	
	NewVacationRequestMenuItemPage content;
	
	@Step
	public void addContentToComment(String text) {
		content.addContentToCommentBox(text);
		
	}
	
	NewVacationRequestMenuItemPage save;
	
	@Step
	public void clickOnSaveButton() {
		save.clickOnSaveButton();
		
	}
	
	NewVacationRequestMenuItemPage cancel;
	
	@Step
	public void clickOnCancelButton() {
		cancel.clickOnCancel();
		
	}

	NewVacationRequestMenuItemPage logout;
	
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
	
	
	NewVacationRequestMenuItemPage withdraw;
	
	@Step
	public void clickOnWithdrawButton(){
		withdraw.clickOnWithdrawButton();
	}
	
	
}
