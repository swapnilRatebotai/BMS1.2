package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPolicyPage extends BasePage{

	WebDriver driver;

	public PaymentPolicyPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Payment Policies'][@class='form-header']")
		WebElement paymentPolicyPgConf;
		
		
		//Actions
		public boolean PaymentPolicyPageConfirmation() {
			return paymentPolicyPgConf.isDisplayed();
		}
}
