package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class PaymentPolicyPage extends BasePage{

	WebDriver driver;
	WebDriverWait wait;

	public PaymentPolicyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Payment Policies'][@class='form-header']")
		WebElement paymentPolicyPageConfirmation;
		
		@FindBy(xpath="//button[normalize-space()='Create Payment Policy']")
		WebElement createPaymentPolicyButton;
		
		@FindBy(xpath="//input[@id='Start Date']")
		WebElement startDateInput;
		
		@FindBy(xpath="//input[@id='End Date']")
		WebElement endDateInput;
		
		@FindBy(xpath="//input[@id='Payment Percentage']")
		WebElement paymentPercentageInput;
		
		@FindBy(xpath="//button[normalize-space()='Cancel']")
		WebElement cancelButton;
		
		@FindBy(xpath="//button[normalize-space()='Submit']")
		WebElement submitButton;
		
		@FindBy(xpath="//tbody/tr[1]/td[5]//*[name()='svg']")
		WebElement deleteButton;
		
		
		
		
		//Actions
		public boolean PaymentPolicyPageConfirmation() {
			
			wait.until(ExpectedConditions.visibilityOf(paymentPolicyPageConfirmation));
			return paymentPolicyPageConfirmation.isDisplayed();
		}
		
		public void clickOnCreatePaymentPolicyButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(createPaymentPolicyButton));
			createPaymentPolicyButton.click();
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
			String enddate = BaseClass.getProperties().getProperty("EndDateOfPaymentPolicy");
			endDateInput.sendKeys(enddate);
		}
		
		public void enterPaymentPercentage() throws IOException {
			
			wait.until(ExpectedConditions.visibilityOf(paymentPercentageInput));
			String paymentpercentage = BaseClass.getProperties().getProperty("PaymentPercentage");
			paymentPercentageInput.sendKeys(paymentpercentage);
		}
		
		public void clickOnCancelButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
			cancelButton.click();
		}
		
		public void clickOnSaveButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(submitButton));
			submitButton.click();
		}
		
		public void clickOnDeleteButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
			deleteButton.click();
		}
}
