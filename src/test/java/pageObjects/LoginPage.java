package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class LoginPage extends BasePage {
	
	
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//Elements
	
	@FindBy(xpath="//p[@class='login-p']")
	WebElement loginPageConf;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='password-toggle']")
	WebElement passwordToggleBtn;
	
	@FindBy(xpath="//div[@class='forgot-password']/a")
	WebElement forgotPassword;
	
	@FindBy(xpath="//button[@class='login-button']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement signUpPage;
	
	
	//Action Methods
	
	public boolean loginPageConfirmation() {
		return(loginPageConf.isDisplayed());
	}
	
	public void enterUsername() throws IOException{
		
		String username = BaseClass.getProperties().getProperty("username");
		userName.sendKeys(username);
	}
	
	public void enterPassword() throws IOException {
		
		String password = BaseClass.getProperties().getProperty("password");
		pass.sendKeys(password);
	}
	
	public void clickOnPasswordToggleButton() {
		passwordToggleBtn.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPassword.click();
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnSignUpPage() {
		signUpPage.click();
	}
}