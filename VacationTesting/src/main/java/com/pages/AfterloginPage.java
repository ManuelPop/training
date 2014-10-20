package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://192.168.1.68:9090/home")
	
public class AfterloginPage extends PageObject {

	    @FindBy(linkText="http://192.168.1.68:9090/vacation")
	    private WebElementFacade link;
	  
	    public void Clickonthelink() {
	    	link.click();
	    }
    
}