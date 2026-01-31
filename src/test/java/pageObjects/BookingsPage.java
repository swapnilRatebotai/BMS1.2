package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
import org.junit.Assert;

public class BookingsPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public BookingsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Elements

	@FindBy(xpath = "//h1[normalize-space()='Bookings']")
	WebElement bookingsPageConfirmation;

	@FindBy(css = "#fromDate")
	WebElement fromDateInput;

	@FindBy(css = "#toDate")
	WebElement toDateInput;

	@FindBy(css = "#bookingStatus")
	WebElement bookingStatusDropdown;

	@FindBy(css = "#dateFilterType")
	WebElement dateFilterTypeDropdown;

	@FindBy(xpath = "//span[normalize-space()='CONFIRMED']")
	WebElement confirmedStatusText;

	@FindBy(xpath = "//span[normalize-space()='CANCELLED']")
	WebElement cancelledStatusText;

	@FindBy(xpath = "//a[@title='Chat on WhatsApp']//*[name()='svg']")
	WebElement whatsappIcon;

	@FindBy(xpath = "//tr[@class='table-row']//td//span[a[contains(@href,'wa.me')]]")
	WebElement whatsappNumberTextOnBMS;

	@FindBy(xpath = "//a[contains(@href,'api.whatsapp.com')]")
	WebElement whatsappUrl;

	// Actions

	public boolean bookingsPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(bookingsPageConfirmation));
		return bookingsPageConfirmation.isDisplayed();
	}

	public void selectFromDate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(fromDateInput));
		String fromdate = BaseClass.getProperties().getProperty("FromDateOfBookings");
		fromDateInput.sendKeys(fromdate);
	}

	public void selectToDate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(toDateInput));
		String todate = BaseClass.getProperties().getProperty("ToDateOfBookings");
		toDateInput.sendKeys(todate);
	}

	public void selectTodaysDate() {

		wait.until(ExpectedConditions.visibilityOf(toDateInput));
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		toDateInput.sendKeys(todayDate);
	}

	public void selectBookingStatusToConfirmed() {

		wait.until(ExpectedConditions.elementToBeClickable(bookingStatusDropdown));
		bookingStatusDropdown.click();
		bookingStatusDropdown.sendKeys(Keys.UP);
		bookingStatusDropdown.sendKeys(Keys.ENTER);
	}

	public void selectBookingStatusToCancelled() {

		wait.until(ExpectedConditions.elementToBeClickable(bookingStatusDropdown));
		bookingStatusDropdown.click();
		bookingStatusDropdown.sendKeys(Keys.DOWN);
		bookingStatusDropdown.sendKeys(Keys.ENTER);
	}

	public boolean confirmedBookingStatusConfirmation() {

		wait.until(ExpectedConditions.visibilityOf(confirmedStatusText));
		return confirmedStatusText.isDisplayed();
	}

	public boolean cancelledBookingStatusConfirmation() {

		wait.until(ExpectedConditions.visibilityOf(cancelledStatusText));
		return cancelledStatusText.isDisplayed();
	}

	public void clickOnWhatsappToConnectCustomer() {

		wait.until(ExpectedConditions.visibilityOf(whatsappNumberTextOnBMS));
		String mobileNumber = whatsappNumberTextOnBMS.getText().replaceAll("\\D", "");

		String parentWindow = driver.getWindowHandle();

		wait.until(ExpectedConditions.elementToBeClickable(whatsappIcon));
		whatsappIcon.click();

		wait.until(d -> d.getWindowHandles().size() > 1);

		for (String win : driver.getWindowHandles()) {
			if (!win.equals(parentWindow)) {
				driver.switchTo().window(win);
				break;
			}
		}

		String url = driver.getCurrentUrl();
		String actualNumber = url.split("phone=")[1].split("&")[0];
		
		actualNumber = actualNumber.replaceAll("\\D", "");
		actualNumber = actualNumber.substring(actualNumber.length() - 10);

		Assert.assertEquals(mobileNumber, actualNumber);

		driver.close();
		driver.switchTo().window(parentWindow);
	}

	public void selectCheckinFilter() {

		wait.until(ExpectedConditions.visibilityOf(dateFilterTypeDropdown));
		dateFilterTypeDropdown.click();
		dateFilterTypeDropdown.sendKeys(Keys.UP);
		dateFilterTypeDropdown.sendKeys(Keys.ENTER);
	}

	public void selectCheckoutFilter() {

		wait.until(ExpectedConditions.visibilityOf(dateFilterTypeDropdown));
		dateFilterTypeDropdown.click();
		dateFilterTypeDropdown.sendKeys(Keys.DOWN);
		dateFilterTypeDropdown.sendKeys(Keys.ENTER);
	}

}
