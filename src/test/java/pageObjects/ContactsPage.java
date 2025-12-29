package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[text()='Property Contacts'][@class='form-header']")
	WebElement contactsPgConf;
	
	@FindBy(xpath="//input[@id='Hotel Phone']")
	WebElement hotelPhoneInput;
	
	@FindBy(xpath="//input[@id='Hotel Mobile']")
	WebElement hotelMobileInput;
	
	@FindBy(xpath="//input[@id='Hotel Email']")
	WebElement hotelEmailInput;
	
	@FindBy(xpath="//input[@id='Phone List']")
	WebElement phoneListInput;
	
	@FindBy(xpath="//input[@name='websiteList']")
	WebElement websiteInput;
	
	@FindBy(xpath="//input[@id='Email List']")
	WebElement emailListInput;
	
	@FindBy(xpath="//input[@id='Customer Care Number']")
	WebElement customerCareNumberInput;
	
	@FindBy(css="#true")
	WebElement useCustomerCareAsWhatsappTrue;
	
	@FindBy(css="#false")
	WebElement useCustomerCareAsWhatsappFalse;
	
	@FindBy(xpath="//input[@id='WhatsApp Number']")
	WebElement whatsappNumberInput;
	
	@FindBy(xpath="//button[normalize-space()='Update Contact']")
	WebElement updateButton;
	
	//Actions
	public boolean contactsPageConfirmation() {
		return contactsPgConf.isDisplayed();
	}
}
