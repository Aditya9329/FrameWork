package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	WebElement newUserSignUpText;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement enterUserName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement enterUserEmails;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement clickSignupButton;
	
}
