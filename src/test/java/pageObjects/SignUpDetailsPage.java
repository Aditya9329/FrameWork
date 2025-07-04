package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpDetailsPage extends BasePage {

	
	public SignUpDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2/b[text()='Enter Account Information']")
	WebElement enterAccountInformationText;
	
	public String enterAccountInformationText()
	{
		return enterAccountInformationText.getText();
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement enterTitleMr;
	
	public void enterTitleMr()
	{
		enterTitleMr.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement enterPassword;
	
	public void enterPassword(String password)
	{
		enterPassword.sendKeys(password);
	}
	
	@FindBy(xpath="//select[@id='days']")
	WebElement enterDays;
	
	public void enterDays(String day)
	{
		enterDays.click();
		Select days = new Select(enterDays);
		days.selectByVisibleText(day);
		
	}
	
	@FindBy(xpath="//select[@id='months']")
	WebElement enterMonths;
	
	public void enterMonths(String mon)
	{
		enterMonths.click();
		Select month = new Select(enterMonths);
		month.selectByVisibleText(mon);
	}
	
	@FindBy(xpath="//select[@id='years']")
	WebElement enterYears;
	
	public void enterYears(String year)
	{
		enterYears.click();
		Select Years = new Select(enterYears);
		Years.selectByVisibleText(year);
	}
	
	
	
	
	@FindBy(xpath="//label[text()='Sign up for our newsletter!']")
	WebElement check_signupforournewsletter;
	
	public void check_signupforournewsletter()
	{
		check_signupforournewsletter.click();
	}
	
	@FindBy(xpath="//label[text()='Receive special offers from our partners!']")
	WebElement checkbox_Receivespecialoffersfromourpartners;
	
	public void checkbox_Receivespecialoffersfromourpartners()
	{
		checkbox_Receivespecialoffersfromourpartners.click();
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement enterFirstName;
	
	public void enterFirstName(String firstName)
	{
		enterFirstName.sendKeys(firstName);
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement enterLastName;
	
	public void enterLastName(String lastName)
	{
		enterLastName.sendKeys(lastName);
	}
	
	@FindBy(xpath="//input[@id='company']")
	WebElement enterCompanyName;
	
	public void enterCompanyName(String companyName)
	{
		enterCompanyName.sendKeys(companyName);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement enterAddress1;
	
	public void enterAddress1(String address1)
	{
		enterAddress1.sendKeys(address1);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement enterAddress2;
	
	public void enterAddress2(String address2)
	{
		enterAddress1.sendKeys(address2);
	}
	
	@FindBy(xpath="//select[@id='country']")
	WebElement selectCountries;
	
	public void selectCountries()
	{
		selectCountries.click();
	}
	
	@FindBy(xpath="//input[@id='state']")
	WebElement enterState;
	
	public void enterState(String state)
	{
		enterState.sendKeys(state);
	}
	
	@FindBy(xpath="//input[@id='city']")
	WebElement enterCity;
	
	public void enterCity(String city)
	{
		enterCity.sendKeys(city);
	}
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement enterZipCode;
	
	public void enterZipCode(String zipcode)
	{
		enterZipCode.sendKeys(zipcode);
	}
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement enterMobileNumber;
	
	public void enterMobileNumber(String mob)
	{
		enterMobileNumber.sendKeys(mob);
	}
	
	@FindBy(xpath="//button[@type='submit' and text()='Create Account']")
	WebElement clickCreateAccount;
	
	public void clickCreateAccount()
	{
		clickCreateAccount.click();
	}
}
