package com.pages;


import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

	
public class FreeDaysHistoryPage extends PageObject {

	    @FindBy(css= "#_evovacation_WAR_EvoVacationportlet_COCheckbox")
	    private WebElementFacade vacationDaysCheckBox;
	    
	    @FindBy(css="li.inactive-menu:nth-child(5) a")
	    private WebElementFacade freeDaysHistoryMenuItem;
	    
	    @FindBy(css= ".main-menu li:nth-child(9) a")
	    private WebElementFacade vacationmenuitem;
	    
	    @FindBy(css="#_evovacation_WAR_EvoVacationportlet_applyButton")
	    private WebElementFacade applyButton;
	    
	    @FindBy(css="#_evovacation_WAR_EvoVacationportlet_ADDED_DAYSCheckbox")
	    private WebElementFacade addedDaysCheckbox;
	    
	    public void checkVacationDaysCheckbox(){
	    	vacationDaysCheckBox.click();
	    }
	    
	    public void checkAddedDaysCheckbox(){
	    	addedDaysCheckbox.click();
	    }
	    
	    public void clickOnFreeDaysHistory(){
	    	freeDaysHistoryMenuItem.click();
	    }
	    
	    public void clickOnTheVacationMenuItem() {
	    	vacationmenuitem.click();
	    }
	    
	    public void clickOnApplyButton(){
	    	applyButton.click();
	    }
	    
	    public List<String> returnVacationOperationList(){
	    	  List<WebElement> vacationOperationList = getDriver().findElements(By.cssSelector("td[class*='header.operation']"));
	    	  List<String> vacationOperationStrList = new ArrayList<String>();
	    	  for (WebElement i : vacationOperationList){
	    	   vacationOperationStrList.add(i.getText());
	    	  }
	    	  return vacationOperationStrList;
	    }
}