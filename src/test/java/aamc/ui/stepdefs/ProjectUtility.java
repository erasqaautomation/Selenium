package aamc.ui.stepdefs;

import java.util.Iterator;

import aamc.ui.runner.TestRunner;
import aamc.ui.utility.CommonUtility;
import aamc.ui.utility.Report;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ProjectUtility {
	
	private Scenario scenario;
	public static String testscriptscreenshot;
	

	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	    Iterator<String> itr = scenario.getSourceTagNames().iterator();	    
	    Report.startTest(scenario.getName(),itr.next());
	    CommonUtility.logger=Logger.getLogger(scenario.getName());
    	PropertyConfigurator.configure("log4j.properties");
    	CommonUtility.logger.info("*************Started logs for feature:"+TestRunner.featureName+" and Scenario : "+scenario.getName()+"***********");
	    testscriptscreenshot = scenario.getName();
	    
	}
	
	@After
	public void after() {
		Report.endTest();
	}

}
