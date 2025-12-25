package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

	WebDriver driver;

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	// Elements in Menu

	@FindBy(xpath = "//div[text()='Bookings'][@class='sidebar-main-item']")
	WebElement menuBookings;

	@FindBy(xpath = "//div[text()='Property Details'][@class='sidebar-main-item']")
	WebElement menuPropertyDetails;

	@FindBy(xpath = "//div[text()='Basic Info'][@class='sidebar-sub-item']")
	WebElement menuBasicInfo;

	@FindBy(xpath = "//div[text()='Contacts'][@class='sidebar-sub-item']")
	WebElement menuContacts;

	@FindBy(xpath = "//div[text()='Location'][@class='sidebar-sub-item']")
	WebElement menuLocation;

	@FindBy(xpath = "//div[text()='Rooms'][@class='sidebar-main-item']")
	WebElement menuRooms;

	@FindBy(xpath = "//div[text()='Photos & Videos'][@class='sidebar-main-item']")
	WebElement menuPhotosAndVideos;

	@FindBy(xpath = "//div[text()='Rate & Inventory'][@class='sidebar-main-item']")
	WebElement menuRatesAndInventory;

	@FindBy(xpath = "//div[contains(text(),'Policy')]")
	WebElement menuPolicy;

	@FindBy(xpath = "(//div[normalize-space()='Cancellation policy'])[1]")
	WebElement menuCancellationPolicy;

	@FindBy(xpath = "//div[text()='Payment policy'][@class='sidebar-sub-item']")
	WebElement menuPaymentPolicy;

	@FindBy(xpath = "//div[text()='Deals'][@class='sidebar-main-item']")
	WebElement menuDeals;

	@FindBy(xpath = "//div[text()='Discounts'][@class='sidebar-sub-item']")
	WebElement menuDiscounts;

	@FindBy(xpath = "//div[text()='Email Configuration'][@class='sidebar-main-item']")
	WebElement menuEmailConfig;

	@FindBy(xpath = "//div[text()='Payment Gateway'][@class='sidebar-main-item']")
	WebElement menuPaymentGateway;

	@FindBy(xpath = "//div[text()='Hotel Logo'][@class='sidebar-main-item']")
	WebElement menuHotelLogo;

	@FindBy(xpath = "//div[text()='Channel Manager'][@class='sidebar-main-item']")
	WebElement menuChannelManager;
	
	@FindBy(xpath= "//div[text()='Property List'][@class='sidebar-main-item']")
	WebElement menuPropertyList;

	// Actions for Menu Elements

	public void clickOnBookingsFromMenu() {
		menuBookings.click();
	}

	public void clickOnPropertyDetailsFromMenu() {
		menuPropertyDetails.click();
	}

	public void clickOnBasicInfoFromMenu() {
		menuBasicInfo.click();
	}

	public void clickOnContactsFromMenu() {
		menuContacts.click();
	}

	public void clickOnLocationFromMenu() {
		menuLocation.click();
	}
	
	public void clickOnRoomsFromMenu() {
		menuRooms.click();
	}
	
	public void clickOnPhotosAndVideosFromMenu() {
		menuPhotosAndVideos.click();
	}
	
	public void clickOnRatesAndInventoryFromMenu() {
		menuRatesAndInventory.click();
	}
	
	public void clickOnPolicyFromMenu() {
		menuPolicy.click();
	}
	
	public void clickOnCancellationPolicyFromMenu() {
		menuCancellationPolicy.click();
	}
	
	public void clickOnPaymentPolicyFromMenu() {
		menuPaymentPolicy.click();
	}
	
	public void clickOnDealsFromMenu() {
		menuDeals.click();
	}
	
	public void clickOnDiscountsFromMenu() {
		menuDiscounts.click();
	}
	
	public void clickOnEmailConfigurationFromMenu() {
		menuEmailConfig.click();
	}
	
	public void clickOnPaymentgatewayFromMenu() {
		menuPaymentGateway.click();
	}
	
	public void clickOnHotelLogoFromMenu() {
		menuHotelLogo.click();
	}
	
	public void clickOnChannelManagerFromMenu() {
		menuChannelManager.click();
	}
	
	public void clickOnPropertyListFromMenu() {
		menuPropertyList.click();
	}
}
