package com.indeed.qatasktestmethods;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Test Methods for Indeed Home Page
 *  
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.indeed.qataskpage.IndeedSearchEngineResultsPage;

public class IndeedSearchEngineResultsPageTestMethods extends IndeedSearchEngineResultsPage {

	@Test(priority = 0)
	public void testBothSERPWhatWhereBoxes() {

		Assert.assertTrue(typeInSERPWhatWhereBoxes());
	}

	@Test(priority = 0)
	public void testRecentSearchElements() {
		Assert.assertTrue(isRecentSearchesPresent());
	}

	@Test(priority = 0)
	public void testClearLink() {
		Assert.assertTrue(isClearLinkPresent());
	}
}