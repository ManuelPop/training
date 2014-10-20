package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class HomePage extends PageObject {

	    @FindBy(css= ".main-menu li:nth-child(9) a")
	    private WebElementFacade vacationmenuitem;
	  
	    public void clickOnTheVacationMenuItem() {
	    	vacationmenuitem.click();
	    }
    
}