package stepDefinitions.propertydetails;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.ContactsPage;

public class ContactsSteps {

	ContactsPage contactsPage = new ContactsPage(BaseClass.getDriver());
	
	@Then("user is on the Contacts page")
	public void user_is_on_the_Contacts_page() {

		boolean contactsPageStatus = contactsPage.contactsPageConfirmation();
		Assert.assertTrue(contactsPageStatus);
	}
}
