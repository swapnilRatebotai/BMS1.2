package stepDefinitions.rooms;

import java.io.IOException;

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
	public void user_updates_selected_room_details() throws IOException {

		roomsPage.clickOnEditRoomButton();
		roomsPage.updateDisplayName();
		roomsPage.updateDescription();
		roomsPage.updateNumberOfRooms();
		roomsPage.updateRoomType();
		roomsPage.updateRoomView();
		roomsPage.updateBedType();
		roomsPage.updateExtraBedType();
		roomsPage.updateBaseAdults();
		roomsPage.updateMaximumAdults();
		roomsPage.updateChildBase();
		roomsPage.updateMaximumChildren();
		roomsPage.updateMaxPax();
	}

	@Then("user clicks on update room button")
	public void user_clicks_on_update_room_button() throws IOException {

		roomsPage.clickOnUpdateRoomButton();
		
		String actualMessageForRoom = roomsPage.waitAndGetSuccessMessageOfRoom();
		String popupMsgForRoom = BaseClass.getProperties().getProperty("UpdateRoomPopupMessage");
	 	Assert.assertEquals(actualMessageForRoom, popupMsgForRoom);
	 	
	 	roomsPage.waitForSuccessPopupOfRoomToDisappear();
	 	
	}

	@When("user opens rate plans section")
	public void user_opens_rate_plans_section() {

		roomsPage.clickOnShowRateplanButton();
	}

	@When("user updates rate plan details")
	public void user_updates_rate_plan_details() throws IOException {

		roomsPage.clickOnEPRateplanEditButton();
		roomsPage.updateRatePlanName();
	}

	@Then("user clicks on update rate plan button")
	public void user_clicks_on_update_rate_plan_button() throws IOException {
		
		roomsPage.clickOnUpdateRateplanButton();
		
		String actualMessageForRateplan = roomsPage.waitAndGetSuccessMessageOfRateplan();
		String popupMsgForRateplan = BaseClass.getProperties().getProperty("UpdateRateplanPopupMessage");
	 	Assert.assertEquals(actualMessageForRateplan, popupMsgForRateplan);
	}
}
