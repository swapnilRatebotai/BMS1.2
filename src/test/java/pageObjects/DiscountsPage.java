package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountsPage extends BasePage{

	WebDriver driver;

	public DiscountsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Discounts'][@class='form-header']")
		WebElement discountsPgConf;
		
		
		//Actions
		public boolean discountsPageConfirmation() {
			return discountsPgConf.isDisplayed();
		}
}
