package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(xpath = "//li[normalize-space()='Standard']")
	WebElement selectRoomTypeStandard;

	@FindBy(xpath = "//li[normalize-space()='Master']")
	WebElement selectRoomTypeMaster;

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
	WebElement successPopupForRoom;
	
	@FindBy(xpath = "//div[@class='snackbar info']")
	WebElement discardedPopupForRoom;
	
	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopupForRateplan;

	// Actions
	public boolean roomsPageConfirmation() {

		return roomsPgConf.isDisplayed();
	}
	
	public void clickOnCreateNewRoomButton() {
		createNewRoomButton.click();
	}

	public void updateDisplayName(String displayname) {

		displayNameInput.clear();
		displayNameInput.sendKeys(displayname);
	}

	public void updateDescription(String description) {

		descriptionInput.clear();
		descriptionInput.sendKeys(description);
	}

	public void updateNumberOfRooms(String numberofrooms) {
		numberOfRoomsInput.clear();
		numberOfRoomsInput.sendKeys(numberofrooms);
	}

	public void updateRoomTypeToStandard() {

		roomTypeDropDown.click();
		selectRoomTypeStandard.click();
	}

	public void updateRoomTypeToMaster() {

		roomTypeDropDown.click();
		selectRoomTypeMaster.click();
	}

	public void updateRoomViewToSea() {
		roomViewDropDown.click();
		selectRoomViewSea.click();
	}

	public void updateRoomViewToValley() {
		roomViewDropDown.click();
		selectRoomViewValley.click();
	}

	public void updateBedTypeToKing() {
		bedTypeDropDown.click();
		selectBedTypeKing.click();
	}

	public void updateBedTypeToQueen() {
		bedTypeDropDown.click();
		selectBedTypeQueen.click();
	}

	public void updateExtraBedTypeToMattress() {
		extraBedTypeDropDown.click();
		selectExtraBedTypeMattress.click();
	}

	public void updateExtraBedTypeToSofacumbed() {
		extraBedTypeDropDown.click();
		selectExtraBedTypeSofacumbed.click();
	}

	public void updateBaseAdults(String baseadults) {
		baseAdultsInput.clear();
		baseAdultsInput.sendKeys(baseadults);
	}

	public void updateMaximumAdults(String maximumadults) {
		maxAdultsInput.clear();
		maxAdultsInput.sendKeys(maximumadults);
	}

	public void updateChildBase(String childbase) {
		childBaseInput.clear();
		childBaseInput.sendKeys(childbase);
	}

	public void updateMaximumChildren(String maximumchildren) {
		maxChildrenInput.clear();
		maxChildrenInput.sendKeys(maximumchildren);
	}

	public void updateMaxPax(String maxpax) {
		maxPaxInput.clear();
		maxPaxInput.sendKeys(maxpax);
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

	public void waitForSuccessPopupForRoomToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupForRoom));
	}
	
	public void waitForChangesDiscardedPopupForRoomToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(discardedPopupForRoom));
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
	
	public void updateRatePlanName(String rateplanname) {
		ratePlanNameInput.clear();
		ratePlanNameInput.sendKeys(rateplanname);
	}
	
	public void clickOnCancelRateplanButton() {
		cancelRateplanButton.click();
	}
	
	public void clickOnCreateRateplanSubmitButton() {
		createRatePlanSubmitButton.click();
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
	
	public void waitForSuccessPopupForRateplanToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupForRateplan));
	}

}
