package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancellationPolicyPage extends BasePage{

	WebDriver driver;

	public CancellationPolicyPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Policies'][@class='form-header']")
		WebElement cancellationPolicyPgConf;
		
		
		//Actions
		public boolean cancellationPolicyPageConfirmation() {
			return cancellationPolicyPgConf.isDisplayed();
		}
}
