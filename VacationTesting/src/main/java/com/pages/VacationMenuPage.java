package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class VacationMenuPage extends PageObject {

	    @FindBy(css= "a[href*='inbox']")
	    private WebElementFacade inboxMenu;
	  
	    public void clickOnTheInboxMenu() {
	    	inboxMenu.click();
	    }
	    
	    @FindBy(css="table[class='taglib-search-iterator'] tbody tr:nth-child(3) td:nth-child(2) a")
	    private WebElementFacade firstRequest;
	    
	    public void openFirstRequest(){
	    	firstRequest.click();
	    	
	    }
	    
	    @FindBy(css="input[value='Approve']")
	    private WebElementFacade approveButton;
	    
	    public void ApproveButton(){
	    	approveButton.click();
	    	
	    }
	    
	    @FindBy(css="div[class='portlet-msg-success']")
	    private WebElementFacade text;
	    
	    public void verifyText(String txt){
	    		    	
	    	 WebElement message = getDriver().findElement(By.cssSelector("div[class='portlet-msg-success']"));
	    	   Assert.assertTrue("Message was not found",
	    	     message.getText().toLowerCase().contains(txt.toLowerCase()));
	    }
	    
	    @FindBy(css="input[value='Reject']")
	    private WebElementFacade rejectButton;
	    
	    public void rejectButton(){
	    	rejectButton.click();
	    	
	    }
	    
    
}