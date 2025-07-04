package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	WebElement newUserSignUpText;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement enterUserName;
	
	@FindBy(xpath="//input[@name='email' and @data-qa='signup-email']")
	WebElement enterUserEmails;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement clickSignupButton;
	
	
	public String check_newUserSignUpText()
	{
		return newUserSignUpText.getText();
	}
	
	
	public void enterUserName(String username)
	{
		enterUserName.sendKeys(username);
	}
	
	public void enterUserEmails(String email)
	{
		enterUserEmails.sendKeys(email);
	}
	
	public void clickSignupButton()
	{
		clickSignupButton.click();
	}
	
	
	
	
}
