package pageObjects;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class RateAndInventoryPage extends BasePage {

	WebDriver driver;

	public RateAndInventoryPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[@class='cm-header']")
	WebElement rateAndInventoryPgConf;

	@FindBy(xpath = "//button[normalize-space()='Show Rateplans']")
	WebElement showRateplanButton;

	@FindBy(xpath = "//button[normalize-space()='Hide Rateplans']")
	WebElement hideRateplanButton;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='applayout']/div[@class='mainlayout']/div[@class='content']/div[@class='cm-main']/div[@class='cm-rate-avalability-main']/div[1]/div[1][1]/button[1]/div[1]")
	WebElement collapseRoomButton;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='applayout']/div[@class='mainlayout']/div[@class='content']/div[@class='cm-main']/div[@class='cm-rate-avalability-main']/div[1]/div[1][1]/button[1]/div[1]")
	WebElement expandRoomButton;

	@FindBy(xpath = "//input[@id='Choose a date']")
	WebElement calenderInput;

	@FindBy(xpath = "//button[normalize-space()='<']")
	WebElement backCalenderChartButton;

	@FindBy(xpath = "//button[normalize-space()='>']")
	WebElement nextCalenderChartButton;

	@FindBy(xpath = "//button[normalize-space()='Bulk update']")
	WebElement bulkUpdateButton;

	@FindBy(xpath = "//button[normalize-space()='Inventory']")
	WebElement inventoryButton;

	@FindBy(xpath = "//button[normalize-space()='Rate']")
	WebElement rateButton;

	@FindBy(xpath = "//input[@id='Select From Date']")
	WebElement fromDateInput;

	@FindBy(xpath = "//input[@id='Select To Date']")
	WebElement toDateInput;

	@FindBy(xpath = "//input[@placeholder=' Select Room Type']")
	WebElement roomTypeDropdown;

	@FindBy(xpath = "//li[normalize-space()='Test Room']")
	WebElement testRoom;

	@FindBy(xpath = "//button[normalize-space()='M']")
	WebElement mondayButton;

	@FindBy(xpath = "//button[normalize-space()='T'][1]")
	WebElement tuesdayButton;

	@FindBy(xpath = "//button[normalize-space()='W']")
	WebElement wednesdayButton;

	@FindBy(xpath = "//button[normalize-space()='T'][2]")
	WebElement thursdayButton;

	@FindBy(xpath = "//button[normalize-space()='F']")
	WebElement fridayButton;

	@FindBy(xpath = "//button[normalize-space()='S'][1]")
	WebElement saturdayButton;

	@FindBy(xpath = "//button[normalize-space()='S'][2]")
	WebElement sundayButton;

	@FindBy(xpath = "//input[@placeholder='Number of rooms to sell']")
	WebElement numberOfRoomsToSellInput;

	@FindBy(xpath = "//input[@placeholder=' Select Rate Plan Type']")
	WebElement rateplanTypeDropdown;

	@FindBy(xpath = "//li[normalize-space()='EP']")
	WebElement epRateplan;

	@FindBy(xpath = "//li[normalize-space()='CP']")
	WebElement cpRateplan;

	@FindBy(xpath = "//li[normalize-space()='MAP']")
	WebElement mapRateplan;

	@FindBy(xpath = "//li[normalize-space()='AP']")
	WebElement apRateplan;

	@FindBy(xpath = "//input[@placeholder='Enter Rate for 1 occupancy']")
	WebElement firstOccupancyInput;

	@FindBy(xpath = "//input[@placeholder='Enter Rate for 2 occupancy']")
	WebElement secondOccupancyInput;

	@FindBy(xpath = "//input[@placeholder='Enter Rate for 3 occupancy']")
	WebElement thirdOccupancyInput;

	@FindBy(xpath = "//input[@placeholder='Enter Rate for 4 occupancy']")
	WebElement fourthOccupancyInput;

	@FindBy(css = "#extra_adult")
	WebElement extraAdultRateInput;

	@FindBy(css = "#extra_child")
	WebElement extraChildRateInput;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitButton;

	// Actions
	public boolean rateAndInventoryPageConfirmation() {

		return rateAndInventoryPgConf.isDisplayed();
	}

	public void clickOnShowRateplans() {

		showRateplanButton.click();
	}

	public void clickOnHideRateplans() {

		hideRateplanButton.click();
	}

	public void clickOnExpandRoomButton() {

		expandRoomButton.click();
	}

	public void clickOnCollapseRoomButton() {

		collapseRoomButton.click();
	}

	public void selectTodaysDate() {

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		calenderInput.sendKeys(todayDate);
	}

	public void selectDateOfCalenderChart() throws IOException {

		String customdate = BaseClass.getProperties().getProperty("DateOfRateAndInventory");
		calenderInput.sendKeys(customdate);
	}

	public void clickOnBackButtonOfCalenderChart() {

		backCalenderChartButton.click();
	}

	public void clickOnNextButtonOfCalenderChart() {

		nextCalenderChartButton.click();
	}

	public void clickOnBulkUpdateButton() {

		bulkUpdateButton.click();
	}

	public void clickOnInventoryButton() {

		inventoryButton.click();
	}

	public void clickOnRateButton() {

		rateButton.click();
	}

	public void selectFromDateAsToday() {

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		fromDateInput.sendKeys(todayDate);
	}

	public void selectFromDate() throws IOException {

		String customdate = BaseClass.getProperties().getProperty("FromDateOfRateAndInventory");
		fromDateInput.sendKeys(customdate);
	}

	public void selectToDate() throws IOException {

		String customdate = BaseClass.getProperties().getProperty("ToDateOfRateAndInventory");
		toDateInput.sendKeys(customdate);
	}

	public void selectRoomTypeAsTestRoom() {

		roomTypeDropdown.click();
		testRoom.click();
	}

	public void enterNumberOfRoomsToSell() throws IOException {

		String numberofrooms = BaseClass.getProperties().getProperty("NumberOfRoomsToSellInput");
		numberOfRoomsToSellInput.sendKeys(numberofrooms);
	}

	public void selectDays() {

		
	}

	public void selectRatePlanType() throws IOException {

		rateplanTypeDropdown.click();
		String rateplan = BaseClass.getProperties().getProperty("RatePlan");

		if (rateplan.equalsIgnoreCase("EP")) {

			epRateplan.click();
		} else if (rateplan.equalsIgnoreCase("CP")) {

			cpRateplan.click();
		} else if (rateplan.equalsIgnoreCase("MAP")) {

			mapRateplan.click();
		} else if (rateplan.equalsIgnoreCase("AP")) {

			apRateplan.click();
		} else {
			System.out.println("Rateplan is invalid");
		}
	}

	public void enterRateForFirstOccupancy() throws IOException {

		String firstoccupancy = BaseClass.getProperties().getProperty("FirstOccupancyRate");
		firstOccupancyInput.sendKeys(firstoccupancy);
	}

	public void enterRateForSecondOccupancy() throws IOException {

		String secondoccupancy = BaseClass.getProperties().getProperty("SecondOccupancyRate");
		secondOccupancyInput.sendKeys(secondoccupancy);
	}

	public void enterRateForThirdOccupancy() throws IOException {

		String thirdoccupancy = BaseClass.getProperties().getProperty("ThirdOccupancyRate");
		thirdOccupancyInput.sendKeys(thirdoccupancy);
	}

	public void enterRateForFourthtOccupancy() throws IOException {

		String fourthoccupancy = BaseClass.getProperties().getProperty("FourthOccupancyRate");
		fourthOccupancyInput.sendKeys(fourthoccupancy);
	}

	public void enterExtraAdultRate() throws IOException {

		String extraadult = BaseClass.getProperties().getProperty("ExtraAdultRate");
		extraAdultRateInput.sendKeys(extraadult);
	}

	public void enterExtraChildRate() throws IOException {

		String extrachild = BaseClass.getProperties().getProperty("ExtraChildRate");
		extraAdultRateInput.sendKeys(extrachild);
	}

	public void clickOnCancelButton() {

		cancelButton.click();
	}

	public void clickOnSubmitButton() {

		submitButton.click();
	}
}
