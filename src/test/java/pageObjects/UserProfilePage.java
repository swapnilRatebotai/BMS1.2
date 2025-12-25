package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserProfilePage extends BasePage{
	
	WebDriver driver;
	
	public UserProfilePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//h1[@class='user-page-header'][text()='User Profile']")
	WebElement userProfilePgConf;
	
	@FindBy(xpath="//button[@type='button'][text()='Edit Profile']")
	WebElement editProfileBtn;
	
	@FindBy(css="#firstName")
	WebElement firstNameInput;
	
	@FindBy(css="#lastName")
	WebElement lastNameInput;
	
	@FindBy(css="#phone")
	WebElement primaryNumberInput;
	
	@FindBy(css="#secondaryPhone")
	WebElement secondaryNumberInput;
	
	@FindBy(xpath="//button[text()='Save Changes'][@type='submit']")
	WebElement saveChangesBtn;
	
	@FindBy(xpath="//button[text()='Cancel'][@type='button']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//div[@class='snackbar success']")
	WebElement successPopup;
	
	
	//Actions
	public boolean userProfilePageConfirmation() {
		return userProfilePgConf.isDisplayed();
	}
	
	public void clickOnEditProfileButton() {
		editProfileBtn.click();
	}
	
	public void enterFirstName(String firstname) {
		firstNameInput.clear();
		firstNameInput.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		lastNameInput.clear();
		lastNameInput.sendKeys(lastname);
	}
	
	public void enterPrimaryNumber(String primarynumber) {
		primaryNumberInput.clear();
		primaryNumberInput.sendKeys(primarynumber);
	}
	
	public void enterSecondaryNumber(String secondarynumber) {
		secondaryNumberInput.clear();
		secondaryNumberInput.sendKeys(secondarynumber);
	}
	
	public void clickOnSaveChangesButton() {
		saveChangesBtn.click();
	}
	
	public void clickOnCancelButton() {
		cancelBtn.click();
	}
	
	public String waitAndGetSuccessMessage() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement popup =
	        wait.until(ExpectedConditions.visibilityOf(successPopup));
	    return popup.getText().trim();
	}
	
}
