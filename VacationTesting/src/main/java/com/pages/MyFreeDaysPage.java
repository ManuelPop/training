package com.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import Constants.Constants;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class MyFreeDaysPage extends PageObject {

	    @FindBy(css= ".main-menu li:nth-child(9) a")
	    private WebElementFacade vacationmenuitem;
	    
	    @FindBy(css=".aui-w25 > div:nth-child(1) li:nth-child(4) a")
	    private WebElementFacade myFreeDaysItem;
	    
	    
	    public void clickOnTheVacationMenuItem() {
	    	vacationmenuitem.click();
	    }
	    
	    public void clickOnMyFreeDaysMenuItem(){
	    	myFreeDaysItem.click();
	    }
	    
}