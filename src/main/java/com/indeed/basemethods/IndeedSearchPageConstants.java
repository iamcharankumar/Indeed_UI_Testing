package com.indeed.basemethods;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Declaration of Web Locators and Other Constants to test Indeed Web Portal 
 */

import org.openqa.selenium.By;

public interface IndeedSearchPageConstants {

	// Web Element Locators

	public By INDEED_LOGO = By.id("indeed_logo");
	public By ADVANCED_SEARCH_LINK = By.linkText("Advanced Search");
	public By CLEAR_LINK = By.linkText("» clear searches");
	public By SIGN_IN_LINK = By.linkText("Sign in");
	public By HOME_WHAT_TEXT_BOX = By.id("query");
	public By HOME_WHERE_TEXT_BOX = By.id("location");
	public By HOME_JOB_TITLES_TEXT_BOX = By.xpath("//input[@name = 'cb']");
	public By SERP_WHAT_TEXT_BOX = By.cssSelector("#query.query.input");
	public By SERP_WHERE_TEXT_BOX = By.cssSelector("#location.location.input");
	public By SUBMIT = By.id("submit");
	public By RECENT_SEARCH_ELEMENTS = By.cssSelector("div#recent-searches ul li a");

	// Web Element Text

	public String FIND_RESUMES = "Find Resumes";
	public String INDEED_LOGO_ALT_ATTRIBUTE = "Indeed Resume";
	public String ADVANCED_SEARCH_LINK_TEXT = "Advanced Search";
	public String CLEAR_LINK_TEXT = "» clear searches";
	public String SIGN_IN_LINK_TEXT = "Sign in";

	// Java Script for local storage
	public String INDEED_LOCAL_STORAGE_KEY = "'indeed.rex.serp::.RecentSearches'";
	public String GET_LOCAL_STORAGE = "return window.localStorage.getItem(" + INDEED_LOCAL_STORAGE_KEY + ");";

	// Test Data for the Framework

	public String SEARCH_KEYWORD_1 = "Quality Assurance";
	public String SEARCH_KEYWORD_2 = "Software Engineer";
	public String LOCATION_PREFERENCE_1 = "Chennai";
	public String LOCATION_PREFERENCE_2 = "Austin";
}