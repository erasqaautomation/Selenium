package aamc.ui.stepdefs;


import org.openqa.selenium.By;
import aamc.ui.runner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import aamc.ui.utility.Report;


public class Dashboard {
	
	@Given("^Open Application and Enter urls$")
	public void open_Application_and_Enter_url() throws Throwable {
		
		TestRunner.driver.get("https://apps.ftest.aamc.org/pdws-web");
		Report.log(Report.status.FAIL, "login successfull");
	  
	}
	
	@When("^Login page is loaded Enter$")
	public void login_page_is_loaded_Enter_auto_tester_in_step() throws Exception {
		Thread.sleep(5000);		
		TestRunner.driver.findElement(By.id("mat-input-2")).sendKeys("auto_tester");
		TestRunner.driver.findElement(By.id("password-field")).sendKeys("Auto@123");
		Report.log(Report.status.PASS, "login successfull");
		
	}

	@Then("^Enter$")
	public void enter_Auto() {
		TestRunner.driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
		Report.log( Report.status.PASS, "login successfull");
	}
	@Then("^click on applications$")
	public void application()throws Exception  {
	
		Thread.sleep(5000);
		TestRunner.driver.findElement(By.xpath("//a[text()='Applications']")).click();
		Thread.sleep(5000);
		TestRunner.driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(5000);
		Report.log( Report.status.PASS, "login successfull");
		
	}

}
