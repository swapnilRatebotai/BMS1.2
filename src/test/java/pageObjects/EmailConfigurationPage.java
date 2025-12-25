package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailConfigurationPage extends BasePage{

	WebDriver driver;

	public EmailConfigurationPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Email Configuration'][@class='form-header']")
		WebElement emailConfigPgConf;
		
		
		//Actions
		public boolean emailConfigurationPageConfirmation() {
			return emailConfigPgConf.isDisplayed();
		}
}
