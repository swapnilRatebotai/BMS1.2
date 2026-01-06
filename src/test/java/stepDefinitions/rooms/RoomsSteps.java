package stepDefinitions.rooms;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RoomsPage;

public class RoomsSteps {

	RoomsPage roomsPage = new RoomsPage(BaseClass.getDriver());
	
	@Then("user is on the Rooms page")
	public void user_is_on_the_Rooms_page() {

		boolean roomsPageStatus = roomsPage.roomsPageConfirmation();
		Assert.assertTrue(roomsPageStatus);
	}
	
	@When("user updates selected room details")
	public void user_updates_selected_room_details() {
	    
	}

	@Then("user clicks on update room button")
	public void user_clicks_on_update_room_button() {
	    
	}

	@When("user opens rate plans section")
	public void user_opens_rate_plans_section() {
	    
	}

	@When("user clicks on edit rate plan")
	public void user_clicks_on_edit_rate_plan() {
	    
	}

	@When("user updates rate plan details")
	public void user_updates_rate_plan_details() {
	    
	}

	@Then("user clicks on update rate plan button")
	public void user_clicks_on_update_rate_plan_button() {
	    
	}
}
