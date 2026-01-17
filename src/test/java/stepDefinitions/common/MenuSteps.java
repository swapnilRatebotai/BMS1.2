package stepDefinitions.common;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.MenuPage;

public class MenuSteps {

	MenuPage menuPage = new MenuPage(BaseClass.getDriver());
	
	@When("user navigates to Bookings page")
	public void user_navigates_to_bookings_page() {

		menuPage.clickOnBookingsFromMenu();
	}
	
	@When("user navigates to Basic Info page")
	public void user_navigates_to_basic_info_page() {

		menuPage.clickOnPropertyDetailsFromMenu();
		menuPage.clickOnBasicInfoFromMenu();
	}
	
	@When("user navigates to Contacts page")
	public void user_navigates_to_contacts_page() {

		menuPage.clickOnContactsFromMenu();
	}
	
	@When("user navigates to Location page")
	public void user_navigates_to_location_page() {

		menuPage.clickOnLocationFromMenu();
	}
	
	@When("user navigates to Rooms page")
	public void user_navigates_to_rooms_page() {

		menuPage.clickOnRoomsFromMenu();
	}
	
	@When("user navigates to Photos and Videos page")
	public void user_navigates_to_photos_and_videos_page() {

		menuPage.clickOnPhotosAndVideosFromMenu();
	}
	
	@When("user navigates to Rate and Inventory page")
	public void user_navigates_to_rate_and_inventory_page() {

		menuPage.clickOnRatesAndInventoryFromMenu();
	}
	
	@When("user navigates to Cancellation Policy page")
	public void user_navigates_to_cancellation_policy_page() {

		menuPage.clickOnPolicyFromMenu();
		menuPage.clickOnCancellationPolicyFromMenu();
	}
	
	@When("user navigates to Payment Policy page")
	public void user_navigates_to_payment_policy_page() {

		menuPage.clickOnPaymentPolicyFromMenu();
	}
	
	@When("user navigates to Discounts page")
	public void user_navigates_to_discounts_page() {

		menuPage.clickOnDealsFromMenu();
		menuPage.clickOnDiscountsFromMenu();
	}
	
	@When("user navigates to Email Configuration page")
	public void user_navigates_to_email_configuration_page() {

		menuPage.clickOnEmailConfigurationFromMenu();
	}
	
	@When("user navigates to Payment Gateway page")
	public void user_navigates_to_payment_gateway_page() {

		menuPage.clickOnPaymentgatewayFromMenu();
	}
	
	@When("user navigates to Hotel Logo page")
	public void user_navigates_to_hotel_logo_page() {

		menuPage.clickOnHotelLogoFromMenu();
	}
	
	@When("user navigates to Channel Manager page")
	public void user_navigates_to_Channel_Manager_page() {

		menuPage.clickOnChannelManagerFromMenu();
	}
}
