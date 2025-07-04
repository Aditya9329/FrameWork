package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

	
	public AccountCreatedPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[text()='Account Created!']")
	WebElement checkAccountCreatedMessage;
	
	
	public boolean checkAccountCreatedMessage()
	{
		return checkAccountCreatedMessage.isDisplayed();
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement clickOnContinueButton;
	
	public void clickOnContinueButton()
	{
		clickOnContinueButton.click();
	}
	
}
