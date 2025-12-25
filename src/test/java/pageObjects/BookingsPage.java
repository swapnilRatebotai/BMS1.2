package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingsPage extends BasePage {

	WebDriver driver;

	public BookingsPage(WebDriver driver) {
		super(driver);
	}

	// Elements

	@FindBy(xpath = "//h1[normalize-space()='Bookings']")
	WebElement bookingsPgConf;

	// Actions

	public boolean bookingsPageConfirmation() {
		return bookingsPgConf.isDisplayed();
	}

}
