package com.avanade.test.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AMainPage {

	// Locators
	private static final String ACCEPT_COOKIES_BUTTON = "div.optanon-alert-box-button.optanon-button-allow > div > button";

	// Fields
	private WebElement acceptCookiesAvanade;

	public MainPage(WebDriver driver) {
		super(driver);
		this.acceptCookiesAvanade = driver.findElement(By.cssSelector(ACCEPT_COOKIES_BUTTON));
	}

	public WebElement getAcceptCookiesAvanade() {
		return this.acceptCookiesAvanade;
	}

	public void clickRolesAndLocations() {
		getRolesAndLocations().click();
	}

	public void clickedRolesAndLocations() {
		getCareersMenu();
		clickRolesAndLocations();
	}
}