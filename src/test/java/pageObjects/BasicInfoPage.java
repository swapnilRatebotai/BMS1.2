package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class BasicInfoPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public BasicInfoPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[@class='form-header']")
	WebElement basicInfoPageConf;

	@FindBy(xpath = "//input[@id='Property Name']")
	WebElement propertyNameInput;

	@FindBy(xpath = "//input[@id='Display Name']")
	WebElement displayNameInput;

	@FindBy(css = "#Description")
	WebElement descriptionInput;

	@FindBy(xpath = "//input[@placeholder=' Property Type']")
	WebElement propertyTypeInput;

	@FindBy(xpath = "//input[@placeholder=' Star Rating']")
	WebElement starRatingInput;

	@FindBy(xpath = "//input[@placeholder=' Built Year']")
	WebElement builtYearInput;

	@FindBy(xpath = "//input[@id='Number of Rooms']")
	WebElement numberOfRoomsInput;

	@FindBy(xpath = "//input[@id='Number of Floors']")
	WebElement numberOfFloorsInput;

	@FindBy(xpath = "//input[@placeholder=' Currency']")
	WebElement currencyInput;

	@FindBy(xpath = "//input[@placeholder=' Timezone']")
	WebElement timezoneInput;

	@FindBy(xpath = "//input[@placeholder=' Check-in Time']")
	WebElement checkInInput;

	@FindBy(xpath = "//input[@placeholder=' Check-out Time']")
	WebElement checkOutInput;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopup;

	// Actionsssss

	public boolean basicInfoPageConfirmation() {

		return basicInfoPageConf.isDisplayed();
	}

	public void enterPropertyName() throws IOException {

		String propertyname = BaseClass.getProperties().getProperty("PropertyName");
		propertyNameInput.sendKeys(propertyname);
	}

	public void enterDisplayName() throws IOException {

		String displayname = BaseClass.getProperties().getProperty("DisplayName");
		displayNameInput.sendKeys(displayname);
	}

	public void updateDescription() throws IOException {

		descriptionInput.click();
		descriptionInput.sendKeys(Keys.CONTROL + "a");
		descriptionInput.sendKeys(Keys.DELETE);
		String description = BaseClass.getProperties().getProperty("Description");
		descriptionInput.sendKeys(description);
	}
	
	public void selectPropertyType() throws IOException {

		propertyTypeInput.click();
		String propertytype = BaseClass.getProperties().getProperty("PropertyType");
		propertyTypeInput.sendKeys(propertytype);
		propertyTypeInput.sendKeys(Keys.DOWN);
		propertyTypeInput.sendKeys(Keys.ENTER);
	}
	
	public void selectStarRating() throws IOException {

		starRatingInput.click();
		String starRating = BaseClass.getProperties().getProperty("StarRating");
		starRatingInput.sendKeys(starRating);
		starRatingInput.sendKeys(Keys.DOWN);
		starRatingInput.sendKeys(Keys.ENTER);
	}

	public void updateBuiltYear() throws IOException {

		builtYearInput.click();
		builtYearInput.sendKeys(Keys.CONTROL + "a");
		builtYearInput.sendKeys(Keys.DELETE);
		String builtYear = BaseClass.getProperties().getProperty("BuiltYear");
		builtYearInput.sendKeys(builtYear);
		builtYearInput.sendKeys(Keys.DOWN);
		builtYearInput.sendKeys(Keys.ENTER);
	}

	public void updateNumberOfRooms() throws IOException {
		numberOfRoomsInput.clear();
		String numberOfRooms = BaseClass.getProperties().getProperty("NumberOfRooms");
		numberOfRoomsInput.sendKeys(numberOfRooms);
	}

	public void updateNumberOfFloors() throws IOException {
		numberOfFloorsInput.clear();
		String numberOfFloors = BaseClass.getProperties().getProperty("NumberOfFloors");
		numberOfFloorsInput.sendKeys(numberOfFloors);
	}
	
	public void selectCurrency() throws IOException {

		currencyInput.click();
		String currency = BaseClass.getProperties().getProperty("Currency");
		currencyInput.sendKeys(currency);
		currencyInput.sendKeys(Keys.DOWN);
		currencyInput.sendKeys(Keys.ENTER);
	}
	
	public void selectTimezone() throws IOException {

		timezoneInput.click();
		String timezone = BaseClass.getProperties().getProperty("Timezone");
		timezoneInput.sendKeys(timezone);
		timezoneInput.sendKeys(Keys.DOWN);
		timezoneInput.sendKeys(Keys.ENTER);
	}

	public void updateCheckInTime() throws IOException {
		checkInInput.click();
		checkInInput.sendKeys(Keys.CONTROL + "a");
		checkInInput.sendKeys(Keys.DELETE);
		String checkInTime = BaseClass.getProperties().getProperty("CheckInTime");
		checkInInput.sendKeys(checkInTime);
		checkInInput.sendKeys(Keys.DOWN);
		checkInInput.sendKeys(Keys.ENTER);
	}

	public void updateCheckOutTime() throws IOException {
		checkOutInput.click();
		checkOutInput.sendKeys(Keys.CONTROL + "a");
		checkOutInput.sendKeys(Keys.DELETE);
		String checkOutTime = BaseClass.getProperties().getProperty("CheckOutTime");
		checkOutInput.sendKeys(checkOutTime);
		checkOutInput.sendKeys(Keys.DOWN);
		checkOutInput.sendKeys(Keys.ENTER);
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public void clickOnCancelButton() {
		cancelButton.click();
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}

	public String waitAndGetSuccessMessage() {

		WebElement popup = wait.until(ExpectedConditions.visibilityOf(successPopup));
		return popup.getText().trim();
	}

	public void waitForSuccessPopupToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopup));
	}
}
