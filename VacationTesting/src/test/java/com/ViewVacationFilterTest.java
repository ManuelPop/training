package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Constants.Constants;

import com.requirements.Application;
import com.steps.InboxSteps;
import com.steps.Loginsteps;
@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class ViewVacationFilterTest {


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
    	viewVacationStep.selectVacationType("holiday");
    	viewVacationStep.selectDaysNumber("1 - 5");
    	viewVacationStep.selectVacationStatus("Approved");
    	//viewVacationStep.clickViewVacationHoliday();
    	//viewVacationStep.clickViewVacationFifthCheckBox();
    	//viewVacationStep.clickViewVacationApprovedCheckBox();
    	//viewVacationStep.clickViewVacationApplyButton();
    	//viewVacationStep.verifyResults();
    	
    }
    
    
    
    
} 
