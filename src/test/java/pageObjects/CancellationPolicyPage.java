package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class CancellationPolicyPage extends BasePage {

	WebDriver driver;
	
	private String cancellationchargesfornoshow;

	public CancellationPolicyPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[text()='Policies'][@class='form-header']")
	WebElement cancellationPolicyPgConf;

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
		return cancellationPolicyPgConf.isDisplayed();
	}

	public void clickOnCreatePolicyButton() {

		createPolicyButton.click();
	}

	public void selectStartDate() throws IOException {

		String startdate = BaseClass.getProperties().getProperty("StartDateOfCancellationPolicy");
		startDateInput.sendKeys(startdate);
	}

	public void selectEndDate() throws IOException {

		String enddate = BaseClass.getProperties().getProperty("EndDateOfCancellationPolicy");
		endDateInput.sendKeys(enddate);
	}
	
	public void enterFreeCancellationDays() throws IOException {
		
		String freecancellationdays = BaseClass.getProperties().getProperty("FreeCancellationDays");
		freeCancellationDays.sendKeys(freecancellationdays);
	}
	
	public void selectNoRefundIfCancelledWithinDays() {
		
		noRefundWithinDaysRadioButton.click();
	}
	
	public void selectCreateCancellationCharges() {
		
		createCancellationChargesRadioButton.click();
	}
	
	public void enterCancellationChargesForNoShow() throws IOException {
		
		cancellationchargesfornoshow = BaseClass.getProperties().getProperty("CancellationChargesForNoShow");
		cancellationChargesForNoShowInput.sendKeys(cancellationchargesfornoshow);
	}
	
	public void enterCancellationCharges() throws IOException {
		
		String cancellationchargesfirst = BaseClass.getProperties().getProperty("CancellationChargesInPercentageFirst");
		String daysbeforecheckindatefirst = BaseClass.getProperties().getProperty("DaysBeforeCheckinDateFirst");
		
		cancellationChargesInputs.get(0).sendKeys(cancellationchargesfirst);
		daysBeforeCheckinDateInputs.get(0).sendKeys(daysbeforecheckindatefirst);
		daysBeforeCheckinDateInputs.get(0).sendKeys(Keys.DOWN);
		daysBeforeCheckinDateInputs.get(0).sendKeys(Keys.ENTER);
		
		if(!daysbeforecheckindatefirst.equalsIgnoreCase(cancellationchargesfornoshow)) {
			
			String cancellationchargessecond = BaseClass.getProperties().getProperty("CancellationChargesInPercentageSecond");
			String daysbeforecheckindatesecond = BaseClass.getProperties().getProperty("DaysBeforeCheckinDateSecond");
			
			cancellationChargesInputs.get(1).sendKeys(cancellationchargessecond);
			daysBeforeCheckinDateInputs.get(1).sendKeys(daysbeforecheckindatesecond);
			daysBeforeCheckinDateInputs.get(1).sendKeys(Keys.DOWN);
			daysBeforeCheckinDateInputs.get(1).sendKeys(Keys.ENTER);
			
			if(!daysbeforecheckindatesecond.equalsIgnoreCase(cancellationchargesfornoshow)) {
				
				String cancellationchargesthird = BaseClass.getProperties().getProperty("CancellationChargesInPercentageThird");
				String daysbeforecheckindatethird = BaseClass.getProperties().getProperty("DaysBeforeCheckinDateThird");
				
				cancellationChargesInputs.get(2).sendKeys(cancellationchargesthird);
				daysBeforeCheckinDateInputs.get(2).sendKeys(daysbeforecheckindatethird);
				daysBeforeCheckinDateInputs.get(2).sendKeys(Keys.DOWN);
				daysBeforeCheckinDateInputs.get(2).sendKeys(Keys.ENTER);
			}
			else {
				saveButton.click();
			}
		}
		else {
			
			saveButton.click();
		}
	}
	
	
	public void clickOnSaveButton() {
		
		saveButton.click();
	}
	
	public void clickOnDeletePolicyButton() {
		
		deleteButton.click();
	}
}
