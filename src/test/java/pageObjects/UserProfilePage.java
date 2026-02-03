package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class UserProfilePage extends BasePage{
	
	WebDriver driver;
	
	public UserProfilePage(WebDriver driver) {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//Elements
	@FindBy(xpath="//h1[@class='user-page-header'][text()='User Profile']")
	WebElement userProfilePageConfirmation;
	
	@FindBy(xpath="//button[@type='button'][text()='Edit Profile']")
	WebElement editProfileButton;
	
	@FindBy(css="#firstName")
	WebElement firstNameInput;
	
	@FindBy(css="#lastName")
	WebElement lastNameInput;
	
	@FindBy(css="#phone")
	WebElement primaryNumberInput;
	
	@FindBy(css="#secondaryPhone")
	WebElement secondaryNumberInput;
	
	@FindBy(xpath="//button[text()='Save Changes'][@type='submit']")
	WebElement saveChangesButton;
	
	@FindBy(xpath="//button[text()='Cancel'][@type='button']")
	WebElement cancelButton;
	
	@FindBy(xpath="//div[@class='snackbar success']")
	WebElement successPopup;
	
	
	//Actions
	public boolean userProfilePageConfirmation() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(userProfilePageConfirmation));
		Thread.sleep(800);
		return userProfilePageConfirmation.isDisplayed();
	}
	
	public void clickOnEditProfileButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(editProfileButton));
		editProfileButton.click();
	}
	
	public void enterFirstName() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(firstNameInput));
		firstNameInput.clear();
		String firstName = BaseClass.getProperties().getProperty("FirstName");
		firstNameInput.sendKeys(firstName);
	}
	
	public void enterLastName() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(lastNameInput));
		lastNameInput.clear();
		String lastName = BaseClass.getProperties().getProperty("LastName");
		lastNameInput.sendKeys(lastName);
	}
	
	public void enterPrimaryNumber() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(primaryNumberInput));
		primaryNumberInput.clear();
		String primaryNumber = BaseClass.getProperties().getProperty("PrimaryNumber");
		primaryNumberInput.sendKeys(primaryNumber);
	}
	
	public void enterSecondaryNumber() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(secondaryNumberInput));
		secondaryNumberInput.clear();
		String secondaryNumber = BaseClass.getProperties().getProperty("SecondaryNumber");
		secondaryNumberInput.sendKeys(secondaryNumber);
	}
	
	public void clickOnSaveChangesButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(saveChangesButton));
		saveChangesButton.click();
	}
	
	public void clickOnCancelButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
		cancelButton.click();
	}
	
	public String waitAndGetSuccessMessage() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement popup =
	        wait.until(ExpectedConditions.visibilityOf(successPopup));
	    return popup.getText().trim();
	}
	
}
