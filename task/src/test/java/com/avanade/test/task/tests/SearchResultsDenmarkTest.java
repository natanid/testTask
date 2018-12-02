package com.avanade.test.task.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.avanade.test.task.pages.CareersRolesAndLocationsPage;
import com.avanade.test.task.pages.MainPage;

public class SearchResultsDenmarkTest {
	
	@Test
	public void checkDenmarkResults() throws Exception {
        //Precondition

		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.avanade.com/");
		driver.manage().window().maximize();
		
		// Steps
		MainPage mainPage = new MainPage(driver);
		mainPage.getAcceptCookiesAvanade().click();
		mainPage.clickedRolesAndLocations();
		CareersRolesAndLocationsPage careersRolesAndLocations = new CareersRolesAndLocationsPage (driver);
		careersRolesAndLocations.clickCountryDropdown();
		careersRolesAndLocations.clickLocationDenmark();
		careersRolesAndLocations.clickSearchButton();
		int numberOfResults = Integer.parseInt(driver.findElement(By.cssSelector("div.search-meta-container > span > span:nth-child(2)")).getText().substring(0,2));
		System.out.println(numberOfResults);
		int expectednumber = 1;
		
		// Check
		Assert.assertTrue(numberOfResults >= expectednumber);

		driver.quit();
	}

}
