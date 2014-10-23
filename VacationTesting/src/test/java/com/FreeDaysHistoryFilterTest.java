package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Constants.Constants;

import com.requirements.Application;
import com.steps.FreeDaysHistoryFilterSteps;
import com.steps.FreeDaysHistorySteps;
import com.steps.MyFreeDaysSteps;
@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("/resources/history.csv")
//@RunWith(ThucydidesRunner.class)
public class FreeDaysHistoryFilterTest {
	
	String type, days_number, operation;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
    public Pages pages;

    @Steps
    //public Loginsteps loginstep;
    FreeDaysHistorySteps freeDayHistoryStep;
    @Steps
    MyFreeDaysSteps myFreeDayStep;
    
    @Steps
    FreeDaysHistoryFilterSteps filterStep;

    
    @Test
    public void test(){
    	
    	freeDayHistoryStep.login(Constants.PMuser, Constants.PMpassword);
    	freeDayHistoryStep.clickVacation();
    	freeDayHistoryStep.clickOnFreeDaysHistory();
    	filterStep.selectType(type);
    	filterStep.selectDaysNumber(days_number);
    	filterStep.selectOperation(operation);
    	//freeDayHistoryStep.clickAddedDays();
    	freeDayHistoryStep.clickApply();
    	//freeDayHistoryStep.checkVacationOperationDoesNotContain("Removed");
    	filterStep.verifyOperationFilter(operation);
    	filterStep.verifyTypeFilter(type);
    }
    
    
} 
