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
	    
		basicInfoPage.updateDescription();
		basicInfoPage.updateBuiltYear();
		basicInfoPage.updateNumberOfRooms();
		basicInfoPage.updateNumberOfFloors();
		basicInfoPage.updateCheckInTime();
		basicInfoPage.updateCheckOutTime();
	}

	@When("user clicks on save property details button")
	public void user_clicks_on_save_property_details_button() throws IOException {
	    
		basicInfoPage.clickOnSaveButton();
		
		String actualMessage = basicInfoPage.waitAndGetSuccessMessage();
		String popupMessage = BaseClass.getProperties().getProperty("BasicInfoPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMessage);
	 	
	 	basicInfoPage.waitForSuccessPopupToDisappear();
	}
	
	@Then("user enters the property details")
	public void user_enters_the_property_details() throws IOException {
	    
		basicInfoPage.enterPropertyName();
		basicInfoPage.enterDisplayName();
		basicInfoPage.updateDescription();
		basicInfoPage.selectPropertyType();
		basicInfoPage.selectStarRating();
		basicInfoPage.updateBuiltYear();
		basicInfoPage.updateNumberOfRooms();
		basicInfoPage.updateNumberOfFloors();
		basicInfoPage.selectCurrency();
		basicInfoPage.selectTimezone();
		basicInfoPage.updateCheckInTime();
		basicInfoPage.updateCheckOutTime();
	}

	@Then("user submits the property information")
	public void user_submits_the_property_information() {
	    
	}
}
