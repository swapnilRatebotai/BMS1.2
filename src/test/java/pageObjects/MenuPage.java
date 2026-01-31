package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public MenuPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
	WebElement menuEmailConfiguration;

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
		
		wait.until(ExpectedConditions.elementToBeClickable(menuBookings));
		menuBookings.click();
	}

	public void clickOnPropertyDetailsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPropertyDetails));
		menuPropertyDetails.click();
	}

	public void clickOnBasicInfoFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuBasicInfo));
		menuBasicInfo.click();
	}

	public void clickOnContactsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuContacts));
		menuContacts.click();
	}

	public void clickOnLocationFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuLocation));
		menuLocation.click();
	}
	
	public void clickOnRoomsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuRooms));
		menuRooms.click();
	}
	
	public void clickOnPhotosAndVideosFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPhotosAndVideos));
		menuPhotosAndVideos.click();
	}
	
	public void clickOnRatesAndInventoryFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuRatesAndInventory));
		menuRatesAndInventory.click();
	}
	
	public void clickOnPolicyFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPolicy));
		menuPolicy.click();
	}
	
	public void clickOnCancellationPolicyFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuCancellationPolicy));
		menuCancellationPolicy.click();
	}
	
	public void clickOnPaymentPolicyFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPaymentPolicy));
		menuPaymentPolicy.click();
	}
	
	public void clickOnDealsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuDeals));
		menuDeals.click();
	}
	
	public void clickOnDiscountsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuDiscounts));
		menuDiscounts.click();
	}
	
	public void clickOnEmailConfigurationFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuEmailConfiguration));
		menuEmailConfiguration.click();
	}
	
	public void clickOnPaymentgatewayFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPaymentGateway));
		menuPaymentGateway.click();
	}
	
	public void clickOnHotelLogoFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuHotelLogo));
		menuHotelLogo.click();
	}
	
	public void clickOnChannelManagerFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuChannelManager));
		menuChannelManager.click();
	}
	
	public void clickOnPropertyListFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuPropertyList));
		menuPropertyList.click();
	}
}
