package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPage extends BasePage{

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public LocationPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[text()='Property Location'][@class='form-header']")
	WebElement locationPgConf;
	
	@FindBy(xpath="//input[@id='Street Address']")
	WebElement streetAddressInput;
	
	@FindBy(css="#Locality")
	WebElement localityInput;
	
	@FindBy(xpath="//button[normalize-space()='Update Location']")
	WebElement updateLocationButton;
	
	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopup;
	
	
	//Actions
	public boolean locationPageConfirmation() {
		return locationPgConf.isDisplayed();
	}
	
	public void updateStreetAddress(String streetAddress) throws InterruptedException {
		streetAddressInput.clear();
		streetAddressInput.sendKeys(streetAddress);
		Thread.sleep(800);
		streetAddressInput.sendKeys(Keys.DOWN);
		Thread.sleep(800);
		streetAddressInput.sendKeys(Keys.ENTER);
		Thread.sleep(800);
	}
	
	public void updateLocality(String locality) {
		localityInput.clear();
		localityInput.sendKeys(locality);
	}
	
	public void clickOnUpdateLocationButton() {
		updateLocationButton.click();
	}
	
	public String waitAndGetSuccessMessage() {

		WebElement popup = wait.until(ExpectedConditions.visibilityOf(successPopup));
		return popup.getText().trim();
	}
	
	public void waitForSuccessPopupToDisappear() {
		
		wait.until(ExpectedConditions.invisibilityOf(successPopup));
	}
}
