package pageObjects;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotosAndVideosPage extends BasePage{

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public PhotosAndVideosPage(WebDriver driver) {
		super(driver);
	}
	
	
		//Elements
		@FindBy(xpath="//div[text()='Photos & Videos'][@class='form-header']")
		WebElement photosAndVideosPgConf;
		
		@FindBy(xpath="//button[@class='upload-button']")
		WebElement uploadButton;
		
		@FindBy(xpath="//input[@type='checkbox']")
		WebElement coverPhotoCheckbox;
		
		@FindBy(xpath="//input[@class='full-page-form-input']")
		WebElement tagsDropdown;
		
		@FindBy(xpath="//ul[@class='full-page-dropdown-list']//input[@class='full-page-form-input']")
		WebElement tagsDropdownInputBox;
		
		@FindBy(xpath="//li[normalize-space()='Room']")
		WebElement roomTagDropdown;
		
		@FindBy(xpath="//input[@placeholder=' Room Type']")
		WebElement roomTypeDropdown;
		
		@FindBy(xpath="//button[@class='full-page-clear-all']")
		WebElement clearTagsButton;
		
		@FindBy(xpath="//img[@alt='Delete']")
		WebElement deleteImageButton;
		
		@FindBy(xpath="//body/div[@id='root']/div[@class='applayout']/div[@class='mainlayout']/div[@class='content']/div/div[2]/div[2]/button[1]")
		WebElement cancelImageActionsButton;
		
		@FindBy(xpath="//button[normalize-space()='Save']")
		WebElement saveImageButton;
		
		@FindBy(xpath = "//div[@class='snackbar success']")
		WebElement successPopupOfImageUpdate;
		
		@FindBy(xpath="//div[normalize-space()='Test Room']")
		WebElement testRoomImage;
		
		@FindBy(xpath="//div[normalize-space()='Untagged']")
		WebElement coverPhoto;
		
		
		//Actions
		public boolean photosAndVideosPageConfirmation() {
			return photosAndVideosPgConf.isDisplayed();
		}
		
		public void uploadCoverPhoto() {
			
			String projectPath = System.getProperty("user.dir");
			String imagePath = projectPath + File.separator + "image" + File.separator + "hotel_bg_1.jpg";
			uploadButton.sendKeys(imagePath);
		}
		
		public void clickOnCoverPhotoCheckbox() {
			
			coverPhotoCheckbox.click();
		}
		
		public void uploadRoomPhoto() {
			
			String projectPath = System.getProperty("user.dir");
			String imagePath = projectPath + File.separator + "image" + File.separator + "hotel_bg_1.jpg";
			uploadButton.sendKeys(imagePath);
		}
		
		public void selectTags() {
			
			tagsDropdown.click();
			tagsDropdownInputBox.sendKeys("room");
		}
		
		public void selectRoomType() {
			
			roomTagDropdown.click();
			tagsDropdown.click();
			roomTypeDropdown.sendKeys("test room");
			roomTypeDropdown.sendKeys(Keys.DOWN);
			roomTypeDropdown.sendKeys(Keys.ENTER);
		}
		
		public void clickOnSaveButton() {
			
			saveImageButton.click();
			wait.until(ExpectedConditions.alertIsPresent()).accept();
		}
		
		public void deleteRoomImage() {
			
			testRoomImage.click();
			deleteImageButton.click();
		}
		
		public void deleteCoverPhoto() {
			coverPhoto.click();
			deleteImageButton.click();
		}
		
		public void cancelRoomActionsButton() {
			
			cancelImageActionsButton.click();
		}
		
		public String waitAndGetSuccessMessageForImageUpdate() {

			WebElement rateplanPopup = wait.until(ExpectedConditions.visibilityOf(successPopupOfImageUpdate));
			return rateplanPopup.getText().trim();
		}
		
		public void waitForSuccessPopupOfImageUpdateToDisappear() {

			wait.until(ExpectedConditions.invisibilityOf(successPopupOfImageUpdate));
		}
		
}
