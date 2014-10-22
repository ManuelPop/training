package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewRequestPage;
import com.pages.VacationTrackPages;

public class VacationTrackSteps extends ScenarioSteps {

	VacationTrackPages vacationtracker;
	
	
	@Step
	public void clickOnTracker() {
		vacationtracker.clickOnTracker();
		
	}
	
	VacationTrackPages startdate;
	
	
	@Step
	public void clickOnStartDate(){
		startdate.clickOnStartDate();
		
	}
	
	VacationTrackPages enddate;
	
	@Step
	public void clickOnEndDate(){
		enddate.clickOnEndDate();
		
	}
	
	
	
	@Step
	 public void selectStartDate(int month, int day, int year) throws ParseException
	 {
	  vacationtracker.clickOnStartDate();
  	  vacationtracker.setDate(month, day, year);
	  
	 }

	 public void selectEndDate(int month, int day, int year) throws ParseException 
	 {
	  vacationtracker.clickOnEndDate();
	  vacationtracker.setDate(month, day, year);

	  
	 }
	
	VacationTrackPages apply;
	@Step
	public void clickOnApply()
	{
	 apply.clickOnApply();

	}
	
	
	
	
}

