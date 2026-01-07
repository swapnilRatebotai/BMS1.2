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
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public RoomsPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[text()='Rooms'][@class='form-header']")
	WebElement roomsPgConf;

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

	@FindBy(xpath = "//li[normalize-space()='Deluxe']")
	WebElement selectRoomTypeDeluxe;

	@FindBy(xpath = "//li[normalize-space()='Standard']")
	WebElement selectRoomTypeStandard;

	@FindBy(xpath = "//li[normalize-space()='Luxury']")
	WebElement selectRoomTypeLuxury;

	@FindBy(xpath = "//li[normalize-space()='Master']")
	WebElement selectRoomTypeMaster;

	@FindBy(xpath = "//li[normalize-space()='Common']")
	WebElement selectRoomTypeCommon;

	@FindBy(xpath = "//li[normalize-space()='Tent']")
	WebElement selectRoomTypeTent;

	@FindBy(xpath = "//li[normalize-space()='Family room']")
	WebElement selectRoomTypeFamilyRoom;

	@FindBy(xpath = "//li[normalize-space()='Water Villa']")
	WebElement selectRoomTypeWaterVilla;

	@FindBy(xpath = "//li[normalize-space()='Beach Villa']")
	WebElement selectRoomTypeBeachVilla;

	@FindBy(xpath = "//li[normalize-space()='For Honeymooners']")
	WebElement selectRoomTypeForHoneymooners;

	@FindBy(xpath = "//li[normalize-space()='Garden villa']")
	WebElement selectRoomTypeGardenVilla;

	@FindBy(xpath = "//li[normalize-space()='Suite']")
	WebElement selectRoomTypeSuite;

	@FindBy(xpath = "//li[normalize-space()='Other']")
	WebElement selectRoomTypeOther;

	@FindBy(xpath = "//input[@placeholder=' Room View']")
	WebElement roomViewDropDown;

	@FindBy(xpath = "//li[normalize-space()='Sea view']")
	WebElement selectRoomViewSea;

	@FindBy(xpath = "//li[normalize-space()='Valley view']")
	WebElement selectRoomViewValley;

	@FindBy(xpath = "//input[@placeholder=' Bed Type']")
	WebElement bedTypeDropDown;

	@FindBy(xpath = "//li[normalize-space()='King Bed']")
	WebElement selectBedTypeKing;

	@FindBy(xpath = "//li[normalize-space()='Queen Bed']")
	WebElement selectBedTypeQueen;

	@FindBy(xpath = "//input[@placeholder=' Extra Bed Type']")
	WebElement extraBedTypeDropDown;

	@FindBy(xpath = "//li[normalize-space()='Mattress']")
	WebElement selectExtraBedTypeMattress;

	@FindBy(xpath = "//li[normalize-space()='Sofa cum bed']")
	WebElement selectExtraBedTypeSofacumbed;

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

	@FindBy(xpath = "//li[normalize-space()='Accommodation only']")
	WebElement selectMealPlanEP;

	@FindBy(xpath = "//li[normalize-space()='FREE Breakfast']")
	WebElement selectMealPlanCP;

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

		return roomsPgConf.isDisplayed();
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

	public void updateMealPlanToEP() {
		mealPlanDropDown.click();
		selectMealPlanEP.click();
	}

	public void updateMealPlanToCP() {
		mealPlanDropDown.click();
		selectMealPlanCP.click();
	}

	public void updateRatePlanName() throws IOException {
		ratePlanNameInput.clear();
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
		epRateplanEditButton.click();
	}

	public void clickOnCPRateplanEditButton() {
		cpRateplanEditButton.click();
	}

	public String waitAndGetSuccessMessageOfRateplan() {

		WebElement rateplanPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfUpdateRateplan));
		return rateplanPopup.getText().trim();
	}

}
