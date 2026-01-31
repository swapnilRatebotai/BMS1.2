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

public class RoomsPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public RoomsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Rooms'][@class='form-header']")
	WebElement roomsPageConf;

	@FindBy(xpath = "//button[normalize-space()='Create New Room']")
	WebElement createNewRoomButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room'] /ancestor::div[contains(@class,'room-card-header')] //input[@type='checkbox']")
	WebElement testRoomStatusToggle;

	@FindBy(xpath = "//h3[normalize-space()='Test Room'] /ancestor::div[contains(@class,'room-card-header')]//button[normalize-space()='Edit Room']")
	WebElement editTestRoomButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room'] /ancestor::div[contains(@class,'room-card-header')] //button[contains(@class,'create-rate-plan')] ")
	WebElement createTestRatePlanButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room'] /ancestor::div[contains(@class,'room-card-header')] //button[contains(@class,'view-rate-plans')] ")
	WebElement showHideTestRatePlansButton;

	@FindBy(xpath = "//input[@name='display_name']")
	WebElement displayNameInput;

	@FindBy(css = "#Description")
	WebElement descriptionInput;

	@FindBy(xpath = "//input[@name='no_of_rooms']")
	WebElement numberOfRoomsInput;

	@FindBy(xpath = "//input[@placeholder=' Room Type']")
	WebElement roomTypeDropDown;

	@FindBy(xpath = "//input[@placeholder=' Room View']")
	WebElement roomViewDropDown;

	@FindBy(xpath = "//input[@placeholder=' Bed Type']")
	WebElement bedTypeDropDown;

	@FindBy(xpath = "//input[@placeholder=' Extra Bed Type']")
	WebElement extraBedTypeDropDown;

	@FindBy(xpath = "//input[@name='no_of_base_adults']")
	WebElement baseAdultsInput;

	@FindBy(xpath = "//input[@name='no_of_max_adults']")
	WebElement maxAdultsInput;

	@FindBy(xpath = "//input[@name='child_base']")
	WebElement childBaseInput;

	@FindBy(xpath = "//input[@name='no_of_max_children']")
	WebElement maxChildrenInput;

	@FindBy(xpath = "//input[@name='max_pax']")
	WebElement maxPaxInput;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancelRoomButton;

	@FindBy(xpath = "//button[normalize-space()='Create Room']")
	WebElement createRoomSubmitButton;

	@FindBy(xpath = "//button[normalize-space()='Update Room']")
	WebElement updateRoomButton;

	@FindBy(xpath = "//input[@placeholder=' Meal Plan']")
	WebElement mealPlanDropDown;

	@FindBy(xpath = "//input[@name='rate_plan_name']")
	WebElement ratePlanNameInput;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancelRateplanButton;

	@FindBy(xpath = "//button[normalize-space()='Create Rate Plan']")
	WebElement createRatePlanSubmitButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room']/ancestor::div[contains(@class,'room-card')]//tr[td[normalize-space()='EP']]//span[contains(@class,'room-card-slider')]")
	WebElement epRateplanStatusButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room']/ancestor::div[contains(@class,'room-card')]//tr[td[normalize-space()='CP']]//span[contains(@class,'room-card-slider')]")
	WebElement cpRateplanStatusButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room']/ancestor::div[contains(@class,'room-card')]//tr[td[normalize-space()='EP']]//button[normalize-space()='Edit']")
	WebElement epRateplanEditButton;

	@FindBy(xpath = "//h3[normalize-space()='Test Room']/ancestor::div[contains(@class,'room-card')]//tr[td[normalize-space()='CP']]//button[normalize-space()='Edit']")
	WebElement cpRateplanEditButton;

	@FindBy(xpath = "//button[normalize-space()='Update Rate Plan']")
	WebElement updateRateplanButton;

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopupOfUpdateRoom;

	@FindBy(xpath = "//div[@class='snackbar info']")
	WebElement discardedPopupOfRoom;

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopupOfUpdateRateplan;

	// Actions
	public boolean roomsPageConfirmation() {

		return roomsPageConf.isDisplayed();
	}

	public void clickOnCreateNewRoomButton() {
		createNewRoomButton.click();
	}

	public void updateDisplayName() throws IOException {

		displayNameInput.click();
		displayNameInput.sendKeys(Keys.CONTROL + "a");
		displayNameInput.sendKeys(Keys.DELETE);
		String displayName = BaseClass.getProperties().getProperty("DisplayName");
		displayNameInput.sendKeys(displayName);
	}

	public void updateDescription() throws IOException {

		descriptionInput.clear();
		String description = BaseClass.getProperties().getProperty("Description");
		descriptionInput.sendKeys(description);
	}

	public void updateNumberOfRooms() throws IOException {

		numberOfRoomsInput.clear();
		String numberOfRooms = BaseClass.getProperties().getProperty("NumberOfRooms");
		numberOfRoomsInput.sendKeys(numberOfRooms);
	}

	public void updateRoomType() throws IOException {

		roomTypeDropDown.clear();

		String roomType = BaseClass.getProperties().getProperty("RoomType");
		roomTypeDropDown.sendKeys(roomType);
		roomTypeDropDown.sendKeys(Keys.DOWN);
		roomTypeDropDown.sendKeys(Keys.ENTER);

	}

	public void updateRoomView() throws IOException {

		roomViewDropDown.clear();

		String roomView = BaseClass.getProperties().getProperty("RoomView");
		roomViewDropDown.sendKeys(roomView);
		roomViewDropDown.sendKeys(Keys.DOWN);
		roomViewDropDown.sendKeys(Keys.ENTER);
	}

	public void updateBedType() throws IOException {
		
		bedTypeDropDown.clear();

		String bedType = BaseClass.getProperties().getProperty("BedType");
		bedTypeDropDown.sendKeys(bedType);
		bedTypeDropDown.sendKeys(Keys.DOWN);
		bedTypeDropDown.sendKeys(Keys.ENTER);
	}
	
	public void updateExtraBedType() throws IOException {
		extraBedTypeDropDown.clear();

		String extraBedType = BaseClass.getProperties().getProperty("ExtraBedType");
		extraBedTypeDropDown.sendKeys(extraBedType);
		extraBedTypeDropDown.sendKeys(Keys.DOWN);
		extraBedTypeDropDown.sendKeys(Keys.ENTER);
	}

	public void updateBaseAdults() throws IOException {
		baseAdultsInput.clear();
		String baseAdults = BaseClass.getProperties().getProperty("BaseAdults");
		baseAdultsInput.sendKeys(baseAdults);
	}

	public void updateMaximumAdults() throws IOException {
		maxAdultsInput.clear();
		String maximumAdults = BaseClass.getProperties().getProperty("MaximumAdults");
		maxAdultsInput.sendKeys(maximumAdults);
	}

	public void updateChildBase() throws IOException {
		childBaseInput.clear();
		String childBase = BaseClass.getProperties().getProperty("ChildBase");
		childBaseInput.sendKeys(childBase);
	}

	public void updateMaximumChildren() throws IOException {
		maxChildrenInput.clear();
		String maximumChildren = BaseClass.getProperties().getProperty("MaximumChildren");
		maxChildrenInput.sendKeys(maximumChildren);
	}

	public void updateMaxPax() throws IOException {
		maxPaxInput.clear();
		String maxPax = BaseClass.getProperties().getProperty("MaxPax");
		maxPaxInput.sendKeys(maxPax);
	}

	public void clickOnCancelRoomButton() {
		cancelRoomButton.click();
	}

	public void clickOnCreateRoomButton() {
		createRoomSubmitButton.click();
	}

	public void clickOnUpdateRoomButton() {
		updateRoomButton.click();
	}
	
	public String waitAndGetSuccessMessageOfRoom() {

		WebElement roomPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfUpdateRoom));
		return roomPopup.getText().trim();
	}

	public void waitForSuccessPopupOfRoomToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupOfUpdateRoom));
	}

	public void waitForChangesDiscardedPopupOfRoomToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(discardedPopupOfRoom));
	}

	public void clickOnRoomStatusToggle() {
		testRoomStatusToggle.click();
	}

	public void clickOnEditRoomButton() {

		editTestRoomButton.click();
	}

	public void clickOnCreateRateplanButton() {
		createTestRatePlanButton.click();
	}
	
	public void selectMealPlan() throws IOException {
		
		String mealPlan = BaseClass.getProperties().getProperty("MealPlan");
		mealPlanDropDown.sendKeys(mealPlan);
		mealPlanDropDown.sendKeys(Keys.DOWN);
		mealPlanDropDown.sendKeys(Keys.ENTER);
	}

	public void updateRatePlanName() throws IOException {
		
		ratePlanNameInput.click();
		ratePlanNameInput.sendKeys(Keys.CONTROL + "a");
		ratePlanNameInput.sendKeys(Keys.DELETE);
		String RateplanName = BaseClass.getProperties().getProperty("RatePlanName");
		ratePlanNameInput.sendKeys(RateplanName);
	}

	public void clickOnCancelRateplanButton() {
		cancelRateplanButton.click();
	}

	public void clickOnCreateRateplanSubmitButton() {
		createRatePlanSubmitButton.click();
	}
	
	public void clickOnUpdateRateplanButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(updateRateplanButton));
		updateRateplanButton.click();
	}

	public void clickOnShowRateplanButton() {
		showHideTestRatePlansButton.click();
	}

	public void clickOnHideRateplanButton() {
		showHideTestRatePlansButton.click();
	}

	public void clickOnEPRateplanStatusToggle() {
		epRateplanStatusButton.click();
	}

	public void clickOnCPRateplanStatusToggle() {
		cpRateplanStatusButton.click();
	}

	public void clickOnEPRateplanEditButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(epRateplanEditButton));
		epRateplanEditButton.click();
	}

	public void clickOnCPRateplanEditButton() {
		cpRateplanEditButton.click();
	}

	public String waitAndGetSuccessMessageOfRateplan() {

		WebElement rateplanPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfUpdateRateplan));
		return rateplanPopup.getText().trim();
	}
	
	public void waitForSuccessPopupOfRateplanToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupOfUpdateRateplan));
	}

}
