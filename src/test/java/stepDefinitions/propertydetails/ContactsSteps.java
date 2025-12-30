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
	    
		String hotelphone = BaseClass.getProperties().getProperty("hotelPhone");
		contactsPage.updateHotelPhone(hotelphone);
		
		String hotelmobile = BaseClass.getProperties().getProperty("hotelMobile");
		contactsPage.updateHotelMobile(hotelmobile);
		
		String hotelemail = BaseClass.getProperties().getProperty("hotelEmail");
		contactsPage.updateHotelEmail(hotelemail);
		
		String phonelist = BaseClass.getProperties().getProperty("phoneList");
		contactsPage.updatePhoneList(phonelist);
		
		String website = BaseClass.getProperties().getProperty("hotelWebsite");
		contactsPage.updateWebsite(website);
		
		String emaillist = BaseClass.getProperties().getProperty("emailList");
		contactsPage.updateEmailList(emaillist);
		
		String customercarenumber = BaseClass.getProperties().getProperty("customerCareNumber");
		contactsPage.updateCustomerCareNumber(customercarenumber);
		
		String customerCareAsWhatsappnumber = BaseClass.getProperties().getProperty("useCustomerCareAsWhatsappNumber");
		String whatsappnumber = BaseClass.getProperties().getProperty("whatsappNumber");
		
		if(customerCareAsWhatsappnumber.equalsIgnoreCase("Yes")) {
			
			contactsPage.selectUseCustomerCareAsWhatsappYes();
		}
		else {
			
			contactsPage.selectUseCustomerCareAsWhatsappNo();
			contactsPage.updateWhatsappNumber(whatsappnumber);
		}
	}

	@When("user clicks on update contact button")
	public void user_clicks_on_update_contact_button() throws IOException {
	    
		contactsPage.clickOnUpdateContactButton();
		
		String actualMessage = contactsPage.waitAndGetSuccessMessage();
		String popupMsg = BaseClass.getProperties().getProperty("contactsPopupMessage");
	 	Assert.assertEquals(actualMessage, popupMsg);
	 	
	 	contactsPage.waitForSuccessPopupToDisappear();
	}
}
