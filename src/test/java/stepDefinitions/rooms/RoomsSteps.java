package stepDefinitions.rooms;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.RoomsPage;

public class RoomsSteps {

	RoomsPage roomsPage = new RoomsPage(BaseClass.getDriver());
	
	@Then("user is on the Rooms page")
	public void user_is_on_the_Rooms_page() {

		boolean roomsPageStatus = roomsPage.roomsPageConfirmation();
		Assert.assertTrue(roomsPageStatus);
	}
}
