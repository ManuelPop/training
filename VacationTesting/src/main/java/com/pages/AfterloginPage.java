package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class AfterloginPage extends PageObject {

	    @FindBy(linkText="http://192.168.1.68:9090/vacation")
	    private WebElementFacade link;
	  
	    public void Clickonthelink() {
	    	link.click();
	    }
    
}