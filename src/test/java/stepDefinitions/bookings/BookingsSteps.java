package stepDefinitions.bookings;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookingsPage;

public class BookingsSteps {

	BookingsPage bookingsPage = new BookingsPage(BaseClass.getDriver());
	
	@Then("user is on the Bookings page")
	public void user_is_on_the_Bookings_page() {

		boolean bookingsPageStatus = bookingsPage.bookingsPageConfirmation();
		Assert.assertTrue(bookingsPageStatus);
	}
	
	@When("user selects from date and to date")
	public void user_selects_from_date_and_to_date() throws IOException, InterruptedException {
	    
		bookingsPage.selectFromDate();
		bookingsPage.selectToDate();
//		bookingsPage.selectTodaysDate();
		
	}

	@When("user selects booking status as confirmed")
	public void user_selects_booking_status_as_confirmed() {
	    
		bookingsPage.selectBookingStatusToConfirmed();
		bookingsPage.confirmedBookingStatusConfirmation();
		
	}

	@When("user selects booking status as cancelled")
	public void user_selects_booking_status_as_cancelled() {
	    
		bookingsPage.selectBookingStatusToCancelled();
		bookingsPage.cancelledBookingStatusConfirmation();
	}
	
	@When("user clicks on WhatsApp connect to contact customer")
	public void user_clicks_on_whats_app_connect_to_contact_customer() {
	    
		bookingsPage.clickOnWhatsappToConnectCustomer();
	}


	@When("user selects booking filter as check-in")
	public void user_selects_booking_filter_as_check_in() {
	    
		bookingsPage.selectCheckinFilter();
	}

	@When("user selects booking filter as check-out")
	public void user_selects_booking_filter_as_check_out() {
	    
		bookingsPage.selectCheckoutFilter();
	}
}
