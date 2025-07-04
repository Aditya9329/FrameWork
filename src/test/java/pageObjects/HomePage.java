package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//invoking parent class constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	WebElement home;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement linkSignInSingnUp;
	
	
	@FindBy(xpath="//b")
	WebElement checkUsername;
	
	@FindBy(xpath="//a[text()=' Delete Account']")
	WebElement clickOnDeleteAccount;
	
	@FindBy(xpath="//b[text()='Account Deleted!']")
	WebElement verifyAccountDeleted;
	
	
	
	public String verifyHome()
	{
		return home.getText();
	}
	
	public void linkSignInSingnUp()
	{
		linkSignInSingnUp.click();
	}
	
	public void checkUsername()
	{
		checkUsername.getText();
	}
	
	public void clickOnDeleteAccount()
	{
		clickOnDeleteAccount.click();
	}
	
	public void verifyAccountDeleted()
	{
		verifyAccountDeleted.click();
	}
	
	
	
	

}
