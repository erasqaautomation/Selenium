package aamc.ui.stepdefs;

import java.util.Iterator;

import aamc.ui.utility.Report;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ProjectUtility {
	
	private Scenario scenario;
	public static String testscriptscreenshot;

	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	    Iterator<String> itr = scenario.getSourceTagNames().iterator();	    
	    Report.startTest(scenario.getName(),itr.next());
	    testscriptscreenshot = scenario.getName();
	    
	}
	
	@After
	public void after() {
		Report.endTest();
	}

}
