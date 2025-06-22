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
	
	
	public void checkAccountCreatedMessage()
	{
		checkAccountCreatedMessage.getText();
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement clickOnContinueButton;
	
	public void clickOnContinueButton()
	{
		clickOnContinueButton.click();
	}
	
}
