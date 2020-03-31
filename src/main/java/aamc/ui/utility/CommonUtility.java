package aamc.ui.utility;

//import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CommonUtility {
	
	/*
	 * Extent Report 
	 */
	 private static ExtentReports extent;
	 private static ExtentHtmlReporter htmlReporter;
	 public static Logger logger;
	 
	    public static ExtentReports getInstance() {
	        if (extent == null)
				try {
					createInstance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        return extent;
	    }
	 
	    //Create an extent report instance
	    public static ExtentReports createInstance() throws Exception {	       
	        
	        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String reportFileName = "Test-Report-"+timestamp+".html";
			String file = System.getProperty("user.dir")+"\\Reports\\ExtentReports\\"+reportFileName;
	        htmlReporter = new ExtentHtmlReporter(file);
	        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"\\extent-config.xml");
	        extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
//			extent.setSystemInfo("Host name", InetAddress.getLocalHost().getHostName());
			extent.setSystemInfo("Environment", "fTest");
			extent.setSystemInfo("user","Automation User");
			htmlReporter.config().setDocumentTitle("AAMC");
			htmlReporter.config().setReportName("Automation test report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.DARK);	 
	        return extent;
	    }
	    

	 
}
