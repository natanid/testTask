package com.avanade.test.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CareersRolesAndLocationsPage extends AMainPage {

	private WebElement countryDropdown;
	private WebElement locationCanada;
	private WebElement locationDenmark;
	private WebElement locationUnitedStates;
	private WebElement searchButton;
	private WebElement searchBox;

	// Search keyword

	public static final String SEARCH_TEXT = "Chicago QA Test Automation";

	// Locators

	private static final String COUNTRY_DROP_DOWN = "#countries";
	private static final String LOCATION_DROPDOWN_CANADA = "56489b71-065c-4efa-b39a-c36a820b2b45";
	private static final String LOCATION_DROPDOWN_DENMARK = "f8deda46-547e-4ff7-b336-1ea99907d2b2";
	private static final String LOCATION_DROPDOWN_UNITED_STATES = "f0d730e9-ef62-4e15-b31e-4639fc8c45a7";
	private static final String SEARCH_BUTTON = "#jobsearchclick";
	private static final String SEARCH_BOX = "searchboxfilter";

	public CareersRolesAndLocationsPage(WebDriver driver) {
		super(driver);
		this.countryDropdown = driver.findElement(By.cssSelector(COUNTRY_DROP_DOWN));
		this.locationCanada = driver.findElement(By.id(LOCATION_DROPDOWN_CANADA));
		this.locationDenmark = driver.findElement(By.id(LOCATION_DROPDOWN_DENMARK));
		this.locationUnitedStates = driver.findElement(By.id(LOCATION_DROPDOWN_UNITED_STATES));
		this.searchButton = driver.findElement(By.cssSelector(SEARCH_BUTTON));
		this.searchBox = driver.findElement(By.id(SEARCH_BOX));
	}

	public WebElement getCountryDropdown() {
		return this.countryDropdown;
	}

	public WebElement getLocationCanada() {
		return this.locationCanada;
	}

	public WebElement getLocationDenmark() {
		return this.locationDenmark;
	}

	public WebElement getLocationUnitedStates() {
		return this.locationUnitedStates;
	}

	public WebElement getSearchButton() {
		return this.searchButton;
	}

	public WebElement getSearchBox() {
		return this.searchBox;
	}

	// click
	public void clickCountryDropdown() {
		getCountryDropdown().click();
	}

	public void clickLocationCanada() {
		getLocationCanada().click();
	}

	public void clickLocationDenmark() {
		getLocationDenmark().click();
	}

	public void chooseLocationUnitedStates() {
		getLocationUnitedStates().click();
	}

	public void clickSearchButton() {
		getSearchButton().click();
	}

	public void inputSearchKeyword() {
		getSearchBox().clear();
		getSearchBox().sendKeys(SEARCH_TEXT);
	}

	public void clickSearshResultsPosition() {
		driver.findElement(By.cssSelector("tr:nth-child(1) > td.job-title > a.ng-scope.ng-binding")).click();

	}

}
