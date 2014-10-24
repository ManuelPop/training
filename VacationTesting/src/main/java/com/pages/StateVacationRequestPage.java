package com.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")	

public class StateVacationRequestPage {

@FindBy(css="div[class='align-to-left vacation-icon approver-icon'] b")
private WebElementFacade assigneeName;

@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > b")
private WebElementFacade createdOn;

@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(3) > b:nth-child(1)")
private WebElementFacade employeeName;

@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(4) > b:nth-child(1)")
private WebElementFacade startDate;

@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(4) > b:nth-child(3)")
private WebElementFacade endDate;


public void getAssigneeName(){
	assigneeName.getText();
}

public void getDateCreatedON(){
	createdOn.getText();
}

public void getEmployeeName(){
	employeeName.getText();
}
	
public void getStartDate(){
	startDate.getText();
}

public void getEndDate(){
	endDate.getText();	
}



}
