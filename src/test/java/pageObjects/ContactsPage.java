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

public class ContactsPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public ContactsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Property Contacts'][@class='form-header']")
	WebElement contactsPageConfirmation;

	@FindBy(xpath = "//input[@id='Hotel Phone']")
	WebElement hotelPhoneInput;

	@FindBy(xpath = "//input[@id='Hotel Mobile']")
	WebElement hotelMobileInput;

	@FindBy(xpath = "//input[@id='Hotel Email']")
	WebElement hotelEmailInput;

	@FindBy(xpath = "//input[@id='Phone List']")
	WebElement phoneListInput;

	@FindBy(xpath = "//input[@name='websiteList']")
	WebElement websiteInput;

	@FindBy(xpath = "//input[@id='Email List']")
	WebElement emailListInput;

	@FindBy(xpath = "//input[@id='Customer Care Number']")
	WebElement customerCareNumberInput;

	@FindBy(css = "#true")
	WebElement useCustomerCareAsWhatsappTrue;

	@FindBy(css = "#false")
	WebElement useCustomerCareAsWhatsappFalse;

	@FindBy(xpath = "//input[@id='WhatsApp Number']")
	WebElement whatsappNumberInput;

	@FindBy(xpath = "//button[normalize-space()='Update Contact']")
	WebElement updateButton;
	
	@FindBy(xpath="//button[normalize-space()='Create Contact']")
	WebElement createContactButton;

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopup;

	// Actions
	public boolean contactsPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(contactsPageConfirmation));
		return contactsPageConfirmation.isDisplayed();
	}

	public void updateHotelPhone() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(hotelPhoneInput));
		hotelPhoneInput.click();
		hotelPhoneInput.sendKeys(Keys.CONTROL + "a");
		hotelPhoneInput.sendKeys(Keys.DELETE);
		String hotelPhone = BaseClass.getProperties().getProperty("HotelPhone");
		hotelPhoneInput.sendKeys(hotelPhone);
	}

	public void updateHotelMobile() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(hotelMobileInput));
		hotelMobileInput.clear();
		String hotelMobile = BaseClass.getProperties().getProperty("HotelMobile");
		hotelMobileInput.sendKeys(hotelMobile);
	}

	public void updateHotelEmail() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(hotelEmailInput));
		hotelEmailInput.clear();
		String hotelEmail = BaseClass.getProperties().getProperty("HotelEmail");
		hotelEmailInput.sendKeys(hotelEmail);
	}

	public void updatePhoneList() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(phoneListInput));
		phoneListInput.clear();
		String phoneList = BaseClass.getProperties().getProperty("PhoneList");
		phoneListInput.sendKeys(phoneList);
	}

	public void updateWebsite() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(websiteInput));
		websiteInput.clear();
		String website = BaseClass.getProperties().getProperty("HotelWebsite");
		websiteInput.sendKeys(website);
	}

	public void updateEmailList() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(emailListInput));
		emailListInput.clear();
		String emailList = BaseClass.getProperties().getProperty("EmailList");
		emailListInput.sendKeys(emailList);
	}

	public void updateCustomerCareNumber() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(customerCareNumberInput));
		customerCareNumberInput.clear();
		String customerCareNumber = BaseClass.getProperties().getProperty("CustomerCareNumber");
		customerCareNumberInput.sendKeys(customerCareNumber);
	}
	
	public void updateWhatsappNumber() throws IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(useCustomerCareAsWhatsappTrue));
		wait.until(ExpectedConditions.elementToBeClickable(useCustomerCareAsWhatsappFalse));
		
		String customerCareAsWhatsappnumber = BaseClass.getProperties().getProperty("UseCustomerCareAsWhatsappNumber");
		String whatsappNumber = BaseClass.getProperties().getProperty("WhatsappNumber");
		
		if(customerCareAsWhatsappnumber.equalsIgnoreCase("Yes")) {
			
			useCustomerCareAsWhatsappTrue.click();
		}
		else {
			
			useCustomerCareAsWhatsappFalse.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(whatsappNumberInput));
			whatsappNumberInput.clear();
			whatsappNumberInput.sendKeys(whatsappNumber);
		}
	}
	
	
	
	
	
	
	

//	public void selectUseCustomerCareAsWhatsappYes() {
//		useCustomerCareAsWhatsappTrue.click();
//	}
//
//	public void selectUseCustomerCareAsWhatsappNo() {
//		useCustomerCareAsWhatsappFalse.click();
//	}
//
//	public void updateWhatsappNumber(String whatsappNumber) {
//		whatsappNumberInput.clear();
//		whatsappNumberInput.sendKeys(whatsappNumber);
//	}

	public void clickOnUpdateContactButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(updateButton));
		updateButton.click();
	}
	
	public void clickOnCreateContactButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(createContactButton));
		createContactButton.click();
	}

	public String waitAndGetSuccessMessage() {

		WebElement popup = wait.until(ExpectedConditions.visibilityOf(successPopup));
		return popup.getText().trim();
	}
	
	public void waitForSuccessPopupToDisappear() {
		
		wait.until(ExpectedConditions.invisibilityOf(successPopup));
	}
}
