//package stepDefinitions;
//
//import java.io.IOException;
//
//import org.junit.Assert;
//
//import factory.BaseClass;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.BasicInfoPage;
//import pageObjects.BookingsPage;
//import pageObjects.CancellationPolicyPage;
//import pageObjects.ChannelManagerPage;
//import pageObjects.ContactsPage;
//import pageObjects.DiscountsPage;
//import pageObjects.EmailConfigurationPage;
//import pageObjects.HeaderPage;
//import pageObjects.HotelLogoPage;
//import pageObjects.LocationPage;
//import pageObjects.LoginPage;
//import pageObjects.MenuPage;
//import pageObjects.MyPropertiesPage;
//import pageObjects.PaymentGatewayPage;
//import pageObjects.PaymentPolicyPage;
//import pageObjects.PhotosAndVideosPage;
//import pageObjects.RateAndInventoryPage;
//import pageObjects.RoomsPage;
//
//public class PageNavigationSteps {
//
//	BasicInfoPage basicInfoPage = new BasicInfoPage(BaseClass.getDriver());
//	BookingsPage bookingsPage = new BookingsPage(BaseClass.getDriver());
//	CancellationPolicyPage cancellationPolicyPage = new CancellationPolicyPage(BaseClass.getDriver());
//	ChannelManagerPage channelManagerPage = new ChannelManagerPage(BaseClass.getDriver());
//	ContactsPage contactsPage = new ContactsPage(BaseClass.getDriver());
//	DiscountsPage discountsPage = new DiscountsPage(BaseClass.getDriver());
//	EmailConfigurationPage emailConfigurationPage = new EmailConfigurationPage(BaseClass.getDriver());
//	HeaderPage headerPage = new HeaderPage(BaseClass.getDriver());
//	HotelLogoPage hotelLogoPage = new HotelLogoPage(BaseClass.getDriver());
//	LocationPage locationPage = new LocationPage(BaseClass.getDriver());
//	LoginPage loginPage = new LoginPage(BaseClass.getDriver());
//	MenuPage menuPage = new MenuPage(BaseClass.getDriver());
//	MyPropertiesPage myPropertiesPage = new MyPropertiesPage(BaseClass.getDriver());
//	PaymentGatewayPage paymentGatewayPage = new PaymentGatewayPage(BaseClass.getDriver());
//	PaymentPolicyPage paymentPolicyPage = new PaymentPolicyPage(BaseClass.getDriver());
//	PhotosAndVideosPage photosAndVideosPage = new PhotosAndVideosPage(BaseClass.getDriver());
//	RateAndInventoryPage ratesAndInventoryPage = new RateAndInventoryPage(BaseClass.getDriver());
//	RoomsPage roomsPage = new RoomsPage(BaseClass.getDriver());
//	UserProfilePage upp = new UserProfilePage(BaseClass.getDriver());
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//
//		boolean loginPgStatus = loginPage.loginPageConfirmation();
//		Assert.assertTrue(loginPgStatus);
//	}
//
//	@When("user login with username as {string} and password as {string}")
//	public void user_login_with_username_as_and_password_as(String username, String password) {
//
//		BaseClass.getLogger().info("Entering username and password...");
//
//		loginPage.enterUsername(username);
//		loginPage.enterPassword(password);
//
//		BaseClass.getLogger().info("Click on Login Button...");
//
//		loginPage.clickOnLoginButton();
//	}
//
//	@When("user logs into the BMS application")
//	public void user_logs_into_the_BMS_application() throws IOException {
//
//		BaseClass.getLogger().info("Entering username and password...");
//
//		String username = BaseClass.getProperties().getProperty("username");
//		loginPage.enterUsername(username);
//		String password = BaseClass.getProperties().getProperty("password");
//		loginPage.enterPassword(password);
//
//		BaseClass.getLogger().info("Click on Login Button...");
//
//		loginPage.clickOnLoginButton();
//	}
//
//	@Then("Properties page should be displayed")
//	public void properties_page_should_be_displayed() {
//
//		BaseClass.getLogger().info("User is on My Properties Page...");
//
//		boolean myPropPageStatus = myPropertiesPage.myPropertiesPageConfirmation();
//		Assert.assertTrue(myPropPageStatus);
//	}
//
//	@When("user selects property from the property list")
//	public void user_selects_property_from_the_property_list() throws InterruptedException {
//
//		Thread.sleep(1000);
//		myPropertiesPage.clickOnPropertyHiltonStays();
//	}
//
//	@Then("Channel Manager page should be displayed")
//	public void channel_manager_page_should_be_displayed() {
//
//		boolean channelManagerPageStatus = channelManagerPage.channelManagerPageConfirmation();
//		Assert.assertTrue(channelManagerPageStatus);
//	}
//
//	@When("user navigates to Bookings page")
//	public void user_navigates_to_bookings_page() {
//
//		menuPage.clickOnBookingsFromMenu();
//	}
//
//	@Then("Bookings page should be displayed")
//	public void bookings_page_should_be_displayed() {
//
//		boolean bookingsPageStatus = bookingsPage.bookingsPageConfirmation();
//		Assert.assertTrue(bookingsPageStatus);
//	}
//
//	@When("user navigates to Basic Info page")
//	public void user_navigates_to_basic_info_page() {
//
//		menuPage.clickOnPropertyDetailsFromMenu();
//		menuPage.clickOnBasicInfoFromMenu();
//	}
//
//	@Then("Basic Info page should be displayed")
//	public void basic_info_page_should_be_displayed() {
//
//		boolean basicInfoPageStatus = basicInfoPage.basicInfoPageConfirmation();
//		Assert.assertTrue(basicInfoPageStatus);
//	}
//
//	@When("user navigates to Contacts page")
//	public void user_navigates_to_contacts_page() {
//
//		menuPage.clickOnContactsFromMenu();
//	}
//
//	@Then("Contacts page should be displayed")
//	public void contacts_page_should_be_displayed() {
//
//		boolean contactsPageStatus = contactsPage.contactsPageConfirmation();
//		Assert.assertTrue(contactsPageStatus);
//	}
//
//	@When("user navigates to Location page")
//	public void user_navigates_to_location_page() {
//
//		menuPage.clickOnLocationFromMenu();
//	}
//
//	@Then("Location page should be displayed")
//	public void location_page_should_be_displayed() {
//
//		boolean locationPageStatus = locationPage.locationPageConfirmation();
//		Assert.assertTrue(locationPageStatus);
//	}
//
//	@When("user navigates to Rooms page")
//	public void user_navigates_to_rooms_page() {
//
//		menuPage.clickOnRoomsFromMenu();
//	}
//
//	@Then("Rooms page should be displayed")
//	public void rooms_page_should_be_displayed() {
//
//		boolean roomsPageStatus = roomsPage.roomsPageConfirmation();
//		Assert.assertTrue(roomsPageStatus);
//	}
//
//	@When("user navigates to Photos and Videos page")
//	public void user_navigates_to_photos_and_videos_page() {
//
//		menuPage.clickOnPhotosAndVideosFromMenu();
//	}
//
//	@Then("Photos and Videos page should be displayed")
//	public void photos_and_videos_page_should_be_displayed() {
//
//		boolean photosAndVideosPageStatus = photosAndVideosPage.photosAndVideosPageConfirmation();
//		Assert.assertTrue(photosAndVideosPageStatus);
//	}
//
//	@When("user navigates to Rates and Inventory page")
//	public void user_navigates_to_rates_and_inventory_page() {
//
//		menuPage.clickOnRatesAndInventoryFromMenu();
//	}
//
//	@Then("Rates and Inventory page should be displayed")
//	public void rates_and_inventory_page_should_be_displayed() {
//
//		boolean ratesAndInventoryPageStatus = ratesAndInventoryPage.rateAndInventoryPageConfirmation();
//		Assert.assertTrue(ratesAndInventoryPageStatus);
//	}
//
//	@When("user navigates to Cancellation Policy page")
//	public void user_navigates_to_cancellation_policy_page() {
//
//		menuPage.clickOnPolicyFromMenu();
//		menuPage.clickOnCancellationPolicyFromMenu();
//	}
//
//	@Then("Cancellation Policy page should be displayed")
//	public void cancellation_policy_page_should_be_displayed() {
//
//		boolean cancellationPolicyPageStatus = cancellationPolicyPage.cancellationPolicyPageConfirmation();
//		Assert.assertTrue(cancellationPolicyPageStatus);
//	}
//
//	@When("user navigates to Payment Policy page")
//	public void user_navigates_to_payment_policy_page() {
//
//		menuPage.clickOnPaymentPolicyFromMenu();
//	}
//
//	@Then("Payment Policy page should be displayed")
//	public void payment_policy_page_should_be_displayed() {
//
//		boolean paymentPolicyPageStatus = paymentPolicyPage.PaymentPolicyPageConfirmation();
//		Assert.assertTrue(paymentPolicyPageStatus);
//	}
//
//	@When("user navigates to Discounts page")
//	public void user_navigates_to_discounts_page() {
//
//		menuPage.clickOnDealsFromMenu();
//		menuPage.clickOnDiscountsFromMenu();
//	}
//
//	@Then("Discounts page should be displayed")
//	public void discounts_page_should_be_displayed() {
//
//		boolean discountsPageStatus = discountsPage.discountsPageConfirmation();
//		Assert.assertTrue(discountsPageStatus);
//	}
//
//	@When("user navigates to Email Configuration page")
//	public void user_navigates_to_email_configuration_page() {
//
//		menuPage.clickOnEmailConfigurationFromMenu();
//	}
//
//	@Then("Email Configuration page should be displayed")
//	public void email_configuration_page_should_be_displayed() {
//
//		boolean emailConfigurationPageStatus = emailConfigurationPage.emailConfigurationPageConfirmation();
//		Assert.assertTrue(emailConfigurationPageStatus);
//	}
//
//	@When("user navigates to Payment Gateway page")
//	public void user_navigates_to_payment_gateway_page() {
//
//		menuPage.clickOnPaymentgatewayFromMenu();
//	}
//
//	@Then("Payment Gateway page should be displayed")
//	public void payment_gateway_page_should_be_displayed() {
//
//		boolean paymentGatewayPageStatus = paymentGatewayPage.paymentGatewayPageConfirmation();
//		Assert.assertTrue(paymentGatewayPageStatus);
//	}
//
//	@When("user navigates to Hotel Logo page")
//	public void user_navigates_to_hotel_logo_page() {
//
//		menuPage.clickOnHotelLogoFromMenu();
//	}
//
//	@Then("Hotel Logo page should be displayed")
//	public void hotel_logo_page_should_be_displayed() {
//
//		boolean hotelLogoPageStatus = hotelLogoPage.hotelLogoPageConfirmation();
//		Assert.assertTrue(hotelLogoPageStatus);
//	}
//
//	@When("user logs out from the BMS application")
//	public void user_logs_out_from_the_bms_application() {
//
//		headerPage.clickOnProfileOption();
//		headerPage.clickOnLogout();
//	}
//
//	@Then("user should be redirected to the login page")
//	public void user_should_be_redirected_to_the_login_page() {
//		loginPage.loginPageConfirmation();
//	}
//}
