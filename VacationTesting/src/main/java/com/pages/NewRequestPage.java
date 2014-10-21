package com.pages;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebElement;

import com.google.protobuf.TextFormat.ParseException;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class NewRequestPage extends PageObject 
{
	

	@FindBy(css = "a[href*='new-request']")
	private WebElementFacade newrequest;
	public void clickOnNewRequest() 
	{
		newrequest.click();
	}
	
	
	@FindBy(css = "input[name='startDate']")	
	private WebElementFacade startdate;
	public void clickOnStartDate()
	{
		startdate.click();
		
	}
	
	

	
	@FindBy(css = "input[name='endDate']")
	private WebElementFacade enddate;
	public void clickOnEndDate()
	{
		enddate.click();
		
	}

	
		//Locators for calendar caption,next,previous
					
			 @FindBy(css = "div[style*='block'] td.dp_caption")
			 private WebElementFacade calendarTitle;
					
				
			 @FindBy(css = "div[style*='block'] td.dp_next")
			 private WebElementFacade nextButton;
				
			 @FindBy(css = "div[style*='block'] td.dp_previous")
			 private WebElementFacade previousButton;
		
		
	
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CS']")
	private WebElementFacade specialvacation;
	public void chooseSpV()
	{
		specialvacation.click();
	}
	
	@FindBy(css ="option[value='OTHER']")
	private WebElementFacade othervacation;
	public void chooseOther()
	{
		othervacation.click();
		
	}
	
	@FindBy(css ="div[id='_evovacation_WAR_EvoVacationportlet_newVacationComment']")
	private WebElementFacade addcomment;
	public void addComment()
	{
		addcomment.click();
		
	}
	
	@FindBy(css = "textarea[id='_evovacation_WAR_EvoVacationportlet_commentContent']")
	private WebElementFacade content;
	public void addContent()
	{
		content.click();
	}
	


	public void setDate(int month, int day, int year) throws ParseException {

		Calendar calNew = Calendar.getInstance();
		SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy");
		try {
			calNew.setTime(sdfNew.parse("1/" + String.valueOf(month) + "/"
					+ String.valueOf(year)));
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		
		do {
			element(calendarTitle).waitUntilVisible();
			String MandY = calendarTitle.getText();
			MandY = MandY.replace(",", "");
			SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy dd");
			System.out.println(MandY + " 1");
			try {
				cal.setTime(sdf.parse(MandY + " 1"));
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (cal.compareTo(calNew) == -1) 
			{
				nextButton.click();
			}
			
			if (cal.compareTo(calNew) == 1) 
			{
				previousButton.click();
			}

		    } 
		
		while (cal.compareTo(calNew) != 0);

		List <WebElement> days = getDriver().findElements(By.cssSelector("div[style*='block'] td"));
		
		for (WebElement currentDay : days) {
			if (currentDay.getText().toLowerCase()
					.contains(String.valueOf(day).toLowerCase()))
				currentDay.click();
		}

	}
	}
	

		 
	
	
