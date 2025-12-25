package stepDefinitions.userprofile;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HeaderPage;
import pageObjects.LoginPage;
import pageObjects.MyPropertiesPage;
import pageObjects.UserProfilePage;

public class UserProfileSteps {

	HeaderPage headerPage = new HeaderPage(BaseClass.getDriver());
	MyPropertiesPage myPropertiesPage = new MyPropertiesPage(BaseClass.getDriver());
	LoginPage loginPage = new LoginPage(BaseClass.getDriver());
	UserProfilePage userProfilePage = new UserProfilePage(BaseClass.getDriver());
	
	
	@When("user navigates to My Profile page")
	public void user_navigates_to_my_profile_page() {
		
		headerPage.clickOnProfileOption();
		headerPage.clickOnMyProfile();
		
		boolean userProfilePageStatus = userProfilePage.userProfilePageConfirmation();
		Assert.assertTrue(userProfilePageStatus);
		
	}

	@When("user clicks on Edit Profile")
	public void user_clicks_on_edit_profile() {
	    
		userProfilePage.clickOnEditProfileButton();
	}

	@When("user updates profile details")
	public void user_updates_profile_details() throws IOException {
	    
		String firstName = BaseClass.getProperties().getProperty("firstname");
		userProfilePage.enterFirstName(firstName);
		
		String lastName = BaseClass.getProperties().getProperty("lastname");
		userProfilePage.enterLastName(lastName);
		
		String primaryNumber = BaseClass.getProperties().getProperty("primarynumber");
		userProfilePage.enterPrimaryNumber(primaryNumber);
		
		String secondaryNumber = BaseClass.getProperties().getProperty("secondarynumber");
		userProfilePage.enterSecondaryNumber(secondaryNumber);
	}

	@When("user clicks on Save Changes")
	public void user_clicks_on_save_changes() {
		
	    userProfilePage.clickOnSaveChangesButton();
	}

	@Then("profile details should be updated successfully")
	public void profile_details_should_be_updated_successfully() throws IOException {
	    
		 String actualMessage = userProfilePage.waitAndGetSuccessMessage();

//		    Assert.assertTrue(
//		        actualMessage.contains(expectedMessage),
//		        "Expected success message not shown"
//		    );
		 
		 	String popupMsg = BaseClass.getProperties().getProperty("userProfilePopupMessage");
		 	Assert.assertEquals(actualMessage, popupMsg);
	}

	@Then("user navigates back from the profile page")
	public void user_navigates_back_from_the_profile_page() {
		
		BaseClass.getDriver().navigate().back();
	   	myPropertiesPage.myPropertiesPageConfirmation();
	}
}
