package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class EmailConfigurationPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public EmailConfigurationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Email Configuration'][@class='form-header']")
	WebElement emailConfigPageConfirmation;

	@FindBy(xpath = "//input[@id='SMTP Host']")
	WebElement smtpHostInput;

	@FindBy(xpath = "//input[@id='SMTP Port']")
	WebElement smtpPortInput;

	@FindBy(xpath = "//input[@id='SMTP Username']")
	WebElement smtpUsernameInput;

	@FindBy(xpath = "//input[@name='smtp_password']")
	WebElement smtpPasswordInput;

	@FindBy(xpath = "//input[@id='From Email']")
	WebElement fromEmailInput;

	@FindBy(xpath = "//input[@id='From Name']")
	WebElement fromNameInput;

	@FindBy(css = "#ssl")
	WebElement sslEncryptionRadioButton;

	@FindBy(css = "#tls")
	WebElement tlsEncryptionRadioButton;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement updateButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='snackbar success']")
	WebElement successPopupOfEmailConfiguration;

	// Actions
	public boolean emailConfigurationPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(emailConfigPageConfirmation));
		return emailConfigPageConfirmation.isDisplayed();
	}

	public void enterSMTPHost() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(smtpHostInput));
		smtpHostInput.clear();
		String smtphost = BaseClass.getProperties().getProperty("SMTPHost");
		smtpHostInput.sendKeys(smtphost);
	}

	public void enterSMTPPort() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(smtpPortInput));
		smtpPortInput.clear();
		String smtpport = BaseClass.getProperties().getProperty("SMTPPort");
		smtpPortInput.sendKeys(smtpport);
	}

	public void enterSMTPUsername() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(smtpUsernameInput));
		smtpUsernameInput.clear();
		String smtpusername = BaseClass.getProperties().getProperty("SMTPUsername");
		smtpUsernameInput.sendKeys(smtpusername);
	}

	public void enterSMTPPassword() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(smtpPasswordInput));
		smtpPasswordInput.clear();
		String smtppassword = BaseClass.getProperties().getProperty("SMTPPassword");
		smtpPasswordInput.sendKeys(smtppassword);
	}

	public void enterFromEmail() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(fromEmailInput));
		fromEmailInput.clear();
		String fromemail = BaseClass.getProperties().getProperty("FromEmail");
		fromEmailInput.sendKeys(fromemail);
	}

	public void enterFromName() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(fromNameInput));
		fromNameInput.clear();
		String fromname = BaseClass.getProperties().getProperty("FromName");
		fromNameInput.sendKeys(fromname);
	}

	public void selectEncryption() throws IOException {

		wait.until(ExpectedConditions.elementToBeClickable(sslEncryptionRadioButton));
		wait.until(ExpectedConditions.elementToBeClickable(tlsEncryptionRadioButton));
		
		String encryption = BaseClass.getProperties().getProperty("Encryption");
		if (encryption.equalsIgnoreCase("ssl")) {

			sslEncryptionRadioButton.click();
		} else {

			tlsEncryptionRadioButton.click();
		}
	}

	public void clickOnUpdateButton() {

		wait.until(ExpectedConditions.elementToBeClickable(updateButton));
		updateButton.click();
	}

	public void clickOnSaveButton() {

		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
	}

//	public String waitAndGetSuccessMessageForEmailConfigurationUpdate() {
//
//		WebElement emailconfigpopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfEmailConfiguration));
//		return emailconfigpopup.getText().trim();
//	}
	
	public String waitAndGetSuccessMessageForEmailConfigurationUpdate() {

//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    By snackbarLocator = By.xpath("//*[contains(@class,'snackbar')]");

	    WebElement snackbar =
	        wait.until(ExpectedConditions.presenceOfElementLocated(snackbarLocator));

	    return snackbar.getText().trim();
	}

	public void waitForSuccessPopupOfEmailConfigurationDisappear() {

		wait.until(ExpectedConditions.invisibilityOf(successPopupOfEmailConfiguration));
	}
}
