package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	WebElement signUpPageConfirmation;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobileNumberInput;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='password-toggle']")
	WebElement passwordToggleButton;
	
	@FindBy(css=".signup-button")
	WebElement createAccountButton;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginPage;
	
	@FindBy(css=".login-redirect-button")
	WebElement goToLoginButton;
	
	
	
	//Actions
	
	public boolean signUpPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(signUpPageConfirmation));
		return(signUpPageConfirmation.isDisplayed());
	}
	
	public void enterEmailAddress() throws IOException {
		
//		wait.until(ExpectedConditions.visibilityOf(emailInput));
		String email = BaseClass.getProperties().getProperty("EmailForSignUp");
		emailInput.sendKeys(email);
	}
	
	public void enterMobileNumber() throws IOException {
		
//		wait.until(ExpectedConditions.visibilityOf(mobileNumberInput));
		String mobilenumber = BaseClass.getProperties().getProperty("MobileNumberForSignUp");
		mobileNumberInput.sendKeys(mobilenumber);
	}
	
	public void enterPassword() throws IOException {
		
//		wait.until(ExpectedConditions.visibilityOf(password));
		String pass = BaseClass.getProperties().getProperty("PasswordForSignup");
		password.sendKeys(pass);
	}
	
	public void clickOnPasswordToggleButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(passwordToggleButton));
		passwordToggleButton.click();
	}
	
	public void clickOnCreateAccountButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
		createAccountButton.click();
	}
	
	public void clickOnLoginPage() {
		
		wait.until(ExpectedConditions.elementToBeClickable(loginPage));
		loginPage.click();
	}
	
	public void clickOnGoToLoginButton(){
		
		wait.until(ExpectedConditions.elementToBeClickable(goToLoginButton));
		goToLoginButton.click();
	}
}
