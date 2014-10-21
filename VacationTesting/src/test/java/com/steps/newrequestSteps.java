package com.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewRequestPage;


public class newrequestSteps extends ScenarioSteps {

	NewRequestPage newrequest;

	@Step
	public void clickOnNewRequest() {

		newrequest.clickOnNewRequest();

	}
	
	
	@Step
	 public void selectStartDate(int month, int day, int year) throws ParseException
	 {
	  newrequest.clickOnStartDate();
	  try {
		newrequest.setDate(month, day, year);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 }

	 public void selectEndDate(int month, int day, int year) throws ParseException {
	  newrequest.clickOnEndDate();
	  try {
		newrequest.setDate(month, day, year);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 }
	
	

	//Special Vacation type
	NewRequestPage specialvacation;
	
	@Step
	public void chooseSpV(){
		specialvacation.chooseSpV();
		
	}
	NewRequestPage othervacation;
	
	@Step
	public void chooseOther() {
		othervacation.chooseOther();
		
	}
	NewRequestPage marriagevacation;
	
	@Step
	public void chooseMarriage() {
		marriagevacation.chooseMarriage();
		
	}
	NewRequestPage childvacation;
	
	@Step
	public void chooseChild() {
		childvacation.chooseChild();
		
	}
	NewRequestPage funeralvacation;
	
	@Step
	public void chooseFuneral() {
		funeralvacation.chooseFuneral();
		
	}
	
	
	
	NewRequestPage holiday;
	
	@Step
	public void chooseHoliday() {
		holiday.chooseHoliday();
		
	}
	
	
	NewRequestPage unpaid;
	
	@Step
	public void chooseUnpaid() {
		unpaid.chooseUnpaid();
		
	}
	
	
	NewRequestPage sick;
	
	@Step
	public void chooseSick() {
		sick.chooseSick();
		
	}
	
	
	
	
	
	NewRequestPage addcomment;
	
	@Step
	public void addComment() {
		addcomment.addComment();
		
	}
	
	NewRequestPage content;
	
	@Step
	public void addContent(String text) {
		content.addContent(text);
		
	}
	
	NewRequestPage save;
	
	@Step
	public void clickOnSave() {
		save.clickOnSave();
		
	}
	
	NewRequestPage cancel;
	
	@Step
	public void clickOnCancel() {
		cancel.clickOnCancel();
		
	}

	NewRequestPage logout;
	
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
	
	
	NewRequestPage withdraw;
	
	@Step
	public void clickWithDraw(){
		withdraw.clickWithDraw();
	}
	
	
}
