package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationPage extends BasePage{

	WebDriver driver;

	public LocationPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[text()='Property Location'][@class='form-header']")
	WebElement locationPgConf;
	
	
	//Actions
	public boolean locationPageConfirmation() {
		return locationPgConf.isDisplayed();
	}
}
