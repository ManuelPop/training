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

public class NewVacationRequestMenuItem extends PageObject 
{
	

	@FindBy(css = "a[href*='new-request']")
	private WebElementFacade newrequest;
	public void clickOnNewVacationRequest() 
	{
		newrequest.click();
	}
	
	
	@FindBy(css = "input[name='startDate']")	
	private WebElementFacade startdate;
	public void clickOnStartDateToSelectStartDate()
	{
		startdate.click();
		
	}
	
	

	
	@FindBy(css = "input[name='endDate']")
	private WebElementFacade enddate;
	public void clickOnEndDateToSelectEndDate()
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
	public void chooseSpecialVacationType()
	{
		specialvacation.click();
	}
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CO']")
	private WebElementFacade holiday;
	public void chooseHolidayVacationType()
	{
		holiday.click();
		
	}
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CF']")
	private WebElementFacade unpaid;
	public void chooseVacationWithoutPayment()
	{
		unpaid.click();
		
	}
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CM']")
	private WebElementFacade sick;
	public void chooseSickVacationType()
	{
		sick.click();
		
	}
	
	
	
	@FindBy(css ="option[value='OTHER']")
	private WebElementFacade othervacation;
	public void chooseOtherSpecialVacationType()
	{
		othervacation.click();
		
	}
	
	@FindBy(css ="option[value='MARRIAGE']")
	private WebElementFacade marriagevacation;
	public void chooseMarriageVacationType()
	{
		marriagevacation.click();
		
	}
	
	@FindBy(css ="option[value='CHILD_BIRTH']")
	private WebElementFacade childvacation;
	public void chooseChildBirthVacationType()
	{
		othervacation.click();
		
	}
	
	@FindBy(css ="option[value='FUNERAL']")
	private WebElementFacade funeralvacation;
	public void chooseFuneralVacationType()
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
	public void addContentToCommentBox(String text)
	{
		content.type(text);
		
	}
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade save;
	public void clickOnSaveButton()
	{ 
		save.click();
	
	}
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_cancelButton")
	private WebElementFacade cancel;
	public void clickOnCancel()
	{ 
		cancel.click();
	
	}
	
	@FindBy(css = "a[href='/c/portal/logout']")
	private WebElementFacade logout;
	public void logOut()
	{
		logout.click();
	}
	
	
	@FindBy(css= "input[id='_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest']" )
	private WebElementFacade withdraw;
	public void clickOnWithdrawButton()
	{
		withdraw.click();
		
	}
	

	public void settingDateByGivenParameter(int month, int day, int year) throws ParseException {

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




		 
	
	
