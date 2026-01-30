package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class MailinatorPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public MailinatorPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//Elements
	
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchBoxInput;
	
	@FindBy(xpath="//button[normalize-space()='GO']")
	WebElement goButton;
	
	@FindBy(xpath="//td[normalize-space()='no-reply@ratebotai.com']")
	WebElement verificationMail;
	
	@FindBy(xpath="//a[normalize-space()='Verify Email Address']")
	WebElement verifyEmailAddressLink;
	
	@FindBy(xpath="//button[normalize-space()='Continue to Login']")
	WebElement continueToLoginButton;
	
	
	//Actions
	
	public void searchMailOnMailinator() throws IOException {
		
		String email = BaseClass.getProperties().getProperty("Email");
		searchBoxInput.sendKeys(email);
		goButton.click();
	}
	
	public void openVerificationMail() {
		
		wait.until(ExpectedConditions.elementToBeClickable(verificationMail));
		verificationMail.click();
	}
	
	public void clickOnVerifyEmailAddress() {
		
		verifyEmailAddressLink.click();
	}
	
	public void clickOnContinueToLoginButton() {
		
		continueToLoginButton.click();
	}
}
