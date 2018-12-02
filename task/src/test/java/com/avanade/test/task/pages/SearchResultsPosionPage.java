package com.avanade.test.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPosionPage {

	public WebDriver driver;

	// Expected text
	public static final String QULIFICATIONS_SECTION_SEARCHING_TEXT = "Agile";
	public static final String LOCATIONS_CHICAGO_TEXT = "Locations: Chicago";

	// Locators
	private static final String LOCATIONS_CHICAGO_ELEMENT = "div.main-content.job-details > div:nth-child(3) > p";
	private static final String QULIFICATIONS_SECTION_TEXT = "div.job-description.ng-scope.ng-binding.less > ul:nth-child(13)";

	public SearchResultsPosionPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLocationsChicagoElement() {

		return driver.findElement(By.cssSelector(LOCATIONS_CHICAGO_ELEMENT));
	}

	public WebElement getQulificationsSectionAllText() {

		return driver.findElement(By.cssSelector(QULIFICATIONS_SECTION_TEXT));
	}

	public void searchTextWithinQualifications() {
		if (getLocationsChicagoElement().getText().contains(LOCATIONS_CHICAGO_TEXT)) {
			getQulificationsSectionAllText().getText().contains(QULIFICATIONS_SECTION_SEARCHING_TEXT);
		} else {
			System.out.println("No 'Agile' text in Qualifications section");
		}
	}

}