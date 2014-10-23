package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Constants.Constants;

import com.requirements.Application;
import com.steps.InboxSteps;
import com.steps.Loginsteps;
@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("/resources/ViewVacationFilterCryteria.csv")
public class ViewVacationFilterTest {
public String vacationType,	daysNumber,	vacationStatus;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://192.168.1.68:9090/home")
    public Pages pages;

    @Steps
    public Loginsteps loginstep;
    
    @Steps
    public InboxSteps viewVacationStep;

    
    @Test
    public void test(){
    	
    	loginstep.login(Constants.DMuser, Constants.DMpassword);
    	loginstep.clickVacation();
    	viewVacationStep.clickViewVacation();
    	viewVacationStep.selectVacationType(vacationType);
    	viewVacationStep.selectDaysNumber(daysNumber);
    	viewVacationStep.selectVacationStatus(vacationStatus);
    	//viewVacationStep.clickViewVacationHoliday();
    	//viewVacationStep.clickViewVacationFifthCheckBox();
    	//viewVacationStep.clickViewVacationApprovedCheckBox();
    	
    	viewVacationStep.clickViewVacationApplyButton();
    	viewVacationStep.verifyDaysNumberResults(daysNumber);
    	viewVacationStep.goToFirstPageButton();
    	viewVacationStep.verifyVacationTypeResult(vacationType);
    	viewVacationStep.goToFirstPageButton();
    	viewVacationStep.verifyVacationStatus(vacationStatus);
    	
    }
    
    
    
    
} 
