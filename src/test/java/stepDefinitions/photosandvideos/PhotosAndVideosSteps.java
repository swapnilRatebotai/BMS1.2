package stepDefinitions.photosandvideos;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PhotosAndVideosPage;

public class PhotosAndVideosSteps {

	PhotosAndVideosPage photosAndVideosPage = new PhotosAndVideosPage(BaseClass.getDriver());
	
	@Then("user is on the Photos and Videos page")
	public void user_is_on_the_Photos_and_Videos_page() {

		boolean photosAndVideosPageStatus = photosAndVideosPage.photosAndVideosPageConfirmation();
		Assert.assertTrue(photosAndVideosPageStatus);
	}
	
	@When("user uploads cover photo")
	public void user_uploads_cover_photo() throws IOException {
	    
		photosAndVideosPage.uploadCoverPhoto();
		photosAndVideosPage.clickOnCoverPhotoCheckbox();
		
		String actualMessageForCoverPhoto = photosAndVideosPage.waitAndGetSuccessMessageForImageUpdate();
		String popupMessageForCoverPhoto = BaseClass.getProperties().getProperty("CoverPhotoPopupMessage");
		Assert.assertEquals(actualMessageForCoverPhoto, popupMessageForCoverPhoto);
		
		photosAndVideosPage.waitForSuccessPopupOfImageUpdateToDisappear();
	}

	@Then("user clicks on save photos button")
	public void user_clicks_on_save_photos_button() throws IOException {
	    
		photosAndVideosPage.clickOnSaveButton();
		
		String actualMessageForRoom = photosAndVideosPage.waitAndGetSuccessMessageForImageUpdate();
		String popupMessageForRoom = BaseClass.getProperties().getProperty("RoomPhotoPopupMessage");
		Assert.assertEquals(actualMessageForRoom, popupMessageForRoom);
		
		photosAndVideosPage.waitForSuccessPopupOfImageUpdateToDisappear();
	}

	@When("user uploads room photo and select room")
	public void user_uploads_room_photo_and_select_room() {
	    
		photosAndVideosPage.uploadRoomPhoto();
		photosAndVideosPage.selectTags();
		photosAndVideosPage.selectRoomType();
	}

	@When("user deletes uploaded room photo")
	public void user_deletes_uploaded_room_photo() {
	    
		photosAndVideosPage.deleteRoomImage();
		photosAndVideosPage.cancelRoomActionsButton();
	}

	@When("user deletes uploaded cover photo")
	public void user_deletes_uploaded_cover_photo() {
	    
		photosAndVideosPage.deleteCoverPhoto();
		photosAndVideosPage.cancelRoomActionsButton();
	}
}
