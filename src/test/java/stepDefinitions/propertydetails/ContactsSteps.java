package stepDefinitions.propertydetails;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ContactsPage;

public class ContactsSteps {

	ContactsPage contactsPage = new ContactsPage(BaseClass.getDriver());
	
	@Then("user is on the Contacts page")
	public void user_is_on_the_Contacts_page() {

		boolean contactsPageStatus = contactsPage.contactsPageConfirmation();
		Assert.assertTrue(contactsPageStatus);
	}
	
	@When("user updates contact details")
	public void user_updates_contact_details() {
	    
	}

	@When("user clicks on update contact button")
	public void user_clicks_on_update_contact_button() {
	    
	}
}
