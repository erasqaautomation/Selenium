package aamc.ui.stepdefs;
import org.openqa.selenium.By;
import aamc.ui.runner.TestRunner;
import aamc.ui.utility.Report;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {


	@Given("^Open Application and Enter url$")
	public void open_Application_and_Enter_url() throws Throwable {
		TestRunner.driver.get("https://apps.ftest.aamc.org/pdws-web");
		
	  
	}

	@When("^enter username$")
	public void enter_username() throws Throwable {
		
		Thread.sleep(5000);
		TestRunner.driver.findElement(By.id("mat-input-2")).sendKeys("auto_tester");
		Report.log( Report.status.PASS, "login successfull");
	}

	@And("^enter password$")
	public void enter_password() throws Throwable {
		TestRunner.driver.findElement(By.id("password-field")).sendKeys("Auto@123");
		TestRunner.driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
	}

	@Then("^verify sucess$")
	public void verify_Msg() throws Throwable {
		Thread.sleep(5000);
		TestRunner.driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
}
