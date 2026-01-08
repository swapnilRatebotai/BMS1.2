package stepDefinitions.propertydetails;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LocationPage;

public class LocationSteps {

	LocationPage locationPage = new LocationPage(BaseClass.getDriver());
	
	@Then("user is on the Location page")
	public void user_is_on_the_Location_page() {

		boolean locationPageStatus = locationPage.locationPageConfirmation();
		Assert.assertTrue(locationPageStatus);
	}
	
	@When("user updates location details")
	public void user_updates_location_details() throws IOException, InterruptedException {
	    
		locationPage.updateStreetAddress();
		locationPage.updateLocality();
		
	}

	@When("user clicks on update location button")
	public void user_clicks_on_update_location_button() throws IOException {
	    
		locationPage.clickOnUpdateLocationButton();
		
		String actualMessage = locationPage.waitAndGetSuccessMessage();
		String popupMsg = BaseClass.getProperties().getProperty("LocationPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMsg);
	 	
	 	locationPage.waitForSuccessPopupToDisappear();
	}
}
