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
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Email Configuration'][@class='form-header']")
	WebElement emailConfigPgConf;

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
		return emailConfigPgConf.isDisplayed();
	}

	public void enterSMTPHost() throws IOException {

		smtpHostInput.clear();
		String smtphost = BaseClass.getProperties().getProperty("SMTPHost");
		smtpHostInput.sendKeys(smtphost);
	}

	public void enterSMTPPort() throws IOException {

		smtpPortInput.clear();
		String smtpport = BaseClass.getProperties().getProperty("SMTPPort");
		smtpPortInput.sendKeys(smtpport);
	}

	public void enterSMTPUsername() throws IOException {

		smtpUsernameInput.clear();
		String smtpusername = BaseClass.getProperties().getProperty("SMTPUsername");
		smtpUsernameInput.sendKeys(smtpusername);
	}

	public void enterSMTPPassword() throws IOException {

		smtpPasswordInput.clear();
		String smtppassword = BaseClass.getProperties().getProperty("SMTPPassword");
		smtpPasswordInput.sendKeys(smtppassword);
	}

	public void enterFromEmail() throws IOException {

		fromEmailInput.clear();
		String fromemail = BaseClass.getProperties().getProperty("FromEmail");
		fromEmailInput.sendKeys(fromemail);
	}

	public void enterFromName() throws IOException {

		fromNameInput.clear();
		String fromname = BaseClass.getProperties().getProperty("FromName");
		fromNameInput.sendKeys(fromname);
	}

	public void selectEncryption() throws IOException {

		String encryption = BaseClass.getProperties().getProperty("Encryption");
		if (encryption.equalsIgnoreCase("ssl")) {

			sslEncryptionRadioButton.click();
		} else {

			tlsEncryptionRadioButton.click();
		}
	}

	public void clickOnUpdateButton() {

		updateButton.click();
	}

	public void clickOnSaveButton() {

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
