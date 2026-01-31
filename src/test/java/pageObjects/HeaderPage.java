package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BasePage{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public HeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//Elements
	
	@FindBy(xpath="//div[@class='header-profile']")
	WebElement profileOptions;
	
	@FindBy(xpath="//div[text()='My Profile']")
	WebElement myProfileButton;
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//img[@alt='MenuIcon']")
	WebElement menuOptions;
	
	@FindBy(xpath="//img[@alt='Logo']")
	WebElement logo;
	
	
	//Actions
	
	public void clickOnProfileOption() {
		
		wait.until(ExpectedConditions.elementToBeClickable(profileOptions));
		profileOptions.click();
	}
	
	public void clickOnMyProfile() {
		
		wait.until(ExpectedConditions.elementToBeClickable(myProfileButton));
		myProfileButton.click();
	}
	
	public void clickOnLogout() {
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		logoutButton.click();
	}
	
	public void clickOnMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuOptions));
		menuOptions.click();
	}
	
	public void clickOnLogo() {
		
		wait.until(ExpectedConditions.elementToBeClickable(logo));
		logo.click();
	}
}
