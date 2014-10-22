package com.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import Constants.Constants;

import com.pages.FreeDaysHistoryPage;
import com.pages.Loginpage;

public class FreeDaysHistorySteps extends ScenarioSteps {

	FreeDaysHistoryPage freeDaysHistory;
	Loginpage loginpage;
	
	@StepGroup
	public void login(String username,String password){
		
		getDriver().get(Constants.baseUrl);
		loginpage.enter_username(username);
		loginpage.enter_password(password);
		loginpage.sign_in();
				
	}
	
	@Step
	 public void clickVacation(){		 
		 //getDriver().get("http://192.168.1.68:9090/home");
		 freeDaysHistory.clickOnTheVacationMenuItem();
	 }
	
	@Step
	public void clickOnFreeDaysHistory(){
		freeDaysHistory.clickOnFreeDaysHistory();
	}
	
	@Step
	public void clickVacationDays(){
		freeDaysHistory.checkVacationDaysCheckbox();
	}
	
	@Step
	public void clickAddedDays(){
		freeDaysHistory.checkAddedDaysCheckbox();
	}
	
	@Step
	public void clickApply(){
		freeDaysHistory.clickOnApplyButton();
	}
	
	@Step
	 public void checkVacationOperationDoesNotContain(String vacationOperationNotWanted){
	  List<String> vacationOperationList = freeDaysHistory.returnVacationOperationList();
	  Assert.assertFalse("Vacation type contains element that should not be there after filter!!!", vacationOperationList.contains(vacationOperationNotWanted));
	 }
}