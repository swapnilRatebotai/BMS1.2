package stepDefinitions.photosandvideos;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.PhotosAndVideosPage;

public class PhotosAndVideosSteps {

	PhotosAndVideosPage photosAndVideosPage = new PhotosAndVideosPage(BaseClass.getDriver());
	
	@Then("user is on the Photos and Videos page")
	public void user_is_on_the_Photos_and_Videos_page() {

		boolean photosAndVideosPageStatus = photosAndVideosPage.photosAndVideosPageConfirmation();
		Assert.assertTrue(photosAndVideosPageStatus);
	}
}
