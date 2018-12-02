package com.avanade.test.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class AMainPage {

	protected WebDriver driver;
	Actions action;
	private WebElement careersMenu;
	private WebElement rolesAndLocations;

	protected AMainPage(WebDriver driver) {
		this.driver = driver;
		this.careersMenu = driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul[1]/li[5]/a[1]"));
		this.rolesAndLocations = driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul[1]/li[5]/ul/li[2]/a"));
		action = new Actions(driver);
	}

	public void getCareersMenu() {
		action.moveToElement(careersMenu).perform();
	}

	public WebElement getRolesAndLocations() {
		return this.rolesAndLocations;
	}

}