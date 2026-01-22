package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{
	
	WebDriver driver;
	
	public HeaderPage(WebDriver driver) {
		super(driver);
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
		profileOptions.click();
	}
	
	public void clickOnMyProfile() {
		myProfileButton.click();
	}
	
	public void clickOnLogout() {
		logoutButton.click();
	}
	
	public void clickOnMenu() {
		menuOptions.click();
	}
	
	public void clickOnLogo() {
		logo.click();
	}
}
