package stepDefinitions.hotellogo;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HotelLogoPage;

public class HotelLogoSteps {

	HotelLogoPage hotelLogoPage = new HotelLogoPage(BaseClass.getDriver());
	
	@Then("user is on the Hotel Logo page")
	public void user_is_on_the_Hotel_Logo_page() {

		boolean hotelLogoPageStatus = hotelLogoPage.hotelLogoPageConfirmation();
		Assert.assertTrue(hotelLogoPageStatus);
	}
}
