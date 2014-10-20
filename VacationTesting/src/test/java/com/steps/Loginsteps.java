package com.steps;

import Constants.Constants;


import com.pages.DictionaryPage;
import com.pages.Loginpage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class Loginsteps extends ScenarioSteps {

	Loginpage loginpage;
	
	@Step
    	public void insertUsername(String username) {
			loginpage.enter_username(username);
	}
		
	@Step
	    public void insertPassword(String password) {
			loginpage.enter_password(password);
	}
		
	@Step  
		public void clickSignIn(){
		loginpage.sign_in();
		
    }
	
	@StepGroup
	public void login(String username,String password){
		
		getDriver().get(Constants.baseUrl);
		loginpage.enter_username(Constants.PMuser);
		loginpage.enter_password(Constants.PMpassword);
		loginpage.sign_in();
	}
}