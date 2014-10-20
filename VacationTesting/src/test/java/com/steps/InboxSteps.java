package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import Constants.Constants;

import com.pages.HomePage;
import com.pages.Loginpage;
import com.pages.VacationMenuPage;

public class InboxSteps extends ScenarioSteps {

	Loginpage loginpage;
	HomePage homepage;
	VacationMenuPage inbox;
	
	
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
		loginpage.enter_username(username);
		loginpage.enter_password(password);
		loginpage.sign_in();
				
	}
	
	@Step
	 public void clickVacation(){
		 
		 getDriver().get("http://192.168.1.68:9090/home");
		 homepage.clickOnTheVacationMenuItem();
	 }
	
	@Step
	public void clickInbox(){
		
		getDriver().get("http://192.168.1.68:9090/vacation");
		inbox.clickOnTheInboxMenu();
	}
		
	@Step
	public void clickFirstRequest(){
		inbox.openFirstRequest();
		
	}
	
	@Step
	public void clickApproveButton(){
		inbox.ApproveButton();
		
	}
	
	@Step
	public void verifyText(String txt){
		inbox.verifyText(txt);		
	
		
	}
		
		
}