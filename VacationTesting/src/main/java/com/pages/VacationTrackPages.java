package com.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.google.protobuf.TextFormat.ParseException;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class VacationTrackPages extends PageObject {

	@FindBy(css = "a[href*='vacation-tracker']")
	private WebElementFacade vacationtracker;
	public void clickOnTracker() 
	{
	vacationtracker.click();
	}
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_trackerStartDate']")
	private WebElementFacade startdate;
	public void clickOnStartDate()
	{
		startdate.click();
		
	}
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_trackerEndDate']")
	private WebElementFacade enddate;
	public void clickOnEndDate()
	{
		enddate.click();
		
	}
	
	 @FindBy(css = "div[style*='block'] td.dp_caption")
	 private WebElementFacade calendarTitle;
			
		
	 @FindBy(css = "div[style*='block'] td.dp_next")
	 private WebElementFacade nextButton;
		
	 @FindBy(css = "div[style*='block'] td.dp_previous")
	 private WebElementFacade previousButton;
	
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
						.contentEquals(String.valueOf(day).toLowerCase()))
					currentDay.click();
			}

		}
	 
	 
	 
	 @FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_applyButton']")
	 private WebElementFacade apply;
	 public void clickOnApply(){
		 apply.click();
	 }
	 
}
