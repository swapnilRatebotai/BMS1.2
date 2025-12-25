package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfoPage extends BasePage{

	WebDriver driver;

	public BasicInfoPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[@class='form-header']")
	WebElement basicInfoPgConf;
	
	
	//Actions
	public boolean basicInfoPageConfirmation() {
		return basicInfoPgConf.isDisplayed();
	}
}
