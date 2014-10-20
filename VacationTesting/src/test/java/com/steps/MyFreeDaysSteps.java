package com.steps;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;
import Constants.Constants;

import com.pages.HomePage;
import com.pages.Loginpage;
import com.pages.MyFreeDaysPage;

public class MyFreeDaysSteps extends ScenarioSteps {

	Loginpage loginpage;
	HomePage homepage;
	MyFreeDaysPage myfreedays;
	
	
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
	public void clickMyFreeDays(){
		getDriver().get("http://192.168.1.68:9090/vacation");
		myfreedays.clickOnMyFreeDaysMenuItem();
	}
	
	@Step
    public void verifyMyFreeDaysTitle(String titlu){
        WebElement message = getDriver().findElement(By.cssSelector("div[class='content-title']"));
        Assert.assertTrue("Test failed! The title was not found!",
        message.getText().toLowerCase().contains(titlu.toLowerCase()));
    }
	
	
}