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
	WebElement profileOpt;
	
	@FindBy(xpath="//div[text()='My Profile']")
	WebElement myProfileBtn;
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logoutBtn;
	
	@FindBy(xpath="//img[@alt='MenuIcon']")
	WebElement menuOpt;
	
	@FindBy(xpath="//img[@alt='Logo']")
	WebElement logo;
	
	
	//Actions
	
	public void clickOnProfileOption() {
		profileOpt.click();
	}
	
	public void clickOnMyProfile() {
		myProfileBtn.click();
	}
	
	public void clickOnLogout() {
		logoutBtn.click();
	}
	
	public void clickOnMenu() {
		menuOpt.click();
	}
	
	public void clickOnLogo() {
		logo.click();
	}
}
