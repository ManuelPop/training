package com.steps;

import org.junit.Assert;
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
        Assert.assertTrue(message.getText().toLowerCase().contains(titlu.toLowerCase()));
    }
	
	@Step
    public void verifyTitle(String titlu){
        WebElement message = getDriver().findElement(By.cssSelector("div[class='content-title']"));
        Assert.assertFalse(message.getText().toLowerCase().contains(titlu.toLowerCase()));
    }
	
	@Step
	public void findBackButton(String backText){
		WebElement text= getDriver().findElement(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_TabsBack"));
		Assert.assertTrue(text.getText().contains(backText));
	}
	
	@Step
	public void clickBackButton(){
		myfreedays.clickOnBackButton();
	}
	
}