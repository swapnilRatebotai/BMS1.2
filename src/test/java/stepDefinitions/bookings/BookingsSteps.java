package stepDefinitions.bookings;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.BookingsPage;

public class BookingsSteps {

	BookingsPage bookingsPage = new BookingsPage(BaseClass.getDriver());
	
	@Then("user is on the Bookings page")
	public void user_is_on_the_Bookings_page() {

		boolean bookingsPageStatus = bookingsPage.bookingsPageConfirmation();
		Assert.assertTrue(bookingsPageStatus);
	}
}
