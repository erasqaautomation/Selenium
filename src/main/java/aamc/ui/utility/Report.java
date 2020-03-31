package aamc.ui.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import aamc.ui.runner.TestRunner;
import aamc.ui.stepdefs.ProjectUtility;

public class Report {

	
	static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
	static ExtentReports extent = CommonUtility.getInstance();
	
	public static enum status 
	{
		PASS,FAIL,INFO;
	}
	
	public static synchronized ExtentTest getTest() {
		return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	}

	public static synchronized void endTest() {
		extent.flush();
	}

	public static synchronized ExtentTest startTest(String testName, String category) {
		ExtentTest test = extent.createTest(testName);
		test.assignCategory(category);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
		return test;
	}
	
	
		
	public static void log(Report.status TCStatus, String details ) 
	{
		if(TCStatus.equals(status.PASS))
		{
			
			getTest().log(Status.PASS, details);
		}
		
		if(TCStatus.equals(status.FAIL))
		{
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String ScreenShotPath = System.getProperty("user.dir")+"\\Reports\\ScreenShots\\"+ProjectUtility.testscriptscreenshot+timestamp+".png";
			TakesScreenshot ts = (TakesScreenshot) TestRunner.driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(ScreenShotPath);
			getTest().log(Status.FAIL, details);
				try {
				FileUtils.copyFile(Source, destination);
				getTest().addScreenCaptureFromPath(ScreenShotPath);
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			
		
		if(TCStatus.equals(status.INFO))
		{
			getTest().log(Status.INFO, details);
		}
			
		}
		
	
}

