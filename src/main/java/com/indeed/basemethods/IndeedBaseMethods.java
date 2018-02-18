package com.indeed.basemethods;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Base Methods test Indeed Web Portal 
 */

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class IndeedBaseMethods implements IndeedSearchPageConstants {

	public static WebDriver driver;
	private JavascriptExecutor indeedJavaScriptExeceutor;

	@BeforeSuite
	public boolean openIndeedURL() throws InterruptedException {
		System.out.println("LAUNCHING BROWSER...\n");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.indeed.com/resumes?co=US&hl=en");
		driver.manage().window().maximize();
		getscreenshot();
		String landingPageText = "Indeed Resume Search";
		if (driver.getTitle().equalsIgnoreCase(landingPageText)) {
			System.out.println("Landed in Indeed Resume Page Successfully!");
		}
		return true;
	}

	public boolean getIndeedLocalStorage() {
		indeedJavaScriptExeceutor = (JavascriptExecutor) driver;
		System.out.println("\nThe Local Storage for the key 'indeed.rex.serp::.RecentSearches' are - \n\n"
				+ indeedJavaScriptExeceutor.executeScript(String.format(GET_LOCAL_STORAGE)));
		return true;
	}

	protected void getscreenshot() {
		try {
			Thread.sleep(2000);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("IndeedQATaskScreenshot_" + System.currentTimeMillis() + ".png"));
		}

		catch (Exception screenshotException) {
			System.err.println("\nException from the Screenshot method - " + screenshotException.getMessage());
		}
	}

	protected boolean clickFindResumesButton() {
		WebElement findResumesSubmitButton = driver.findElement(SUBMIT);
		if (findResumesSubmitButton.isDisplayed()) {
			if (findResumesSubmitButton.getText().equals(FIND_RESUMES)) {
				findResumesSubmitButton.click();
				getscreenshot();
			}
		}
		return true;
	}

	@AfterSuite
	public boolean closeBrowser() {
		try {
			Thread.sleep(3000);
			driver.quit();
			System.out.println("\n\n--------------------------> BROWSER CLOSED <--------------------------\n\n");
		}

		catch (Exception exitException) {
			System.err.println("\nException from the Close Browser method - " + exitException.getMessage());
		}
		return true;
	}
}