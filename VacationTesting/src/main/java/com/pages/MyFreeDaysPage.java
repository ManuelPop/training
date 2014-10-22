package com.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class MyFreeDaysPage extends PageObject {

	    @FindBy(css= ".main-menu li:nth-child(9) a")
	    private WebElementFacade vacationmenuitem;
	    
	    @FindBy(css=".aui-w25 > div:nth-child(1) li:nth-child(4) a")
	    private WebElementFacade myFreeDaysItem;
	    
	    @FindBy(css="#_evovacation_WAR_EvoVacationportlet_TabsBack")
	    private WebElementFacade backButton;
	    
	    
	    public void clickOnTheVacationMenuItem() {
	    	vacationmenuitem.click();
	    }
	    
	    public void clickOnMyFreeDaysMenuItem(){
	    	myFreeDaysItem.click();
	    }
	    
	    public void clickOnBackButton(){
	    	backButton.click();
	    }
	    
}