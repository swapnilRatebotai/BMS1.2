package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
	@FindBy(xpath="//div[text()='Property Contacts'][@class='form-header']")
	WebElement contactsPgConf;
	
	
	//Actions
	public boolean contactsPageConfirmation() {
		return contactsPgConf.isDisplayed();
	}
}
