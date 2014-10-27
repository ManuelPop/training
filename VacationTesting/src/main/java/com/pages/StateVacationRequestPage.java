package com.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
public class StateVacationRequestPage {

	@FindBy(css = "div[class='align-to-left vacation-icon approver-icon'] b")
	private WebElementFacade assigneeName;

	@FindBy(css = "#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > b")
	private WebElementFacade createdOn;

	@FindBy(css = "#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(3) > b:nth-child(1)")
	private WebElementFacade employeeName;

	@FindBy(css = "#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(4) > b:nth-child(1)")
	private WebElementFacade startDate;

	@FindBy(css = "#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(4) > b:nth-child(3)")
	private WebElementFacade endDate;

	public String getAssigneeName() {
		String assignee = assigneeName.getText().toLowerCase();
		return assignee;
	}

	public String getDateCreatedON() {
		String dateCreate = createdOn.getText();

		return dateCreate;
	}

	public String getEmployeeName() {
		String name = employeeName.getText().toLowerCase();
		return name;
	}

	public String getStartDate() {
		String startD = startDate.getText();
		return startD;
	}

	public String getEndDate() {
		String endD = endDate.getText();
		return endD;
	}

	public String createEmailContent() {
		String emailContent = "Dear"
				+ getEmployeeName()
				+ ", "
				+ "<br /><br />You have submitted a new Vacation Request. Your holiday interval is: <strong>"
				+ getStartDate()
				+ "</strong> - <strong>"
				+ getEndDate()
				+ "</strong>."
				+ "<br />Please check if the request was approved before going on holiday, if not please contact your vacation approver, "
				+ getAssigneeName()
				+ ".<br/> <br/> Cheers, <br /> The EvoPortal Team";
		return emailContent;
	}

}
