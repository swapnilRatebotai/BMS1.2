package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[text()='Property Contacts'][@class='form-header']")
	WebElement contactsPgConf;

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

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopup;

	// Actions
	public boolean contactsPageConfirmation() {
		return contactsPgConf.isDisplayed();
	}

	public void updateHotelPhone(String hotelPhone) {
		hotelPhoneInput.click();
		hotelPhoneInput.sendKeys(Keys.CONTROL + "a");
		hotelPhoneInput.sendKeys(Keys.DELETE);
		hotelPhoneInput.sendKeys(hotelPhone);
	}

	public void updateHotelMobile(String hotelMobile) {
		hotelMobileInput.clear();
		hotelMobileInput.sendKeys(hotelMobile);
	}

	public void updateHotelEmail(String hotelEmail) {
		hotelEmailInput.clear();
		hotelEmailInput.sendKeys(hotelEmail);
	}

	public void updatePhoneList(String phoneList) {
		phoneListInput.clear();
		phoneListInput.sendKeys(phoneList);
	}

	public void updateWebsite(String webSite) {
		websiteInput.clear();
		websiteInput.sendKeys(webSite);
	}

	public void updateEmailList(String emailList) {
		emailListInput.clear();
		emailListInput.sendKeys(emailList);
	}

	public void updateCustomerCareNumber(String customerCareNumber) {
		customerCareNumberInput.clear();
		customerCareNumberInput.sendKeys(customerCareNumber);
	}

	public void selectUseCustomerCareAsWhatsappYes() {
		useCustomerCareAsWhatsappTrue.click();
	}

	public void selectUseCustomerCareAsWhatsappNo() {
		useCustomerCareAsWhatsappFalse.click();
	}

	public void updateWhatsappNumber(String whatsappNumber) {
		whatsappNumberInput.clear();
		whatsappNumberInput.sendKeys(whatsappNumber);
	}

	public void clickOnUpdateContactButton() {
		updateButton.click();
	}

	public String waitAndGetSuccessMessage() {

		WebElement popup = wait.until(ExpectedConditions.visibilityOf(successPopup));
		return popup.getText().trim();
	}
	
	public void waitForSuccessPopupToDisappear() {
		
	    wait.until(ExpectedConditions.invisibilityOf(successPopup));
	}
}
