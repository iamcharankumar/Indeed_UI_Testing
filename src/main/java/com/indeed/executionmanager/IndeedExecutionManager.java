package com.indeed.executionmanager;

/*
 * Author: Charankumar. H 
 * Designation: Senior Quality Assurance Engineer
 * Class: Starting point of the Framework which start all testing 
 */

import org.testng.annotations.Test;

import com.indeed.basemethods.IndeedBaseMethods;
import com.indeed.qatasktestmethods.IndeedSearchEngineHomePageTestMethods;
import com.indeed.qatasktestmethods.IndeedSearchEngineResultsPageTestMethods;

public class IndeedExecutionManager {

	IndeedBaseMethods indeedBaseTestMethods;
	IndeedSearchEngineHomePageTestMethods indeedSearchEngineHomePageTestMethods;
	IndeedSearchEngineResultsPageTestMethods indeedSearchEngineResultsPageTestMethods;

	@Test
	public void startIndeedQATask() {

		try {
			indeedBaseTestMethods = new IndeedBaseMethods();
			indeedSearchEngineHomePageTestMethods = new IndeedSearchEngineHomePageTestMethods();
			indeedSearchEngineResultsPageTestMethods = new IndeedSearchEngineResultsPageTestMethods();
			System.out.println("\n\n-------------------------> INDEED QA TASK BEGINS! <-------------------------\n\n");
			indeedBaseTestMethods.openIndeedURL();
			System.out.println("\n\n---------------------> INDEED HOME PAGE TEST BEGINS! <---------------------\n\n");
			indeedSearchEngineHomePageTestMethods.testIndeedLogo();
			indeedSearchEngineHomePageTestMethods.testSignInLink();
			indeedSearchEngineHomePageTestMethods.testAdvancedSearchLink();
			indeedSearchEngineHomePageTestMethods.testJobTitleCheckBox();
			indeedSearchEngineHomePageTestMethods.testBothHomePageWhatWhereBoxes();
			System.out.println("\n\n---------------------> INDEED HOME PAGE TEST ENDS! <---------------------\n\n");
			System.out.println("\n\n---------------------> INDEED SERP TEST BEGINS! <---------------------\n\n");
			indeedSearchEngineResultsPageTestMethods.testBothSERPWhatWhereBoxes();
			indeedSearchEngineResultsPageTestMethods.testRecentSearchElements();
			indeedSearchEngineResultsPageTestMethods.testClearLink();
			System.out.println("\n\n---------------------> INDEED SERP TEST ENDS! <---------------------\n\n");
			indeedBaseTestMethods.closeBrowser();
			System.out.println("\n\n--------------------------> INDEED QA TASK ENDS! <--------------------------\n\n");
		}

		catch (Exception indeedQATaskException) {
			System.err.println("\n\nError From the Execution Manager - " + indeedQATaskException.getMessage() + "\n\n");
		}
	}
}