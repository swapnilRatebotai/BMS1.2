package stepDefinitions.propertydetails;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LocationPage;

public class LocationSteps {

	LocationPage locationPage = new LocationPage(BaseClass.getDriver());
	
	@Then("user is on the Location page")
	public void user_is_on_the_Location_page() {

		boolean locationPageStatus = locationPage.locationPageConfirmation();
		Assert.assertTrue(locationPageStatus);
	}
}
