package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpDetailsPage;
import testBase.BaseClass;

public class Account_Registration_TC001 extends BaseClass {
	
	
	
	@Test(groups="sanity")
	public void verify_account_registration_TC001() throws InterruptedException
	{
		
		 logger.info("*******Starting Account_Registration_TC001 ***********"); 
		HomePage hp = new HomePage(driver);
		hp.verifyHome();
		hp.linkSignInSingnUp();
		
		
		LoginPage lp = new LoginPage(driver);
		String signupText = lp.check_newUserSignUpText();
		Assert.assertEquals(signupText,"New User Signup!");
		lp.enterUserName("aa292vv");
		 logger.info("Username entered successfully"); 
		lp.enterUserEmails("aa527792vxxv@gmail.com");
		 logger.info("Email entered successfully"); 
		lp.clickSignupButton();
		 logger.info("Signup button clicked successfully"); 
		SignUpDetailsPage sudp = new SignUpDetailsPage(driver);
		String heading  = sudp.enterAccountInformationText();
		 Assert.assertEquals(heading, "Enter Account Information"); 
		sudp.enterTitleMr();
		 logger.info("Title entered"); 
		sudp.enterPassword("12345");
		 logger.info("Password entered"); 
		sudp.enterDays("1");
		 logger.info("Days entered"); 
		sudp.enterMonths("January");
		 logger.info("Month entered"); 
		sudp.enterYears("2021");
		 logger.info("Year entered"); 
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
		 logger.info("create account clicked"); 
		AccountCreatedPage acp = new AccountCreatedPage(driver);
		boolean isMessageDisplayed = acp.checkAccountCreatedMessage();
		Assert.assertTrue(isMessageDisplayed);
		acp.clickOnContinueButton();
	}
}
