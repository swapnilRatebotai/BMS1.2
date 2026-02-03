package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class RateAndInventoryPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public RateAndInventoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		this.js = (JavascriptExecutor) driver;
	}

	// Elements
	@FindBy(xpath = "//div[@class='cm-header']")
	WebElement rateAndInventoryPageConfirmation;

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

		wait.until(ExpectedConditions.visibilityOf(rateAndInventoryPageConfirmation));
		return rateAndInventoryPageConfirmation.isDisplayed();
	}

	public void clickOnShowAllRateplans() {

		wait.until(ExpectedConditions.elementToBeClickable(showRateplanButton));
		showRateplanButton.click();
	}

	public void clickOnHideAllRateplans() {

		wait.until(ExpectedConditions.elementToBeClickable(hideRateplanButton));
		hideRateplanButton.click();
	}

	public void clickOnExpandRoomButton() {

		wait.until(ExpectedConditions.elementToBeClickable(expandRoomButton));
		expandRoomButton.click();
	}

	public void clickOnCollapseRoomButton() {

		wait.until(ExpectedConditions.elementToBeClickable(collapseRoomButton));
		collapseRoomButton.click();
	}

	public void selectTodaysDate() {

		wait.until(ExpectedConditions.visibilityOf(calenderInput));
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		calenderInput.sendKeys(todayDate);
	}

	public void selectDateOfCalenderChart() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(calenderInput));
		String customdate = BaseClass.getProperties().getProperty("DateOfRateAndInventory");
//		calenderInput.sendKeys(customdate);

		js.executeScript("arguments[0].value = arguments[1];" +
		        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
		        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
				calenderInput, customdate);
		driver.findElement(By.tagName("body")).click();
	}

	public void clickOnBackButtonOfCalenderChart() {

		wait.until(ExpectedConditions.elementToBeClickable(backCalenderChartButton));
		backCalenderChartButton.click();
	}

	public void clickOnNextButtonOfCalenderChart() {

		wait.until(ExpectedConditions.elementToBeClickable(nextCalenderChartButton));
		nextCalenderChartButton.click();
	}

	public void clickOnBulkUpdateButton() {

		wait.until(ExpectedConditions.elementToBeClickable(bulkUpdateButton));
		bulkUpdateButton.click();
	}

	public void clickOnInventoryButton() {

		wait.until(ExpectedConditions.elementToBeClickable(inventoryButton));
		inventoryButton.click();
	}

	public void clickOnRateButton() {

		wait.until(ExpectedConditions.elementToBeClickable(rateButton));
		rateButton.click();
	}

	public void selectFromDateAsToday() {

		wait.until(ExpectedConditions.visibilityOf(fromDateInput));
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		fromDateInput.sendKeys(todayDate);
	}

	public void selectFromDate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(fromDateInput));
		String customdate = BaseClass.getProperties().getProperty("FromDateOfRateAndInventory");
		fromDateInput.sendKeys(customdate);
	}

	public void selectToDate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(toDateInput));
		String todate = BaseClass.getProperties().getProperty("ToDateOfRateAndInventory");
//		toDateInput.sendKeys(todate);

//		js.executeScript("arguments[0].value=arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
		js.executeScript("arguments[0].value = arguments[1];" +
		        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
		        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
				toDateInput, todate);
		driver.findElement(By.tagName("body")).click();
	}

	public void selectRoomTypeAsTestRoom() {
		
		wait.until(ExpectedConditions.visibilityOf(roomTypeDropdown));
		roomTypeDropdown.click();
		
		wait.until(ExpectedConditions.visibilityOf(testRoom));
		testRoom.click();
	}

	public void enterNumberOfRoomsToSell() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(numberOfRoomsToSellInput));
		String numberofrooms = BaseClass.getProperties().getProperty("NumberOfRoomsToSellInput");
		numberOfRoomsToSellInput.sendKeys(numberofrooms);
	}

	public void selectDays() throws IOException {

		String monday = BaseClass.getProperties().getProperty("Monday");
		String tuesday = BaseClass.getProperties().getProperty("Tuesday");
		String wednesday = BaseClass.getProperties().getProperty("Wednesday");
		String thursday = BaseClass.getProperties().getProperty("Thursday");
		String friday = BaseClass.getProperties().getProperty("Friday");
		String saturday = BaseClass.getProperties().getProperty("Saturday");
		String sunday = BaseClass.getProperties().getProperty("Sunday");

		if (monday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(mondayButton));
			mondayButton.click();
		}
		if (tuesday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(tuesdayButton));
			tuesdayButton.click();
		}
		if (wednesday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(wednesdayButton));
			wednesdayButton.click();
		}
		if (thursday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(thursdayButton));
			thursdayButton.click();
		}
		if (friday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(fridayButton));
			fridayButton.click();
		}
		if (saturday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(saturdayButton));
			saturdayButton.click();
		}
		if (sunday.equalsIgnoreCase("no")) {

			wait.until(ExpectedConditions.elementToBeClickable(sundayButton));
			sundayButton.click();
		}

	}

	public void selectRatePlanType() throws IOException {

		wait.until(ExpectedConditions.elementToBeClickable(rateplanTypeDropdown));
		rateplanTypeDropdown.click();
		String rateplan = BaseClass.getProperties().getProperty("RatePlan");

		if (rateplan.equalsIgnoreCase("EP")) {

			wait.until(ExpectedConditions.elementToBeClickable(epRateplan));
			epRateplan.click();
		} else if (rateplan.equalsIgnoreCase("CP")) {

			wait.until(ExpectedConditions.elementToBeClickable(cpRateplan));
			cpRateplan.click();
		} else if (rateplan.equalsIgnoreCase("MAP")) {

			wait.until(ExpectedConditions.elementToBeClickable(mapRateplan));
			mapRateplan.click();
		} else if (rateplan.equalsIgnoreCase("AP")) {

			wait.until(ExpectedConditions.elementToBeClickable(apRateplan));
			apRateplan.click();
		} else {
			System.out.println("Rateplan is invalid");
		}
	}

	public void enterRateForFirstOccupancy() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(firstOccupancyInput));
		String firstoccupancy = BaseClass.getProperties().getProperty("FirstOccupancyRate");
		firstOccupancyInput.sendKeys(firstoccupancy);
	}

	public void enterRateForSecondOccupancy() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(secondOccupancyInput));
		String secondoccupancy = BaseClass.getProperties().getProperty("SecondOccupancyRate");
		secondOccupancyInput.sendKeys(secondoccupancy);
	}

	public void enterRateForThirdOccupancy() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(thirdOccupancyInput));
		String thirdoccupancy = BaseClass.getProperties().getProperty("ThirdOccupancyRate");
		thirdOccupancyInput.sendKeys(thirdoccupancy);
	}

	public void enterRateForFourthtOccupancy() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(fourthOccupancyInput));
		String fourthoccupancy = BaseClass.getProperties().getProperty("FourthOccupancyRate");
		fourthOccupancyInput.sendKeys(fourthoccupancy);
	}

	public void enterExtraAdultRate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(extraAdultRateInput));
		String extraadult = BaseClass.getProperties().getProperty("ExtraAdultRate");
		extraAdultRateInput.sendKeys(extraadult);
	}

	public void enterExtraChildRate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(extraChildRateInput));
		String extrachild = BaseClass.getProperties().getProperty("ExtraChildRate");
		extraChildRateInput.sendKeys(extrachild);
	}

	public void clickOnCancelButton() {

		wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
		cancelButton.click();
	}

	public void clickOnSubmitButton() {

		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
	}
}
