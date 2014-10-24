package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Constants.Constants;

import com.pages.HomePage;
import com.pages.Loginpage;
import com.pages.MyFreeDaysPage;
import com.pages.StateVacationRequestPage;

public class VerifyEmailSteps {
	
	StateVacationRequestPage stateVacationRequestPage;
	
	@Step
    public String createEmailContent(){
        String emailContent ="Dear" + stateVacationRequestPage.getEmployeeName() + ", "
        		+ "<br /><br />You have submitted a new Vacation Request. Your holiday interval is: <strong>"+
        		stateVacationRequestPage.getStartDate()+"</strong> - <strong>"+stateVacationRequestPage.getEndDate()+"</strong>."
        		+ "<br />Please check if the request was approved before going on holiday, if not please contact your vacation approver, "
        		+  stateVacationRequestPage.getAssigneeName()+".<br/> <br/> Cheers, <br /> The EvoPortal Team";
		return emailContent;
    }
	
	

}
