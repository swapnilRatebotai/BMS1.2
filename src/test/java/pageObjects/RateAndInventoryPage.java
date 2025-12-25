package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RateAndInventoryPage extends BasePage{

	WebDriver driver;

	public RateAndInventoryPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[@class='cm-header']")
		WebElement rateAndInventoryPgConf;
		
		
		//Actions
		public boolean rateAndInventoryPageConfirmation() {
			return rateAndInventoryPgConf.isDisplayed();
		}
}
