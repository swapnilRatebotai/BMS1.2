package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicInfoPage extends BasePage{

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public BasicInfoPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[@class='form-header']")
	WebElement basicInfoPgConf;
	
	@FindBy(css="#Description")
	WebElement descriptionInput;
	
	@FindBy(xpath="//input[@placeholder=' Built Year']")
	WebElement builtYearInput;
	
	@FindBy(xpath="//ul[@class='full-page-dropdown-list']")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@id='Number of Rooms']")
	WebElement numberOfRoomsInput;
	
	@FindBy(xpath="//input[@id='Number of Floors']")
	WebElement numberOfFloorsInput;
	
	@FindBy(xpath="//input[@placeholder=' Check-in Time']")
	WebElement checkInInput;
	
	@FindBy(xpath="//input[@placeholder=' Check-out Time']")
	WebElement checkOutInput;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@class='snackbar success']")
	WebElement successPopup;
	
	
	//Actions
	public boolean basicInfoPageConfirmation() {
		return basicInfoPgConf.isDisplayed();
	}
	
	public void enterDescription(String description) {
		descriptionInput.click();
		descriptionInput.sendKeys(Keys.CONTROL + "a");
		descriptionInput.sendKeys(Keys.DELETE);
		descriptionInput.sendKeys(description);
	}
	
	public void selectBuiltYear(String builtYear) {
		
		builtYearInput.click();
		builtYearInput.sendKeys(Keys.CONTROL + "a");
		builtYearInput.sendKeys(Keys.DELETE);
		builtYearInput.sendKeys(builtYear);
		dropdown.click();
		
	}
	
	public void enterNumberOfRooms(String noOfRooms) {
		numberOfRoomsInput.clear();
		numberOfRoomsInput.sendKeys(noOfRooms);
	}
	
	public void enterNumberOfFloors(String noOfFloors) {
		numberOfFloorsInput.clear();
		numberOfFloorsInput.sendKeys(noOfFloors);
	}
	
	public void selectCheckInTime(String checkIn) {
		checkInInput.click();
		checkInInput.sendKeys(Keys.CONTROL + "a");
		checkInInput.sendKeys(Keys.DELETE);
		checkInInput.sendKeys(checkIn);
		dropdown.click();
	}
	
	public void selectCheckOutTime(String checkOut) {
		checkOutInput.click();
		checkOutInput.sendKeys(Keys.CONTROL + "a");
		checkOutInput.sendKeys(Keys.DELETE);
		checkOutInput.sendKeys(checkOut);
		dropdown.click();
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public String waitAndGetSuccessMessage() {
	    
	    WebElement popup =
	        wait.until(ExpectedConditions.visibilityOf(successPopup));
	    return popup.getText().trim();
	}
}
