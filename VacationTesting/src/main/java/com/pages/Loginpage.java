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

@DefaultUrl("http://192.168.1.68:9090/login")
public class Loginpage extends PageObject {


    @FindBy(name="_58_login")
    private WebElementFacade name;

    @FindBy(name="_58_password")
    private WebElementFacade pass;
    
    @FindBy(css="input[type=submit]")
    private WebElementFacade SignButton;

    public void enter_username(String username) {
    	name.type(username);
    }
    public void enter_password(String password) {
    	pass.type(password);
    }

      
    public void sign_in() {
    	SignButton.click();
    }
}