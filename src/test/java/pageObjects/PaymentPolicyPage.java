package pageObjects;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class PaymentPolicyPage extends BasePage{

	WebDriver driver;

	public PaymentPolicyPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Payment Policies'][@class='form-header']")
		WebElement paymentPolicyPgConf;
		
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
			
			return paymentPolicyPgConf.isDisplayed();
		}
		
		public void clickOnCreatePaymentPolicyButton() {
			
			createPaymentPolicyButton.click();
		}
		
		public void selectStartDate() throws IOException {
			
			LocalDate today = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String todayDate = today.format(formatter);
			startDateInput.sendKeys(todayDate);
		}
		
		public void selectEndDate() throws IOException {

			String enddate = BaseClass.getProperties().getProperty("EndDateOfPaymentPolicy");
			endDateInput.sendKeys(enddate);
		}
		
		public void enterPaymentPercentage() throws IOException {
			
			String paymentpercentage = BaseClass.getProperties().getProperty("PaymentPercentage");
			paymentPercentageInput.sendKeys(paymentpercentage);
		}
		
		public void clickOnCancelButton() {
			
			cancelButton.click();
		}
		
		public void clickOnSaveButton() {
			
			submitButton.click();
		}
		
		public void clickOnDeleteButton() {
			
			deleteButton.click();
		}
		
		
}
