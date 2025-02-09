package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyERASLoginPage {
WebDriver driver;
	
	public MyERASLoginPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement eRASLoginINButton;
	
	@FindBy(id="username")
	@CacheLookup
	WebElement eRASUserName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement eRASPassword;
	
	@FindBy(id="signIn")
	@CacheLookup
	WebElement eRAS_SignInButton;
	
	public void enterUserName(String userName)
	{
		eRASUserName.clear();
		eRASUserName.sendKeys(userName);
		
	}
	

	public void enterPassword(String passWord)
	{
		eRASPassword.clear();
		eRASPassword.sendKeys(passWord);
		
	}
	
	public void clickOnSignInbutton()
	{
		
		eRAS_SignInButton.click();
	}
	
	public void clickOnLoginInbutton()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eRASLoginINButton.click();
		
	}
	
}
