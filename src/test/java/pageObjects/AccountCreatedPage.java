package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

	
	AccountCreatedPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[text()='Account Created!']")
	WebElement checkAccountCreatedMessage;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement clickOnContinueButton;
	
}
