package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChannelManagerPage extends BasePage {

	WebDriver driver;

	public ChannelManagerPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//div[text()='Channel Manager'][@class='form-header']")
	WebElement cmPgConf;
	
	@FindBy(xpath="//div[text()='Bookings'][@class='sidebar-main-item']")
	WebElement menuBookings;
	
	
	//Actions
	public boolean channelManagerPageConfirmation() {
		return cmPgConf.isDisplayed();
	}
	
	public void clickOnBookingsFromMenu() {
		menuBookings.click();
	}
	
}
