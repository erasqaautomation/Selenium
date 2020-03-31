package aamc.ui.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		features= {"src/main/resources/features"},
		glue={"aamc.ui.stepdefs"},
		tags= {"@Smoke,@Regression"},
		format=
				{"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/re-run.xml"}
		
		)
public class TestRunner {
	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;
	public static String featureName;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver","SupportJar\\chromedriver.exe");
		driver = new ChromeDriver();
		testRunner = new TestNGCucumberRunner(TestRunner.class);
		
	}
	
	
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{	
		featureName =cFeature.toString();
		testRunner.runCucumber(cFeature.getCucumberFeature());
		
	}
	 

	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
		testRunner.finish();
	}
 }