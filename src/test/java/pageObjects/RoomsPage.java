package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomsPage extends BasePage{

	WebDriver driver;

	public RoomsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Rooms'][@class='form-header']")
		WebElement roomsPgConf;
		
		
		//Actions
		public boolean roomsPageConfirmation() {
			return roomsPgConf.isDisplayed();
		}
}
