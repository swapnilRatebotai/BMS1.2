package stepDefinitions.propertydetails;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasicInfoPage;

public class BasicInfoSteps {

	BasicInfoPage basicInfoPage = new BasicInfoPage(BaseClass.getDriver());
	
	@Then("user is on the Basic Info page")
	public void user_is_on_the_Basic_Info_page() {

		boolean basicInfoPageStatus = basicInfoPage.basicInfoPageConfirmation();
		Assert.assertTrue(basicInfoPageStatus);
	}
	
	@When("user updates property details")
	public void user_updates_property_details() throws IOException {
	    
		String description = BaseClass.getProperties().getProperty("description");
		basicInfoPage.updateDescription(description);
		
		String builtyear = BaseClass.getProperties().getProperty("builtYear");
		basicInfoPage.updateBuiltYear(builtyear);
		
		String numberofrooms = BaseClass.getProperties().getProperty("numberOfRooms");
		basicInfoPage.updateNumberOfRooms(numberofrooms);
		
		String numberoffloors = BaseClass.getProperties().getProperty("numberOfFloors");
		basicInfoPage.updateNumberOfFloors(numberoffloors);
		
		String checkintime = BaseClass.getProperties().getProperty("checkInTime");
		basicInfoPage.updateCheckInTime(checkintime);
		
		String checkouttime = BaseClass.getProperties().getProperty("checkOutTime");
		basicInfoPage.updateCheckOutTime(checkouttime);
	}

	@When("user clicks on save property details button")
	public void user_clicks_on_save_property_details_button() throws IOException {
	    
		basicInfoPage.clickOnSaveButton();
		
		String actualMessage = basicInfoPage.waitAndGetSuccessMessage();
		String popupMsg = BaseClass.getProperties().getProperty("basicInfoPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMsg);
	 	
	 	basicInfoPage.waitForSuccessPopupToDisappear();
	}
}
