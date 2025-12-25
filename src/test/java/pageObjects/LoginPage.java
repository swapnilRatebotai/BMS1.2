package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
//		PageFactory.initElements(driver, this); // Initialize the page elements using PageFactory
	}
	
	//Elements
	
	@FindBy(xpath="//p[@class='login-p']")
	WebElement loginPgConf;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='password-toggle']")
	WebElement passwordToggleBtn;
	
	@FindBy(xpath="//div[@class='forgot-password']/a")
	WebElement forgotPassword;
	
	@FindBy(xpath="//button[@class='login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement signUpBtn;
	
	
	
	//Action Methods
	
	public boolean loginPageConfirmation() {
		return(loginPgConf.isDisplayed());
	}
	
	public void enterUsername(String username){
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickOnPasswordToggleButton() {
		passwordToggleBtn.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPassword.click();
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	
	public void clickOnSignUpButton() {
		signUpBtn.click();
	}
}