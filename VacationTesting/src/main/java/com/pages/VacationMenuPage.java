package com.pages;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Constants.StringUtils;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://192.168.1.68:9090/home")
public class VacationMenuPage extends PageObject {

	@FindBy(css = "a[href*='inbox']")
	private WebElementFacade inboxMenu;

	public void clickOnTheInboxMenu() {
		inboxMenu.click();
	}

	@FindBy(css = "table[class='taglib-search-iterator'] tbody tr:nth-child(3) td:nth-child(2) a")
	private WebElementFacade firstRequest;

	public void openFirstRequest() {
		firstRequest.click();

	}

	@FindBy(css = "input[value='Approve']")
	private WebElementFacade approveButton;

	public void ApproveButton() {
		approveButton.click();

	}

	@FindBy(css = "div[class='portlet-msg-success']")
	private WebElementFacade text;

	public void verifyText(String txt) {

		WebElement message = getDriver().findElement(
				By.cssSelector("div[class='portlet-msg-success']"));
		Assert.assertTrue("Message was not found", message.getText()
				.toLowerCase().contains(txt.toLowerCase()));
	}

	@FindBy(css = "input[value='Reject']")
	private WebElementFacade rejectButton;

	public void rejectButton() {
		rejectButton.click();

	}

	@FindBy(css = "a[href*='view-vacations']")
	public WebElementFacade viewVacationMenu;

	public void clickViewVacationMenu() {
		viewVacationMenu.click();

	}

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	public WebElementFacade viewVacationHoliday;

	public void clickViewVacationHolydai() {
		viewVacationHoliday.click();

	}

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	public WebElementFacade viewVacationFifthCheckBox;

	public void clickViewVacationFifthCheckBox() {
		viewVacationFifthCheckBox.click();

	}

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	public WebElementFacade viewVacationApprovedCheckBox;

	public void clickViewVacationApprovedCheckBox() {
		viewVacationApprovedCheckBox.click();

	}

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton ,[value='apply']")
	public WebElementFacade viewVacationApplyButton;

	public void clickViewVacationApplyButton() {
		viewVacationApplyButton.click();

	}

	@FindBy(css = "table[class='taglib-search-iterator'] tr td:nth-child(7)")
	private List<WebElement> daysNumberRow;

	@FindBy(css = "span[class='aui-paginator-current-page-report aui-paginator-total']")
	private WebElement pagesContainer;


