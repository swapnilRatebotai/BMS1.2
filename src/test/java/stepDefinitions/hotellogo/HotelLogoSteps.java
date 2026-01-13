package stepDefinitions.hotellogo;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HotelLogoPage;

public class HotelLogoSteps {

	HotelLogoPage hotelLogoPage = new HotelLogoPage(BaseClass.getDriver());
	
	@Then("user is on the Hotel Logo page")
	public void user_is_on_the_Hotel_Logo_page() {

		boolean hotelLogoPageStatus = hotelLogoPage.hotelLogoPageConfirmation();
		Assert.assertTrue(hotelLogoPageStatus);
	}
	
	@When("user uploads hotel logo")
	public void user_uploads_hotel_logo() {
		
	    hotelLogoPage.clickOnUpdateLogoButton();
	    hotelLogoPage.uploadLogo();
	}

	@When("user clicks on submit hotel logo button")
	public void user_clicks_on_submit_hotel_logo_button() throws IOException {
		
		hotelLogoPage.clickOnSubmitButton();
		
		String actualMessageForHotelLogo = hotelLogoPage.waitAndGetSuccessMessageForHotelLogoUpdate();
		String popupMessageForHotelLogo = BaseClass.getProperties().getProperty("HotelLogoPopupMessage");
		Assert.assertEquals(actualMessageForHotelLogo, popupMessageForHotelLogo);
		
		hotelLogoPage.waitForSuccessPopupOfHotelLogoUpdateToDisappear();
	}
}
