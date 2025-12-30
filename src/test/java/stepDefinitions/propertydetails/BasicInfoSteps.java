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
		
		String builtYear = BaseClass.getProperties().getProperty("builtyear");
		basicInfoPage.updateBuiltYear(builtYear);
		
		String numberOfRooms = BaseClass.getProperties().getProperty("numberofrooms");
		basicInfoPage.updateNumberOfRooms(numberOfRooms);
		
		String numberOfFloors = BaseClass.getProperties().getProperty("numberoffloors");
		basicInfoPage.updateNumberOfFloors(numberOfFloors);
		
		String checkInTime = BaseClass.getProperties().getProperty("checkintime");
		basicInfoPage.updateCheckInTime(checkInTime);
		
		String checkOutTime = BaseClass.getProperties().getProperty("checkouttime");
		basicInfoPage.updateCheckOutTime(checkOutTime);
	}

	@When("user clicks on save property details button")
	public void user_clicks_on_save_property_details_button() throws IOException {
	    
		basicInfoPage.clickOnSaveButton();
		
		String actualMessage = basicInfoPage.waitAndGetSuccessMessage();
		String popupMsg = BaseClass.getProperties().getProperty("basicinfopopupmessage");
	 	Assert.assertEquals(actualMessage, popupMsg);
	 	
	 	basicInfoPage.waitForSuccessPopupToDisappear();
	}
}
