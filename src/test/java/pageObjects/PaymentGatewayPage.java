package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentGatewayPage extends BasePage{

	WebDriver driver;
	WebDriverWait wait;

	public PaymentGatewayPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Payment Gateway Configuration'][@class='form-header']")
		WebElement paymentGatewayPageConfirmation;
		
		
		//Actions
		public boolean paymentGatewayPageConfirmation() {
			
			wait.until(ExpectedConditions.visibilityOf(paymentGatewayPageConfirmation));
			return paymentGatewayPageConfirmation.isDisplayed();
		}
}
