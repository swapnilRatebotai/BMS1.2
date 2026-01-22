package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentGatewayPage extends BasePage{

	WebDriver driver;

	public PaymentGatewayPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Payment Gateway Configuration'][@class='form-header']")
		WebElement paymentGatewayPageConf;
		
		
		//Actions
		public boolean paymentGatewayPageConfirmation() {
			return paymentGatewayPageConf.isDisplayed();
		}
}
