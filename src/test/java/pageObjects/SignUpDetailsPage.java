package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpDetailsPage extends BasePage {

	
	SignUpDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2/b[text()='Enter Account Information']")
	WebElement enterAccountInformationText;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement enterTitleMr;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement enterPassword;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement enterDays;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement enterMonths;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement enterYears;
	
	@FindBy(xpath="//label[text()='Sign up for our newsletter!']")
	WebElement check_signupforournewsletter;
	
	@FindBy(xpath="//label[text()='Receive special offers from our partners!']")
	WebElement checkbox_Receivespecialoffersfromourpartners;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement enterFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement enterLastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement enterCompanyName;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement enterAddress1;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement enterAddress2;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement selectCountries;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement enterState;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement enterCity;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement enterZipCode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement enterMobileNumber;
	
	@FindBy(xpath="//button[@type='submit' and text()='Create Account']")
	WebElement clickCreateAccount;
}
