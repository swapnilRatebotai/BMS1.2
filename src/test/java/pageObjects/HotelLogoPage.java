package pageObjects;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelLogoPage extends BasePage{

	WebDriver driver;
	 WebDriverWait wait;

	public HotelLogoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Hotel Logo'][@class='form-header']")
		WebElement hotelLogoPageConfirmation;
		
		@FindBy(xpath="//button[normalize-space()='Update Logo']")
		WebElement logoUpdateButton;
		
		@FindBy(css="#logo-upload")
		WebElement logoUploadInputBox;
		
		@FindBy(xpath="//button[normalize-space()='Submit']")
		WebElement submitButton;
		
		@FindBy(xpath="//button[normalize-space()='Cancel']")
		WebElement cancelButton;
		
		@FindBy(xpath = "//div[@class='snackbar success']")
		WebElement successPopupOfLogoUpdate;
		
		//Actions
		public boolean hotelLogoPageConfirmation() {
			
			wait.until(ExpectedConditions.visibilityOf(hotelLogoPageConfirmation));
			return hotelLogoPageConfirmation.isDisplayed();
		}
		
		public void clickOnUpdateLogoButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(logoUpdateButton));
			logoUpdateButton.click();
		}
		
		public void uploadLogo() {
			
			wait.until(ExpectedConditions.visibilityOf(logoUploadInputBox));
			String projectPath = System.getProperty("user.dir");
			String imagePath = projectPath + File.separator + "images" + File.separator + "logo_2.jpg";
			logoUploadInputBox.sendKeys(imagePath);
		}
		
		public void clickOnSubmitButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(submitButton));
			submitButton.click();
		}
		
		public String waitAndGetSuccessMessageForHotelLogoUpdate() {

			WebElement hotellogoPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfLogoUpdate));
			return hotellogoPopup.getText().trim();
		}
		
		public void waitForSuccessPopupOfHotelLogoUpdateToDisappear() {

			wait.until(ExpectedConditions.invisibilityOf(successPopupOfLogoUpdate));
		}
}
