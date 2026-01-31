package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class LoginPage extends BasePage {
	
	
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//Elements
	
	@FindBy(xpath="//p[@class='login-p']")
	WebElement loginPageConfirmation;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='password-toggle']")
	WebElement passwordToggleButton;
	
	@FindBy(xpath="//div[@class='forgot-password']/a")
	WebElement forgotPassword;
	
	@FindBy(xpath="//button[@class='login-button']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement signUpPage;
	
	
	//Action Methods
	
	public boolean loginPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(loginPageConfirmation));
		return(loginPageConfirmation.isDisplayed());
	}
	
	public void enterUsername() throws IOException{
		
		wait.until(ExpectedConditions.visibilityOf(userName));
		String username = BaseClass.getProperties().getProperty("username");
		userName.sendKeys(username);
	}
	
	public void enterPassword() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(password));
		String pass = BaseClass.getProperties().getProperty("password");
		password.sendKeys(pass);
	}
	
	public void clickOnPasswordToggleButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(passwordToggleButton));
		passwordToggleButton.click();
	}
	
	public void clickOnForgotPassword() {
		
		wait.until(ExpectedConditions.elementToBeClickable(forgotPassword));
		forgotPassword.click();
	}
	
	public void clickOnLoginButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
	
	public void clickOnSignUpPage() {
		
		wait.until(ExpectedConditions.elementToBeClickable(signUpPage));
		signUpPage.click();
	}
}