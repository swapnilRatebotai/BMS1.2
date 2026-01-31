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
	 WebDriverWait wait;

	public PhotosAndVideosPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
		//Elements
		@FindBy(xpath="//div[text()='Photos & Videos'][@class='form-header']")
		WebElement photosAndVideosPageConfirmation;
		
		@FindBy(xpath="//button[@class='upload-button']")
		WebElement uploadButton;
		
		@FindBy(xpath="//input[@type='file']")
		WebElement photoUploadInputBox;
		
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
		
		@FindBy(xpath="//div[normalize-space()='Room']")
		WebElement roomImage;
		
		@FindBy(xpath="//div[contains(text(),'Untagged')]")
		WebElement coverPhoto;
		
		
		//Actions
		public boolean photosAndVideosPageConfirmation() {
			
			wait.until(ExpectedConditions.visibilityOf(photosAndVideosPageConfirmation));
			return photosAndVideosPageConfirmation.isDisplayed();
		}
		
		public void uploadCoverPhoto() {
			
			String projectPath = System.getProperty("user.dir");
			String imagePath = projectPath + File.separator + "images" + File.separator + "hotel_bg_1.jpg";
			
			wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
			uploadButton.click();
			
			wait.until(ExpectedConditions.visibilityOf(photoUploadInputBox));
			photoUploadInputBox.sendKeys(imagePath);
		}
		
		public void clickOnCoverPhotoCheckbox() {
			
			wait.until(ExpectedConditions.elementToBeClickable(coverPhotoCheckbox));
			coverPhotoCheckbox.click();
		}
		
		public void uploadRoomPhoto() {
			
			String projectPath = System.getProperty("user.dir");
			String imagePath = projectPath + File.separator + "images" + File.separator + "room_1.jpg";
			
			wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
			uploadButton.click();
			
			wait.until(ExpectedConditions.visibilityOf(photoUploadInputBox));
			photoUploadInputBox.sendKeys(imagePath);
		}
		
		public void selectTags() {
			
			wait.until(ExpectedConditions.visibilityOf(tagsDropdown));
			tagsDropdown.click();
			
			wait.until(ExpectedConditions.visibilityOf(tagsDropdownInputBox));
			tagsDropdownInputBox.sendKeys("room");
		}
		
		public void selectRoomType() {
			
			wait.until(ExpectedConditions.visibilityOf(roomTagDropdown));
			roomTagDropdown.click();
			
			wait.until(ExpectedConditions.visibilityOf(tagsDropdown));
			tagsDropdown.click();
			roomTypeDropdown.sendKeys("test room");
			roomTypeDropdown.sendKeys(Keys.DOWN);
			roomTypeDropdown.sendKeys(Keys.ENTER);
		}
		
		public void clickOnSaveButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(saveImageButton));
			saveImageButton.click();
			wait.until(ExpectedConditions.alertIsPresent()).accept();
		}
		
		public void deleteRoomImage() {
			
			wait.until(ExpectedConditions.elementToBeClickable(roomImage));
			roomImage.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(deleteImageButton));
			deleteImageButton.click();
		}
		
		public void deleteCoverPhoto() {
			
			wait.until(ExpectedConditions.elementToBeClickable(coverPhoto));
			coverPhoto.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(deleteImageButton));
			deleteImageButton.click();
		}
		
		public void cancelRoomActionsButton() {
			
			wait.until(ExpectedConditions.elementToBeClickable(cancelImageActionsButton));
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
