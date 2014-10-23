package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewVacationRequestMenuItem;
import com.pages.VacationTrackerMenuItem;

public class VacationTrackSteps extends ScenarioSteps {

	VacationTrackerMenuItem vacationtracker;
	
	
	@Step
	public void clickOnTracker() {
		vacationtracker.clickOnTrackerMenuItem();
		
	}
	
	VacationTrackerMenuItem startdate;
	
	
	@Step
	public void clickToSelectstartDateOfVacation(){
		startdate.clickToSelectStartDateOfVacation();
		
	}
	
	VacationTrackerMenuItem enddate;
	
	@Step
	public void clickToSelectEndDateOfVacation(){
		enddate.clickToSelectEndDateOfVacation();
		
	}
	
	
	
	@Step
	 public void selectStartDate(int month, int day, int year) throws ParseException
	 {
	  vacationtracker.clickToSelectStartDateOfVacation();
  	  vacationtracker.settingDateGivenAsParameter(month, day, year);
	  
	 }

	 public void selectEndDate(int month, int day, int year) throws ParseException 
	 {
	  vacationtracker.clickToSelectEndDateOfVacation();
	  vacationtracker.settingDateGivenAsParameter(month, day, year);

	  
	 }
	
	VacationTrackerMenuItem apply;
	@Step
	public void clickOnApplyButton()
	{
	 apply.clickOnApplyButton();

	}
	
	

	VacationTrackerMenuItem items;
	@Step
	public void itemNrShowingOnAPage(String string){
		items.itemNrShowingOnAPage(string);
	}
	
	VacationTrackerMenuItem ddlLists;
	@Step
	public void findDropdownList(String dropDownListName,String value)
	{
		ddlLists.selectAnItemFromADropDownList(dropDownListName, value);
		
	}
	
	


	
	
	
	
}

