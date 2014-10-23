package com.pages;


import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.junit.Assert;
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
	    
	    public List<String> returnVacationTypeList(){
	    	  List<WebElement> vacationTypeList = getDriver().findElements(By.cssSelector("td[class*='header.type']"));
	    	  List<String> vacationTypeStrList = new ArrayList<String>();
	    	  for (WebElement i : vacationTypeList){
	    	   vacationTypeStrList.add(i.getText());
	    	  }
	    	  return vacationTypeStrList;
	    }
	    
	    public List<String> returnVacationDaysNumberList(){
	    	  List<WebElement> vacationDaysNumberList = getDriver().findElements(By.cssSelector("td[class*='header.number']"));
	    	  List<String> vacationDaysNumberStrList = new ArrayList<String>();
	    	  for (WebElement i : vacationDaysNumberList){
	    	   vacationDaysNumberStrList.add(i.getText());
	    	  }
	    	  return vacationDaysNumberStrList;
	    }
	    
	    public void selectType(String type) {
			boolean found = false;
			List<WebElement> elements = getDriver()
					.findElements(
							By.cssSelector("div[class='aui-column column-three aui-column-first '] div div[class='column-content'] label"));
			for (WebElement element : elements) {
				System.out.println(element.getText());

				if (element.getText().replaceAll("\\s","").toLowerCase()
						.equals(type.replaceAll("\\s","").toLowerCase())) {
					found = true;
					if (!element.isSelected())
						element.click();
					break;
				}

			}
			Assert.assertTrue("Days number was not found!", found);
		}
	    
	    public void selectDaysNumber(String daysNumber) {
			boolean found = false;
			List<WebElement> elements = getDriver()
					.findElements(
							By.cssSelector("div[class='aui-column column-three '] div div[class='column-content'] label"));
			for (WebElement element : elements) {
				System.out.println(element.getText());

				if (element.getText().replaceAll("\\s","").toLowerCase()
						.equals(daysNumber.replaceAll("\\s","").toLowerCase())) {
					found = true;
					if (!element.isSelected())
						element.click();
					break;
				}

			}
			Assert.assertTrue("Days number was not found!", found);
		}
	    
	    public void selectOperation(String operation) {
			boolean found = false;
			List<WebElement> elements = getDriver()
					.findElements(
							By.cssSelector("div[class='aui-column column-three aui-column-last'] div div[class='column-content'] label"));
			for (WebElement element : elements) {
				System.out.println(element.getText());

				if (element.getText().replaceAll("\\s","").toLowerCase()
						.equals(operation.replaceAll("\\s","").toLowerCase())) {
					found = true;
					if (!element.isSelected())
						element.click();
					break;
				}

			}
			Assert.assertTrue("Days number was not found!", found);
		}
}