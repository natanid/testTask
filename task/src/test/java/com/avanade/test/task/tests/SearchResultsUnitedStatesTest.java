package com.avanade.test.task.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.avanade.test.task.pages.CareersRolesAndLocationsPage;
import com.avanade.test.task.pages.MainPage;
import com.avanade.test.task.pages.SearchResultsPosionPage;

public class SearchResultsUnitedStatesTest {

	@Test
	public void checkUnitedStatesResults() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.avanade.com/");
		driver.manage().window().maximize();

//		 Steps

		MainPage mainPage = new MainPage(driver);
		mainPage.getAcceptCookiesAvanade().click();
		mainPage.clickedRolesAndLocations();
		CareersRolesAndLocationsPage careersRolesAndLocations = new CareersRolesAndLocationsPage(driver);
		careersRolesAndLocations.clickCountryDropdown();
		careersRolesAndLocations.chooseLocationUnitedStates();
		careersRolesAndLocations.inputSearchKeyword();
		careersRolesAndLocations.clickSearchButton();
		careersRolesAndLocations.clickSearshResultsPosition();
		SearchResultsPosionPage positionPage = new SearchResultsPosionPage(driver);
		positionPage.searchTextWithinQualifications();

		driver.quit();
	}
}
