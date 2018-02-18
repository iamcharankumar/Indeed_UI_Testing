package com.indeed.qataskpage;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Methods for Indeed Home Page
 *  
 */

import org.openqa.selenium.WebElement;

import com.indeed.basemethods.IndeedBaseMethods;
import com.indeed.basemethods.IndeedSearchPageConstants;

public class IndeedSearchEngineHomePage extends IndeedBaseMethods implements IndeedSearchPageConstants {

	
	public boolean isIndeedLogoPresent() {
		WebElement indeedLogo = driver.findElement(INDEED_LOGO);
		String indeedLogoImageAttribute = indeedLogo.getAttribute("alt");
		if (INDEED_LOGO_ALT_ATTRIBUTE.equalsIgnoreCase(indeedLogoImageAttribute)) {
			System.out.println("Indeed Logo is Present!");
		} else
			System.out.println("Indeed Logo is Not Present!");
		return true;
	}

	public boolean isSignInPresent() {
		WebElement signIn = driver.findElement(SIGN_IN_LINK);
		String signInLinkText = signIn.getText();
		if (SIGN_IN_LINK_TEXT.equalsIgnoreCase(signInLinkText)) {
			System.out.println("Sign In Link is Present!");
		} else
			System.out.println("Sign In Link is Not Present!");
		return true;
	}

	public boolean isAdvacncedSearchLinkPresent() {
		WebElement advancedSearchLink = driver.findElement(ADVANCED_SEARCH_LINK);
		String advancedSearchLinkText = advancedSearchLink.getText();
		if (ADVANCED_SEARCH_LINK_TEXT.equalsIgnoreCase(advancedSearchLinkText)) {
			System.out.println("Adavnced Search Link is Present!");
		} else
			System.out.println("Adavnced Search Link is Not Present!");
		return true;
	}

	public boolean isJobTitlesCheckBoxSelected() {
		WebElement jobTitleCheckBox = driver.findElement(HOME_JOB_TITLES_TEXT_BOX);
		if (jobTitleCheckBox.isDisplayed()) {
			if (jobTitleCheckBox.isSelected()) {
				System.out.println("Job Titles Check Box is already selected");
			}
		}
		return true;
	}

	public boolean typeInHomeWhatBox() {
		WebElement homePageWhatBox = driver.findElement(HOME_WHAT_TEXT_BOX);
		if (homePageWhatBox.isDisplayed()) {
			homePageWhatBox.clear();
			homePageWhatBox.sendKeys(SEARCH_KEYWORD_1);
			getscreenshot();
			clickFindResumesButton();
		}
		return true;
	}

	public boolean typeInHomeWhereBox() {
		WebElement homePageWhereBox = driver.findElement(HOME_WHERE_TEXT_BOX);
		if (homePageWhereBox.isDisplayed()) {
			homePageWhereBox.clear();
			homePageWhereBox.sendKeys(LOCATION_PREFERENCE_1);
			getscreenshot();
			clickFindResumesButton();
		}
		return true;
	}

	public boolean typeInHomeWhatWhereBoxes() {
		WebElement homePageWhatBox = driver.findElement(HOME_WHAT_TEXT_BOX);
		WebElement homePageWhereBox = driver.findElement(HOME_WHERE_TEXT_BOX);
		if (homePageWhatBox.isDisplayed() && homePageWhereBox.isDisplayed()) {
			homePageWhatBox.clear();
			homePageWhatBox.sendKeys(SEARCH_KEYWORD_1);
			homePageWhereBox.clear();
			homePageWhereBox.sendKeys(LOCATION_PREFERENCE_1);
			getscreenshot();
			clickFindResumesButton();
			System.out.println("Search Keyword and Location Search Completed");
		}
		return true;
	}
}