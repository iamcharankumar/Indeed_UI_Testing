package com.indeed.qataskpage;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Methods for Indeed SERP
 *  
 */

import java.util.List;

import org.openqa.selenium.WebElement;

import com.indeed.basemethods.IndeedBaseMethods;
import com.indeed.basemethods.IndeedSearchPageConstants;

public class IndeedSearchEngineResultsPage extends IndeedBaseMethods implements IndeedSearchPageConstants {

	public boolean typeInSERPWhatWhereBoxes() {
		WebElement serpSearchKeywordWhatBox = driver.findElement(SERP_WHAT_TEXT_BOX);
		WebElement serpSearchKeywordWhereBox = driver.findElement(SERP_WHERE_TEXT_BOX);
		serpSearchKeywordWhatBox.clear();
		serpSearchKeywordWhatBox.sendKeys(SEARCH_KEYWORD_2);
		getscreenshot();
		serpSearchKeywordWhereBox.clear();
		serpSearchKeywordWhereBox.sendKeys(LOCATION_PREFERENCE_2);
		getscreenshot();
		clickFindResumesButton();
		return true;
	}

	public boolean isRecentSearchesPresent() {
		List<WebElement> recentSearchElements = driver.findElements(RECENT_SEARCH_ELEMENTS);
		int recentSearchSize = recentSearchElements.size();
		int count = 1;
		System.out.println("My Recent Searches are as follows:\n");
		for (int recentSearchCount = 0; recentSearchCount < recentSearchSize; recentSearchCount++) {
			System.out
					.println("\n\n" + count++ + ") " + recentSearchElements.get(recentSearchCount).getText() + "\n\n");
			if (recentSearchElements.get(recentSearchCount).getText().contains(SEARCH_KEYWORD_1)) {
				System.out.println("Home Page Search Keyword is Present");
			}
			if (recentSearchElements.get(recentSearchCount).getText().contains(LOCATION_PREFERENCE_1)) {
				System.out.println("Home Page Location Preference is Present");
			}
			if (recentSearchElements.get(recentSearchCount).getText().contains(SEARCH_KEYWORD_2)) {
				System.out.println("Search Engine Result Page Search Keyword is Present");
			}
			if (recentSearchElements.get(recentSearchCount).getText().contains(LOCATION_PREFERENCE_2)) {
				System.out.println("Search Engine Result Page Location is Present");
			}
		}

		return true;
	}

	public boolean isClearLinkPresent() {
		WebElement homePageClearLink = driver.findElement(CLEAR_LINK);
		String clearLinkText = homePageClearLink.getText();
		if (homePageClearLink.isDisplayed()) {
			if (CLEAR_LINK_TEXT.equalsIgnoreCase(clearLinkText)) {
				getIndeedLocalStorage();
				System.out.println("Recent Search 'Clear' Link is Present!");
			} else
				System.out.println("Recent Search 'Clear' Link is Not Present!");
		} else
			System.out.println("No Search Made. Recent Search 'Clear' Link is Not Present!");
		return true;
	}
}