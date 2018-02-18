package com.indeed.qatasktestmethods;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Test Methods for Indeed Home Page
 *  
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.indeed.qataskpage.IndeedSearchEngineHomePage;

public class IndeedSearchEngineHomePageTestMethods extends IndeedSearchEngineHomePage {

	@Test(priority = 0)
	public void testIndeedLogo() {
		Assert.assertTrue(isIndeedLogoPresent());
	}

	@Test(priority = 0)
	public void testSignInLink() {
		Assert.assertTrue(isSignInPresent());
	}

	@Test(priority = 0)
	public void testAdvancedSearchLink() {
		Assert.assertTrue(isAdvacncedSearchLinkPresent());
	}

	@Test(priority = 0)
	public void testJobTitleCheckBox() {
		Assert.assertTrue(isJobTitlesCheckBoxSelected());
	}

	@Test(priority = 0)
	public void testOnlyHomePageWhatBox() {
		Assert.assertTrue(typeInHomeWhatBox());
	}

	@Test(priority = 0)
	public void testOnlyHomePageWhereBox() {
		Assert.assertTrue(typeInHomeWhereBox());
	}

	@Test(priority = 0)
	public void testBothHomePageWhatWhereBoxes() {
		Assert.assertTrue(typeInHomeWhatWhereBoxes());
	}
}