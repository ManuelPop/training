package com.steps;

import java.util.List;

import org.junit.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.NewVacationRequestMenuItem;
import com.pages.VacationTrackerMenuItemPage;

public class VacationTrackSteps extends ScenarioSteps {

	VacationTrackerMenuItemPage vacationtracker;
	
	
	@Step
	public void clickOnTracker() {
		vacationtracker.clickOnTrackerMenuItem();
		
	}
	
	
	
	
	@Step
	public void clickToSelectstartDateOfVacation(){
		vacationtracker.clickToSelectStartDateOfVacation();
		
	}
	
	
	
	@Step
	public void clickToSelectEndDateOfVacation(){
		vacationtracker.clickToSelectEndDateOfVacation();
		
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
	
	
	@Step
	public void clickOnApplyButton()
	{
	vacationtracker.clickOnApplyButton();

	}
	
	


	@Step
	public void itemNrShowingOnAPage(String string){
		vacationtracker.itemNrShowingOnAPage(string);
	}
	

	@Step
	public void findDropdownList(String dropDownListName,String value)
	{
		vacationtracker.selectAnItemFromADropDownList(dropDownListName, value);
		
	}
	

	
	@Step
	public void checkIfFilterIsApplied(String otherFilter){
		  List<String> newlist = vacationtracker.verifyStatusFilter();
	
		  for(String i:newlist)
			  
		  { 
			
			  Assert.assertTrue("error!!", otherFilter.contentEquals(i));
		  }

		 }
	
	
	
}

