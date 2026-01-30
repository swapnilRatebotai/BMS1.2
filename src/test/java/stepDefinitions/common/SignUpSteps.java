package stepDefinitions.common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.MailinatorPage;
import pageObjects.SignUpPage;

public class SignUpSteps {

	WebDriver driver;
	
	SignUpPage signUpPage  = new SignUpPage(BaseClass.getDriver());
	MailinatorPage mailinatorPage  = new MailinatorPage(BaseClass.getDriver());
	
	@Given("the user signs up for the BMS application")
	public void the_user_signs_up_for_the_bms_application() throws IOException {
	    
		signUpPage.enterEmailAddress();
		signUpPage.enterMobileNumber();
		signUpPage.enterPassword();
		signUpPage.clickOnPasswordToggleButton();
		signUpPage.clickOnCreateAccountButton();
		signUpPage.clickOnGoToLoginButton();
	}

	@When("the user verifies the account via email")
	public void the_user_verifies_the_account_via_email() throws IOException {
	    
		driver.get("https://mailinator.com");
		mailinatorPage.searchMailOnMailinator();
		mailinatorPage.openVerificationMail();
		mailinatorPage.clickOnVerifyEmailAddress();
		mailinatorPage.clickOnContinueToLoginButton();
		
	}
}
