package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotosAndVideosPage extends BasePage{

	WebDriver driver;

	public PhotosAndVideosPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Elements
		@FindBy(xpath="//div[text()='Photos & Videos'][@class='form-header']")
		WebElement photosAndVideosPgConf;
		
		
		//Actions
		public boolean photosAndVideosPageConfirmation() {
			return photosAndVideosPgConf.isDisplayed();
		}
}
