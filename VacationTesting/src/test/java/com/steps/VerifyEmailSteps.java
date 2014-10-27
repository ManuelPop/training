package com.steps;

import java.io.IOException;

import javax.mail.MessagingException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.AccesingEmailPage;
import com.pages.NewVacationRequestMenuItemPage;


public class VerifyEmailSteps extends ScenarioSteps {

	 AccesingEmailPage  accesingEmailPage;
	
	 @Step
	public void verifyEmail(String emailLink, String emailAddress,String password) throws MessagingException, IOException{
		accesingEmailPage.readEmail(emailLink, emailAddress, password);
	}
	
}

	
	
	

	

	



