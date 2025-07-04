package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpDetailsPage;

public class Account_Registration_TC001 {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void  tearDown()
	{
		driver.close();
	}
	
	@Test
	public void verify_account_registration_TC001() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.verifyHome();
		hp.linkSignInSingnUp();
		
		
		LoginPage lp = new LoginPage(driver);
		String signupText = lp.check_newUserSignUpText();
		Assert.assertEquals(signupText,"New User Signup!");
		lp.enterUserName("aa22vv");
		lp.enterUserEmails("aa22vxxv@gmail.com");
		lp.clickSignupButton();
		
		SignUpDetailsPage sudp = new SignUpDetailsPage(driver);
		String heading  = sudp.enterAccountInformationText();
		/* Assert.assertEquals(heading, "Enter Account Information"); */
		sudp.enterTitleMr();
		sudp.enterPassword("12345");
		sudp.enterDays("1");
		sudp.enterMonths("January");
		sudp.enterYears("2021");
		Thread.sleep(3000);
		sudp.checkbox_Receivespecialoffersfromourpartners();
		sudp.check_signupforournewsletter();
		sudp.enterFirstName("aavv");
		sudp.enterLastName("22");
		sudp.enterAddress1("address1");
		sudp.enterAddress2("address2");
		sudp.enterCompanyName("ABCD");
		sudp.enterState("XYZ_state");
		sudp.enterCity("acd_city");
		sudp.enterZipCode("767484");
		sudp.enterMobileNumber("776655443");
		sudp.selectCountries();
		sudp.clickCreateAccount();
		
		AccountCreatedPage acp = new AccountCreatedPage(driver);
		boolean isMessageDisplayed = acp.checkAccountCreatedMessage();
		Assert.assertTrue(isMessageDisplayed);
		acp.clickOnContinueButton();
	}
}
