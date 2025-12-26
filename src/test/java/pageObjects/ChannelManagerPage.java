package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChannelManagerPage extends BasePage {

	WebDriver driver;

	public ChannelManagerPage(WebDriver driver) {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	//Elements
	@FindBy(xpath="//div[text()='Channel Manager'][@class='form-header']")
	WebElement cmPgConf;
	
	
	@FindBy(xpath="//div[text()='Bookings'][@class='sidebar-main-item']")
	WebElement menuBookings;
	
	
	//Actions
	public boolean channelManagerPageConfirmation() {
		wait.until(ExpectedConditions.visibilityOf(cmPgConf));
		return cmPgConf.isDisplayed();
	}
	
	public void clickOnBookingsFromMenu() {
		menuBookings.click();
	}
	
}
