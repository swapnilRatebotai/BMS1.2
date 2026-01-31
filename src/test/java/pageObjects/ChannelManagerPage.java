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

public class ChannelManagerPage extends BasePage {

	WebDriver driver;
	 WebDriverWait wait;

	public ChannelManagerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	//Elements
	@FindBy(xpath="//div[text()='Channel Manager'][@class='form-header']")
	WebElement channelManagerPageConfirmation;
	
	@FindBy(xpath="//div[text()='Bookings'][@class='sidebar-main-item']")
	WebElement menuBookings;
	
	@FindBy(xpath="//input[@name='channel_manager']")
	WebElement channelManagerDropdown;
	
	@FindBy(xpath="//button[normalize-space()='Connect']")
	WebElement connectButton;
	
	@FindBy(xpath="//div[@class='form-cell']//div//span//*[name()='svg']")
	WebElement secretCodeVisibilityButton;
	
	@FindBy(xpath="//div[@class='form-cell']//div//input")
	WebElement secretCodeText;
	
	@FindBy(xpath="//button[normalize-space()='Disconnect']")
	WebElement disconnectButton;
	
	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopupOfChannelManager;
	
	
	//Actions
	public boolean channelManagerPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(channelManagerPageConfirmation));
		return channelManagerPageConfirmation.isDisplayed();
	}
	
	public void clickOnBookingsFromMenu() {
		
		wait.until(ExpectedConditions.elementToBeClickable(menuBookings));
		menuBookings.click();
	}
	
	public void clickOnDisconnectButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(disconnectButton));
		disconnectButton.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	
	public void clickOnConnectButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(connectButton));
		connectButton.click();
	}
	
	public void selectChannelManager() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(channelManagerDropdown));
		String channelmanager = BaseClass.getProperties().getProperty("ChannelManager");
		channelManagerDropdown.sendKeys(channelmanager);
		channelManagerDropdown.sendKeys(Keys.DOWN);
		channelManagerDropdown.sendKeys(Keys.ENTER);
	}
	
	public void showSecretCode() {
		
		wait.until(ExpectedConditions.elementToBeClickable(secretCodeVisibilityButton));
		secretCodeVisibilityButton.click();
	}
	
	public String waitAndGetSuccessMessageForChannelManager() {

		WebElement rateplanPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfChannelManager));
		return rateplanPopup.getText().trim();
	}
	
	public void waitForSuccessPopupOfChannelManagerToDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupOfChannelManager));
	}
	
}
