package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class SignUpPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public SignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//Elements
	
	@FindBy(css=".signup-h2")
	WebElement signUpPageConf;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobileNumberInput;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='password-toggle']")
	WebElement passwordToggleButton;
	
	@FindBy(css="signup-button")
	WebElement createAccountButton;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginPage;
	
	//Actions
	
	public boolean signUpPageConfirmation() {
		
		return(signUpPageConf.isDisplayed());
	}
	
	public void enterEmailAddress() throws IOException {
		
		String email = BaseClass.getProperties().getProperty("EmailForSignUp");
		emailInput.sendKeys(email);
	}
	
	public void enterMobileNumber() throws IOException {
		
		String mobilenumber = BaseClass.getProperties().getProperty("MobileNumberForSignUp");
		emailInput.sendKeys(mobilenumber);
	}
	
	public void enterPassword() throws IOException {
		
		String password = BaseClass.getProperties().getProperty("PasswordForSignup");
		emailInput.sendKeys(password);
	}
	
	public void clickOnPasswordToggleButton() {
		
		passwordToggleButton.click();
	}
	
	public void clickOnCreateAccountButton() {
		
		createAccountButton.click();
	}
	
	public void clickOnLoginPage() {
		
		loginPage.click();
	}
}
