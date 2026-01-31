package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class CancellationPolicyPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	
	private String cancellationchargesfornoshow;

	public CancellationPolicyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Policies'][@class='form-header']")
	WebElement cancellationPolicyPageConfirmation;

	@FindBy(xpath = "//button[normalize-space()='Create Policy']")
	WebElement createPolicyButton;

	@FindBy(xpath = "//input[@id='Start Date']")
	WebElement startDateInput;

	@FindBy(xpath = "//input[@id='End Date']")
	WebElement endDateInput;

	@FindBy(xpath = "//input[@name='cancellation']")
	WebElement freeCancellationDays;

	@FindBy(css = "#noRefund")
	WebElement noRefundWithinDaysRadioButton;

	@FindBy(css = "#createCancellationCharges")
	WebElement createCancellationChargesRadioButton;

	@FindBy(xpath = "//input[@id='Cancellation charges for No-Show (%)']")
	WebElement cancellationChargesForNoShowInput;

//	@FindBy(xpath = "//div[@class='form-full-cell']//div[1]//div[1]//input[1]")
//	WebElement cancellationChargesInput;
	
	@FindBy(xpath = "//input[@id='Cancellation Charges (%)']")
	List<WebElement> cancellationChargesInputs;

//	@FindBy(xpath = "//div[@class='form-main-layout']//div[1]//div[3]//input[1]")
//	WebElement daysBeforeCheckinDateInput;
	
	@FindBy(xpath = "//input[@class=' dropdown-input full-page-form-input']")
	List<WebElement> daysBeforeCheckinDateInputs;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//span[@class='simpleTableV2-slider']")
	WebElement statusButton;

	@FindBy(xpath = "//tbody//tr//td[5]//*[name()='svg']")
	WebElement deleteButton;

	// Actions
	public boolean cancellationPolicyPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(cancellationPolicyPageConfirmation));
		return cancellationPolicyPageConfirmation.isDisplayed();
	}

	public void clickOnCreatePolicyButton() {

		wait.until(ExpectedConditions.elementToBeClickable(createPolicyButton));
		createPolicyButton.click();
	}

	public void selectStartDate() {

		wait.until(ExpectedConditions.visibilityOf(startDateInput));
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		startDateInput.sendKeys(todayDate);
	}

	public void selectEndDate() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(endDateInput));
		String enddate = BaseClass.getProperties().getProperty("EndDateOfCancellationPolicy");
		endDateInput.sendKeys(enddate);
	}
	
	public void enterFreeCancellationDays() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(freeCancellationDays));
		String freecancellationdays = BaseClass.getProperties().getProperty("FreeCancellationDays");
		freeCancellationDays.sendKeys(freecancellationdays);
	}
	
	public void selectNoRefundIfCancelledWithinDays() {
		
		wait.until(ExpectedConditions.elementToBeClickable(noRefundWithinDaysRadioButton));
		noRefundWithinDaysRadioButton.click();
	}
	
	public void selectCreateCancellationCharges() {
		
		wait.until(ExpectedConditions.elementToBeClickable(createCancellationChargesRadioButton));
		createCancellationChargesRadioButton.click();
	}
	
	public void enterCancellationChargesForNoShow() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(cancellationChargesForNoShowInput));
		cancellationchargesfornoshow = BaseClass.getProperties().getProperty("CancellationChargesForNoShow");
		cancellationChargesForNoShowInput.sendKeys(cancellationchargesfornoshow);
	}
	
	public void enterCancellationCharges() throws IOException {
		
		String noShowValue =
		        BaseClass.getProperties().getProperty("CancellationChargesForNoShow");

		int totalRows = cancellationChargesInputs.size(); // 

		for (int i = 0; i < totalRows; i++) {

		    String cancellationCharge =
		            BaseClass.getProperties()
		                    .getProperty("CancellationChargesInPercentage" + getOrder(i));

		    String daysBeforeCheckin =
		            BaseClass.getProperties()
		                    .getProperty("DaysBeforeCheckinDate" + getOrder(i));

		    cancellationChargesInputs.get(i).sendKeys(cancellationCharge);

		    daysBeforeCheckinDateInputs.get(i).sendKeys(daysBeforeCheckin);
		    daysBeforeCheckinDateInputs.get(i).sendKeys(Keys.DOWN);
		    daysBeforeCheckinDateInputs.get(i).sendKeys(Keys.ENTER);

		    if (daysBeforeCheckin.equalsIgnoreCase(noShowValue)) {
		        break;
		    }
		}

		clickOnSaveButton();

	}
	
	private String getOrder(int index) {
	    switch (index) {
	        case 0: return "First";
	        case 1: return "Second";
	        case 2: return "Third";
	        case 3: return "Fourth";
	        default: throw new IllegalArgumentException("Unsupported index: " + index);
	    }
	}

	
	
	public void clickOnSaveButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
	}
	
	public void clickOnDeletePolicyButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
		deleteButton.click();
	}
}
