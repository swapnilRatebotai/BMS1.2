package stepDefinitions.propertydetails;

import java.io.IOException;

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
	public void user_updates_contact_details() throws IOException {
	    
		
		contactsPage.updateHotelPhone();
		contactsPage.updateHotelMobile();
		contactsPage.updateHotelEmail();
		contactsPage.updatePhoneList();
		contactsPage.updateWebsite();
		contactsPage.updateEmailList();
		contactsPage.updateCustomerCareNumber();
		contactsPage.updateWhatsappNumber();
		
//		String customerCareAsWhatsappnumber = BaseClass.getProperties().getProperty("useCustomerCareAsWhatsappNumber");
//		String whatsappnumber = BaseClass.getProperties().getProperty("whatsappNumber");
//		
//		if(customerCareAsWhatsappnumber.equalsIgnoreCase("Yes")) {
//			
//			contactsPage.selectUseCustomerCareAsWhatsappYes();
//		}
//		else {
//			
//			contactsPage.selectUseCustomerCareAsWhatsappNo();
//			contactsPage.updateWhatsappNumber(whatsappnumber);
//		}
	}

	@When("user clicks on update contact button")
	public void user_clicks_on_update_contact_button() throws IOException {
	    
		contactsPage.clickOnUpdateContactButton();
		
		String actualMessage = contactsPage.waitAndGetSuccessMessage();
		String popupMessage = BaseClass.getProperties().getProperty("ContactsPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMessage);
	 	
	 	contactsPage.waitForSuccessPopupToDisappear();
	}
	
//	@Then("user enters the contact details")
//	public void user_enters_the_contact_details() {
//	    
//	}

	@Then("user saves the Contact details")
	public void user_saves_the_contact_details() throws IOException {
	    
		contactsPage.clickOnCreateContactButton();
		
		String actualMessage = contactsPage.waitAndGetSuccessMessage();
		String popupMessage = BaseClass.getProperties().getProperty("ContactsPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMessage);
	 	
	 	contactsPage.waitForSuccessPopupToDisappear();
	}
}