	public void verifyDaysNumberResults(String daysNumber) {

		
		List<Integer> numberOfPagesList = StringUtils
				.getAllIntegerNumbersFromString(pagesContainer.getText());
		int noOfPages = numberOfPagesList.get(1);
		System.out.println("Pages number: " + noOfPages);
		waitABit(2000);

		for (int i = 0; i < noOfPages; i++) {
			waitABit(2000);
			List<WebElement> items = getDriver()
					.findElements(
							By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(7)"));
			waitABit(2000);
			System.out.println("Items size: " + items.size());
			items.remove(0);
			System.out.println("Items size: " + items.size());
			for (WebElement item : items) {
				System.out.println(item.getText());
				$(item).waitUntilVisible();
				String stringParts[] = daysNumber.trim().split("-");
				String lowerValue = stringParts[0];
				String higherValue = stringParts[1];
				System.out.println(stringParts.length +"this is the trim string");
//				System.out.println(higherValue.valueOf(stringParts));
				
				Assert.assertTrue(
						"hopahopa",
						Integer.parseInt(item.getText()) >= Integer.parseInt(lowerValue.trim()) 
								&& Integer.parseInt(item.getText()) <= Integer.parseInt(higherValue.trim()));
				System.out.println("after assert");

			}

			if (i < noOfPages - 1) {
				WebElement nextButton= getDriver().findElement(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorTop > div.search-pages > div.page-links > a.aui-paginator-link.aui-paginator-next-link"));
				nextButton.click();

			}
			 
		}

	}
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorTop > div.search-pages > div.page-links > div > span > a:nth-child(1)")
	public WebElement goToFirstPage;
	public void goToFirstPageButton(){
	 goToFirstPage.click();
	}
	
	public void verifyVacationTypeResult(String vacationType) {
		waitABit(2000);
		//WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		
		List<Integer> numberOfPagesList = StringUtils
				.getAllIntegerNumbersFromString(pagesContainer.getText());
		int noOfPages = numberOfPagesList.get(1);
		System.out.println("Pages number: " + noOfPages);
		waitABit(2000);

		for (int i = 0; i < noOfPages; i++) {
			waitABit(2000);
			List<WebElement> items = getDriver()
					.findElements(
							By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(8)"));
			waitABit(2000);
			System.out.println("Items size: " + items.size());
			items.remove(0);
			System.out.println("Items size: " + items.size());
			for (WebElement item : items) {
				System.out.println(item.getText());
				$(item).waitUntilVisible();
				Assert.assertTrue(
						"hopahopa",item.getText().toLowerCase().equals(vacationType.toLowerCase()));
						

			}

			if (i < noOfPages - 1) {
				WebElement nextButton= getDriver().findElement(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorTop > div.search-pages > div.page-links > a.aui-paginator-link.aui-paginator-next-link"));
				nextButton.click();

			}
			
		}

	}
	
	public void verifyVacationStatus(String vacationStatus) {
		waitABit(2000);
		//WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		
		List<Integer> numberOfPagesList = StringUtils
				.getAllIntegerNumbersFromString(pagesContainer.getText());
		int noOfPages = numberOfPagesList.get(1);
		System.out.println("Pages number: " + noOfPages);
		waitABit(2000);

		for (int i = 0; i < noOfPages; i++) {
			waitABit(2000);
			List<WebElement> items = getDriver()
					.findElements(
							By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(9)"));
			waitABit(2000);
			System.out.println("Items size: " + items.size());
			items.remove(0);
			System.out.println("Items size: " + items.size());
			for (WebElement item : items) {
				System.out.println(item.getText());
				$(item).waitUntilVisible();
				Assert.assertTrue(
						"hopahopa",item.getText().toLowerCase().equals(vacationStatus.toLowerCase()));
						

			}

			if (i < noOfPages - 1) {
				WebElement nextButton= getDriver().findElement(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorTop > div.search-pages > div.page-links > a.aui-paginator-link.aui-paginator-next-link"));
				nextButton.click();

			}
			
		}

	}



	public void selectVacationType(String vacationType) {
		boolean found = false;
		List<WebElement> elements = getDriver()
				.findElements(
						By.cssSelector(".aui-column-content.aui-column-content-first.column-three-content > .column-content >.aui-field.aui-field-choice >.aui-field-content label"));
			System.out.println(elements.size());
		for (WebElement element : elements) {
			System.out.println(element.getText());

			if (element.getText().toLowerCase()
					.contains(vacationType.toLowerCase())) {
				found = true;
				if (!element.isSelected())
					element.click();
				break;
			}

		}
		Assert.assertTrue("Vacation type was not found!", found);

	}

	

	public void selectDaysNumber(String daysNumber) {
		boolean found = false;
		List<WebElement> elements = getDriver()
				.findElements(
						By.cssSelector("div[class='aui-column-content column-three-content column-center-content '] div[class='column-content'] span[class='aui-field aui-field-choice']"));
		for (WebElement element : elements) {
			System.out.println(element.getText());

			if (element.getText().toLowerCase()
					.contains(daysNumber.toLowerCase())) {
				found = true;
				if (!element.findElement(By.cssSelector(" label")).isSelected())
					element.findElement(By.cssSelector(" label")).click();
				break;
			}

		}
		Assert.assertTrue("Days number was not found!", found);
	}

	@FindBy(css = "div[class='aui-column-content aui-column-content-last column-three-content column-center-content '] div[class='column-content'] span[class='aui-field-content']")
	private List<WebElement> vacationStatus1;

	public void selectVacationStatus(String vacationStatus) {

		boolean found = false;
		List<WebElement> elements = vacationStatus1;
		for (WebElement element : elements) {
			System.out.println(element.getText());
			if (element.getText().toLowerCase()
					.contains(vacationStatus.toLowerCase())) {
				found = true;
				if (!element.findElement(By.cssSelector(" label")).isSelected())
					element.findElement(By.cssSelector(" label")).click();
				break;
			}

		}
		Assert.assertTrue("Vacation Status was not found!", found);
	}

}