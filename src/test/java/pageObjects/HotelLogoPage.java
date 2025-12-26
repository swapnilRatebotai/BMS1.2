package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelLogoPage extends BasePage{

	WebDriver driver;

	public HotelLogoPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Hotel Logo'][@class='form-headerr']")
		WebElement hotelLogoPgConf;
		
		
		//Actions
		public boolean hotelLogoPageConfirmation() {
			return hotelLogoPgConf.isDisplayed();
		}
}
